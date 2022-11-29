package com.healthservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.healthservices.dao.AffiliatesDao;
import com.healthservices.model.Affiliates;

@Service
public class AffiliatesServicesImpl implements AffiliatesServices{

	@Autowired
	private AffiliatesDao affiliatesDao;
	
	@Override
	@Transactional(readOnly = false)
	public Affiliates save(Affiliates affiliates) {
		return affiliatesDao.save(affiliates);
	}

	@Override
	@Transactional(readOnly = true)
	public Affiliates findById(Integer id) {
		return affiliatesDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		affiliatesDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Affiliates> findAll() {
		return (List<Affiliates>) affiliatesDao.findAll() ;
	}

	@Override
	@Transactional(readOnly = false)
	public Affiliates update(Affiliates affiliates) {
		return affiliatesDao.save(affiliates);
		
	}

}
