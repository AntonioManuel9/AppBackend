package com.appinicio.pruebas.services;

import java.util.List;

import com.appinicio.pruebas.dto.UserDTO;
import com.appinicio.pruebas.entity.User;
import com.sun.xml.bind.v2.model.core.ID;

public interface UserService {
	
	UserDTO create(User u);
	
	List<User> delete(ID id);
	
	List<User> update(User u);
	
	UserDTO getById(long id);
}
