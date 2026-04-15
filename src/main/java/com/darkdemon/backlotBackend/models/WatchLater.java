package com.darkdemon.backlotBackend.models;

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
public class WatchLater {

    @Id
    ObjectId id;
    ObjectId userId;
    String tmdbId;
    String mediaType;
    Date addedAt;
}
