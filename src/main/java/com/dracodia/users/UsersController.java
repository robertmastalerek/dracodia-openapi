package com.dracodia.users;

import com.dracodia.openapi.api.UsersApiDelegate;
import com.dracodia.openapi.model.CreateUserRequest;
import com.dracodia.openapi.model.User;
import com.dracodia.openapi.model.UserType;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersController implements UsersApiDelegate {

    private final UsersService usersService;

    @Override
    public ResponseEntity<List<User>> usersList(UserType userType) {
        return ResponseEntity.ok(usersService.getUsers(userType));
    }

    @Override
    public ResponseEntity<User> createUser(CreateUserRequest request) {
        return ResponseEntity.ok(usersService.createUser(request));
    }
}
