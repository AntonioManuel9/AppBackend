package com.appinicio.pruebas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appinicio.pruebas.dto.UserDTO;
import com.appinicio.pruebas.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/findById")
	@ResponseBody
	public UserDTO obtenerRegistro() {
		return this.userService.getById(1);
	}
	
	public ResponseEntity<UserDTO> getUser() {
		return new ResponseEntity<UserDTO>("Usuario obtenido ", UserDTO);
	}
}
