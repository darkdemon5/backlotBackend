package com.darkdemon.backlotBackend.model;

import com.darkdemon.backlotBackend.enums.RatingSystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {

    int id;
    User user;
    String tmdbId;
    String mediaType; // Movie | TV | Kids
    RatingSystem ratings;
    String Review;
    boolean containsSpoilers;
    int likes;
    Date createdAt;
    Date updatedAt;
}
