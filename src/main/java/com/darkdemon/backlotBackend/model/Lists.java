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
public class Lists {

    int id;
    User user;
    String description;
    boolean isPublic;
    Items[] items;
    Date createdAt;
    Date updatedAt;
}
