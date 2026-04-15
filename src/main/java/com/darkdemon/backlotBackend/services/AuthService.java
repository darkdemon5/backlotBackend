package com.darkdemon.backlotBackend.services;

import com.darkdemon.backlotBackend.DTO.SignupUserDto;
import com.darkdemon.backlotBackend.models.User;
import com.darkdemon.backlotBackend.repositories.UserRepo;
import com.darkdemon.backlotBackend.security.SecurityConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class AuthService {

    private final UserRepo userRepo;
    private final SecurityConfig securityConfig;

    public AuthService(UserRepo userRepo, SecurityConfig securityConfig){
        this.userRepo = userRepo;
        this.securityConfig = securityConfig;
    }

    @Transactional
    public ResponseEntity<?> signUp(SignupUserDto signupUserDto){
        User user = new User();
        user.setName(signupUserDto.getName());
        user.setUserName(signupUserDto.getUserName());
        user.setEmail(signupUserDto.getEmail());
        user.setPassword(securityConfig.passwordEncoder().encode(signupUserDto.getPassword()));
        user.setRole("User");
        user.setCreatedAt(signupUserDto.getCreatedAt());
        userRepo.save(user);
        return ResponseEntity.ok("Done");
    }
}
