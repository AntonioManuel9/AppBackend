package com.appinicio.pruebas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.appinicio.pruebas.mappers.UserConverter;

import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class MapperCofiguration {

	@Autowired
	@Qualifier("userMapper")
	private UserConverter userConverter;
	
	public void registerConfigurableMappers(DefaultMapperFactory mapperFactory) {
		 
        userConverter.configure(mapperFactory);
    }
}
