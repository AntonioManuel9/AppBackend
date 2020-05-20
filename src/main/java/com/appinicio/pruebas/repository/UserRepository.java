package com.appinicio.pruebas.repository;

import org.springframework.data.repository.CrudRepository;

import com.appinicio.pruebas.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
}
