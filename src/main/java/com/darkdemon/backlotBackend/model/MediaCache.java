package com.darkdemon.backlotBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaCache {
    int id;
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
