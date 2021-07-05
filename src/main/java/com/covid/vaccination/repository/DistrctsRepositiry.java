package com.covid.vaccination.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.regions.Districts;
import com.covid.vaccination.entities.regions.StateDetails;

public interface DistrctsRepositiry extends CrudRepository<Districts, Long> {

}
