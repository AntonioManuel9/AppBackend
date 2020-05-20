package com.appinicio.pruebas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appinicio.pruebas.dto.UserDTO;
import com.appinicio.pruebas.entity.User;
import com.appinicio.pruebas.mappers.UserConverter;
import com.appinicio.pruebas.repository.UserRepository;
import com.sun.xml.bind.v2.model.core.ID;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserConverter userConverter;
	
	//Método encargado de buscar por el id que le pasemos
	public UserDTO getById(long id) {
		return convertToDTO(this.userRepository.findById(id).get());
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
	
	private UserDTO convertToDTO(User usuario) {
		return userConverter.convert(usuario, UserDTO.class, "userMapper", null);
	}
}
