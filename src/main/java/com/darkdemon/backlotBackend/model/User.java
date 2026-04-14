package com.darkdemon.backlotBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    ObjectId id;
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
    String googleId; //String | null
    Date createdAt;
    Date updatedAt;
}
