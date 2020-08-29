package com.example.ejemplojpa.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejemplojpa.domain.Carnet;
import com.example.ejemplojpa.domain.Casa;
import com.example.ejemplojpa.domain.Persona;
import com.example.ejemplojpa.service.impl.CarnetServiceImp;
import com.example.ejemplojpa.service.impl.CasaServiceImp;
import com.example.ejemplojpa.service.impl.PersonaServiceImp;

@RestController
public class PersonaController {
	
	@Autowired
    PersonaServiceImp servicePersona;
	@Autowired
	CasaServiceImp serviceCasa;
	@Autowired
	CarnetServiceImp serviceCarnet;

	
	@GetMapping(value = "/gendata")
	public void genData() {
		Carnet carnet = new Carnet(new Long("1111111"), new Persona() , new Date(), new Date());
		List<Casa> casas = new ArrayList<>();
		casas.add(new Casa("Calle perdida", new Persona()));
		Persona p = new Persona("70066622P", "Santiago", "Gonzalez", carnet, casas);
		carnet.setPersona(p);
		casas.forEach(obj -> obj.setPersona(p));
		
		//serviceCasa.saveAll(casas);
		//serviceCarnet.save(carnet);
		servicePersona.save(p);
	}
	
	@GetMapping(value = "/personas")
	public List<Persona> getPersonas() {
		return servicePersona.getAll();
	}
}
