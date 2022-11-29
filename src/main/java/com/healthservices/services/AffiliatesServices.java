package com.healthservices.services;

import java.util.List;

import com.healthservices.model.Affiliates;

public interface AffiliatesServices {

	//Metodos a utilizar
	
	public Affiliates save(Affiliates affiliates);
	
	public Affiliates findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Affiliates> findAll();
	
	public Affiliates update(Affiliates affiliates);
	
	
}
