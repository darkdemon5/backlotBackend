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
public class Notifications {

    int id;
    User user;
    String type;
    String message;
    boolean idRead;
    Date createdAt;
}
