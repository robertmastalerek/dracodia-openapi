package com.dracodia.users;

import com.dracodia.openapi.model.User;
import java.util.UUID;
import java.util.function.Function;

public class UserConverterFunction implements Function<UserData, User> {

    @Override
    public User apply(UserData userData) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setFirstName(userData.getFirstName());
        user.setLastName(userData.getLastName());
        user.setAge(userData.getAge());
        user.setAccountBalance(userData.getAccountBalance());
        return user;
    }
}
