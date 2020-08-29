package com.example.ejemplojpa.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ejemplojpa.domain.Persona;
import com.example.ejemplojpa.repository.PersonaRepo;
import com.example.ejemplojpa.service.RestService;

@Service
public class PersonaServiceImp implements RestService<Persona, String> {

	@Autowired
	private PersonaRepo personaRepo;
	
	
	@Override
	public List<Persona> getAll() {
		return (List<Persona>) personaRepo.findAll();
	}


	@Override
	public void save(Persona obj) {
		personaRepo.save(obj);
	}


	@Override
	public void saveAll(List<Persona> objs) {
		// TODO Auto-generated method stub
		
	}
	
}
