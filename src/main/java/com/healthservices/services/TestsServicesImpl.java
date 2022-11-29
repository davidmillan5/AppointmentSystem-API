package com.healthservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthservices.dao.TestsDao;
import com.healthservices.model.Tests;

@Service
public class TestsServicesImpl implements TestsServices{
	
	
	@Autowired
	private TestsDao testDao;

	@Override
	@Transactional(readOnly = false)
	public Tests save(Tests tests) {
		return testDao.save(tests);
	}

	@Override
	@Transactional(readOnly = true)
	public Tests findById(Integer id) {
		return testDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		testDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Tests> findAll() {
		return (List<Tests>)testDao.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public Tests update(Tests tests) {
		return testDao.save(tests);
	}

}
