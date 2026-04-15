package com.darkdemon.backlotBackend.services;

import com.darkdemon.backlotBackend.DTO.GetUserDto;
import com.darkdemon.backlotBackend.models.User;
import com.darkdemon.backlotBackend.repositories.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public ResponseEntity<?> getUser(String userName){
        User user = userRepo.findByUserName(userName).orElseThrow(() -> new RuntimeException("User not found"));

        GetUserDto getUserDto = new GetUserDto();
        getUserDto.setName(user.getName());
        getUserDto.setUserName(user.getUserName());
        getUserDto.setEmail(user.getEmail());
        getUserDto.setBirthYear(user.getBirthyear());
        getUserDto.setAbout(user.getAbout());
        getUserDto.setAvatar(user.getAvatar());
        getUserDto.setRole(user.getRole());
        getUserDto.setAdult(user.isAdult());
        getUserDto.setLanguage(user.getLanguage());
        getUserDto.setRegion(user.getRegion());
        getUserDto.getGenre(user.getGenre());
        getUserDto.setShowAdultContent(user.isShowAdultContent());
        getUserDto.setTheme(user.getTheme());
        getUserDto.setCreatedAt(user.getCreatedAt());
        return ResponseEntity.status(HttpStatus.FOUND).body(Map.of("message","User Found!!", "userData", getUserDto));
    }
}
