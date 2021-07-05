package com.covid.vaccination.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.VaccineRegistrations;

public interface RegistrationsRepository extends CrudRepository<VaccineRegistrations, Long> {
	
}
