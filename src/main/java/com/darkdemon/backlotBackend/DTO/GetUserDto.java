package com.darkdemon.backlotBackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Year;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDto {
    String name;
    String userName;
    String email;
    Year birthYear;
    String about;
    String avatar;
    String role;
    boolean isAdult;
    private String language;
    private String region;
    private List<Integer> genre;// genre class array
    private boolean showAdultContent;
    String theme;
    String createdAt;

    public void getGenre(List<Integer> genre) {
        this.genre = genre;
    }
}
