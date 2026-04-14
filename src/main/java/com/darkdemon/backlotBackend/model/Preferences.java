package com.darkdemon.backlotBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Preferences {
    String language;
    String region;
    List<Integer> genre = new ArrayList<>();// genre class array
    boolean showAdultContent;
}
