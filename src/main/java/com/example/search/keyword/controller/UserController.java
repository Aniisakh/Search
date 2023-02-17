package com.example.search.keyword.controller;

import com.example.search.keyword.model.CreateUserRequest;
import com.example.search.keyword.serviceImpl.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<UUID> createUser(@RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.createUser(createUserRequest));
    }
}
