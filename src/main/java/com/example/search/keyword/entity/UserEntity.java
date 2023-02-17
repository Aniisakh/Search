package com.example.search.keyword.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String lastname;
    private String firstname;
    private String email;

    public UserEntity(String lastname, String firstname, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
    }
}
