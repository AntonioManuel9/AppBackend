package com.appinicio.pruebas.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.model.core.ID;

@Service
public class UserService implements UserInterface {

	private UserRepository userRepository;
	
	//Método encargado de buscar por el id que le pasemos
	public List<User> getById(ID id) {
		return this.userRepository.findById(id);
	}
	
	//Método que cuenta todos los registros que tenemos en la tabla
	public long contarReg() {
		return this.userRepository.count();
	}

	@Override
	public UserDTO create(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> delete(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> update(User u) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
