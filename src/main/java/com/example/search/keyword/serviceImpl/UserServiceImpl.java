package com.example.search.keyword.serviceImpl;

import com.example.search.keyword.model.CreateUserRequest;
import com.example.search.keyword.entity.UserEntity;
import com.example.search.keyword.repository.UserRepository;
import com.example.search.keyword.service.UserService;
import com.example.search.keyword.utils.ParentType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final KeywordServiceImpl keywordService;

    public UUID createUser(CreateUserRequest createUserRequest) {

        var userEntity = new UserEntity(
                createUserRequest.getLastname(),
                createUserRequest.getFirstname(),
                createUserRequest.getEmail());

        var user = userRepository.save(userEntity);
        keywordService.createKeyword(user.getId(), ParentType.USERS, "firstname", user.getFirstname());
        keywordService.createKeyword(user.getId(), ParentType.USERS, "lastname", user.getLastname());

        return user.getId();
    }
}
