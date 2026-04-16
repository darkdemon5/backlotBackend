package com.darkdemon.backlotBackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupUserDto {
    String name;
    String userName;
    String email;
    String password;
    String role;
    String createdAt;
}
