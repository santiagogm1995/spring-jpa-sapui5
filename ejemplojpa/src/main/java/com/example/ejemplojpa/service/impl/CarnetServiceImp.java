package com.example.ejemplojpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemplojpa.domain.Carnet;
import com.example.ejemplojpa.repository.CarnetRepo;
import com.example.ejemplojpa.service.RestService;

@Service
public class CarnetServiceImp implements RestService<Carnet, Long> {
	
	@Autowired
	private CarnetRepo carnetRepo;

	@Override
	public List<Carnet> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Carnet obj) {
		carnetRepo.save(obj);
	}

	@Override
	public void saveAll(List<Carnet> objs) {
		// TODO Auto-generated method stub
		
	}

}
