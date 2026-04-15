package com.darkdemon.backlotBackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreferenceDataDto {
    String language;
    String region;
    List<Integer> genre;
    boolean isAdult;
    int birthyear;
    boolean showAdultContent;

}
