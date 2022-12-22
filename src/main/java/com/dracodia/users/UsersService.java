package com.dracodia.users;

import static com.dracodia.users.UserType.SPECIAL;
import static com.dracodia.users.UserType.STANDARD;

import com.dracodia.openapi.model.CreateUserRequest;
import com.dracodia.openapi.model.User;
import com.dracodia.openapi.model.UserType;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final List<UserData> users = List.of(
            UserData.builder().firstName("Jan").lastName("Kowalski").age(42).accountBalance(new BigDecimal("645.53")).type(STANDARD).build(),
            UserData.builder().firstName("Zenon").lastName("Nowak").age(57).accountBalance(new BigDecimal("789.46")).type(STANDARD).build(),
            UserData.builder().firstName("Marta").lastName("Przybysz").age(24).accountBalance(new BigDecimal("5622.23")).type(SPECIAL).build(),
            UserData.builder().firstName("Natalia").lastName("Kwaśniewska").age(17).accountBalance(new BigDecimal("3677.66")).type(STANDARD).build(),
            UserData.builder().firstName("Albert").lastName("Miszak").age(31).accountBalance(new BigDecimal("856.29")).type(STANDARD).build(),
            UserData.builder().firstName("Krzysztof").lastName("Radomski").age(64).accountBalance(new BigDecimal("63.02")).type(STANDARD).build(),
            UserData.builder().firstName("Jakub").lastName("Wiśniewski").age(23).accountBalance(new BigDecimal("463.53")).type(STANDARD).build(),
            UserData.builder().firstName("Krystyna").lastName("Starak").age(19).accountBalance(new BigDecimal("7684.99")).type(STANDARD).build(),
            UserData.builder().firstName("Olgierd").lastName("Polak").age(71).accountBalance(new BigDecimal("8769.22")).type(SPECIAL).build()
    );

    public List<User> getUsers(UserType userType) {
        return users.stream()
                .filter(u -> u.getType().name().equals(userType.name()))
                .map(u -> new UserConverterFunction().apply(u))
                .toList();
    }

    public User createUser(CreateUserRequest request) {
        return request.getUser();
    }
}
