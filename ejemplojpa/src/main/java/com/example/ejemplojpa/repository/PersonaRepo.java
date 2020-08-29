package com.example.ejemplojpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ejemplojpa.domain.Persona;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {

}
