package com.example.search.keyword.service;

import com.example.search.keyword.model.CreateUserRequest;
import java.util.UUID;

public interface UserService {
    UUID createUser(CreateUserRequest createUserRequest);
}
