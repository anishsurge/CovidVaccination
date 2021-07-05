package com.covid.vaccination.repository;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.vaccine.VaccinationCenters;

public interface VaccinationCenterRepository extends CrudRepository<VaccinationCenters, Long>{

}
