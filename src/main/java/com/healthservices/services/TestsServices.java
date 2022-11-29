package com.healthservices.services;

import java.util.List;

import com.healthservices.model.Tests;

public interface TestsServices {

	public Tests save(Tests tests);
	
	public Tests findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Tests> findAll();
	
	public Tests update(Tests tests);
	
	
}
