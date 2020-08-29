package com.example.ejemplojpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ejemplojpa.domain.Carnet;

public interface CarnetRepo extends CrudRepository<Carnet, Long> {

}
