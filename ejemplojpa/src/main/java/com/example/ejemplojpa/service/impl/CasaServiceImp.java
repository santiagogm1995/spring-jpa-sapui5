package com.example.ejemplojpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejemplojpa.domain.Casa;
import com.example.ejemplojpa.repository.CasaRepo;
import com.example.ejemplojpa.service.RestService;

@Service
public class CasaServiceImp implements RestService<Casa, String>{
	
	@Autowired
	private CasaRepo casaRepo;
	
	@Override
	public List<Casa> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Casa obj) {
		
	}

	@Override
	public void saveAll(List<Casa> objs) {
		casaRepo.saveAll(objs);
	}

}
