package com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.utils;

import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.domain.Cargo;
import com.thymeleafspringlearningudemy.thymeleafspringlearningudemy.services.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToCargoConversor implements Converter<String, Cargo> {

	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String text) {
		if (text.isEmpty()) {
			return null;
		}

		Long id = Long.valueOf(text);
        
		return service.buscarPorId(id);
	}
    
}
