package com.appinicio.pruebas.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@SuppressWarnings("deprecation")
	@GetMapping("/getUser")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<UserDTO> getUser() {
		Date fecha= new Date(120, 4, 21);
		UserDTO user = new UserDTO();
		
		user.setNombre("Pedro");
		user.setApellidos("Ramírez");
		user.setUserCaixa("123456");
		user.setUserEveris("Pedro1");
		user.setContraseña("everis");
		user.setFecCreacion(fecha);
		user.setFecMod(fecha);
		user.setFecUltAcceso(fecha);
		
		return new ResponseEntity<UserDTO>(user, HttpStatus.CREATED);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/getUserList")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200")
	public List<UserDTO> getUserList() {
		Date fecha= new Date(120, 4, 21);
		Date fecha2= new Date(120, 4, 22);
		
		UserDTO user1 = new UserDTO();
		UserDTO user2 = new UserDTO();
		
		List<UserDTO> usuarios = new ArrayList<>();
		
		user1.setId(1);
		user1.setNombre("Pedro");
		user1.setApellidos("Ramírez");
		user1.setUserCaixa("123456");
		user1.setUserEveris("Pedro1");
		user1.setContraseña("everis");
		user1.setFecCreacion(fecha);
		user1.setFecMod(fecha);
		user1.setFecUltAcceso(fecha);
		
		user2.setId(2);
		user2.setNombre("Juan");
		user2.setApellidos("Jimenez");
		user2.setUserCaixa("654321");
		user2.setUserEveris("Juanito");
		user2.setContraseña("everis230");
		user2.setFecCreacion(fecha2);
		user2.setFecMod(fecha2);
		user2.setFecUltAcceso(fecha2);
		
		usuarios.add(user1);
		usuarios.add(user2);
		
		return usuarios;
	}
}
