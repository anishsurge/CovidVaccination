package com.covid.vaccination.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.VaccineRegistrations;

public interface VaccineRegistrationsRepository extends CrudRepository<VaccineRegistrations, Long>{

}
