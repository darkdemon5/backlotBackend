package com.darkdemon.backlotBackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private ObjectId id;
    private String name;
    private String userName;
    private String email;
    private String password; //hashed
    private Year birthyear;
    private String about;
    private String avatar; //URL
    private String role; // User | Admin
    private boolean isAdult;
    private String language;
    private String region;
    private List<Integer> genre;// genre class array
    private boolean showAdultContent;
    private String theme; // Light | Dark
    private String googleId; //String | null
    private String createdAt;
    private String updatedAt;
}
