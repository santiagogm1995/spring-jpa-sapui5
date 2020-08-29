package com.example.ejemplojpa.service;

import java.util.List;

public interface RestService<T,K> {
	
	public List<T> getAll();
	
	public void save(T obj);
	
	public void saveAll(List<T> objs );

}
