package com.healthservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthservices.model.Tests;



public interface AppointmentDao extends JpaRepository<Tests, Integer>{

}
