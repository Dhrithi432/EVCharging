package com.group1.evcharging.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.group1.evcharging.dto.UserRegistrationDto;
import com.group1.evcharging.model.User;

public interface UserService {

    User registerNewUser(UserRegistrationDto registrationDto);

}
