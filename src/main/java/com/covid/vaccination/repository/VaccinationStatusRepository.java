package com.covid.vaccination.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.vaccine.VaccinationStatus;

public interface VaccinationStatusRepository extends CrudRepository<VaccinationStatus, Integer> {

}
