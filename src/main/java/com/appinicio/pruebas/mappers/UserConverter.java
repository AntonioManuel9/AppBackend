package com.appinicio.pruebas.mappers;

import org.springframework.stereotype.Component;

import com.appinicio.pruebas.dto.UserDTO;
import com.appinicio.pruebas.entity.User;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component("userMapper")
public class UserConverter extends ConfigurableMapper {
	
	@Override
	public void configure(MapperFactory factory) {
        factory.classMap(User.class, UserDTO.class)
                .byDefault()
                .register();
    }
	
}
