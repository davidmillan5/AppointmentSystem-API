package com.healthservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthservices.model.Affiliates;

public interface AffiliatesDao extends JpaRepository<Affiliates, Integer> {

}
