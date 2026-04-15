package com.darkdemon.backlotBackend.controllers;

import com.darkdemon.backlotBackend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/me")
    private ResponseEntity<?> getUser(@RequestBody String userName){
        return userService.getUser(userName);
    }
}
