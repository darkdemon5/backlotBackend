package com.darkdemon.backlotBackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    String tmdbId;
    String mediaType;
    Date addedAt;
}
