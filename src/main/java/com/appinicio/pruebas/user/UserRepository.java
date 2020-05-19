package com.appinicio.pruebas.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sun.xml.bind.v2.model.core.ID;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findById(ID id);
	
	long count();
	
	User save();
	
}
