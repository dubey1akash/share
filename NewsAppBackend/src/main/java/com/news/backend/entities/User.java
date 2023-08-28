package com.news.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;

    private String userName;

    private String email;

    @JsonIgnore
    private String password;

    private String firstName;

    private String lastName;

    private Boolean subscription;

    private Date createdAt;
}
