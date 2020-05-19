package com.appinicio.pruebas.user;

import java.util.List;

import com.sun.xml.bind.v2.model.core.ID;

public interface UserInterface {
	
	UserDTO create(User u);
	
	List<User> delete(ID id);
	
	List<User> update(User u);
}
