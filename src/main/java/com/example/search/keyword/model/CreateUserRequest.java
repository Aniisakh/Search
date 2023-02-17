package com.example.search.keyword.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateUserRequest {
    private String lastname;
    private String firstname;
    private String email;
}
