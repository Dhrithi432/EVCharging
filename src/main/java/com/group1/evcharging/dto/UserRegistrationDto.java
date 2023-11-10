package com.group1.evcharging.dto;

import com.group1.evcharging.model.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {
	private String username;
	private String password;
	private Role role;
}
