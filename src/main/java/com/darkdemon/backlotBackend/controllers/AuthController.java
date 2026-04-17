package com.darkdemon.backlotBackend.controllers;

import com.darkdemon.backlotBackend.DTO.LoginDto;
import com.darkdemon.backlotBackend.DTO.SignupUserDto;
import com.darkdemon.backlotBackend.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody SignupUserDto signupUserDto){
        return authService.signUp(signupUserDto);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto){
        return authService.login(loginDto);
    }
}
