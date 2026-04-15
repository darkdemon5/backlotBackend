package com.darkdemon.backlotBackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaCache {
    @Id
    ObjectId id;
    String tmdbId;
    String mediaType; //Movie, TV, Kids
    String title;
    String posterPath;
    String backdropPath;
    String infoShort;
    String info;
    List<Integer> genre = new ArrayList<>();//Genre class
    String releaseDate;
    int voteAverage;
    boolean adult;
    Date cacheAt;

}
