package com.darkdemon.backlotBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    int id;
    String name;
    String userName;
    String email;
    String password; //hashed
    Date birthdate;
    String about;
    String avatar; //URL
    String role; // User | Admin
    boolean isAdult;
    Preferences preferences;
    String theme; // Light | Dark
    String joinedGoogle; //String | null
    Date createdAt;
    Date updatedAt;
}
