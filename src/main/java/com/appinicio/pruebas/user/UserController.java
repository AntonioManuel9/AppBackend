package com.appinicio.pruebas.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.xml.bind.v2.model.core.ID;

@Controller
@RequestMapping("/consultasSql")
public class UserController {

	@Autowired
	public UserService userService;
	
	public List<User> obtenerRegistro(ID id) {
		return this.userService.getById(id);
	}
}
