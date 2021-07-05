package com.covid.vaccination.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.vaccination.entities.appointments.AppointmentDetails;

public interface AppointmentRepository extends CrudRepository<AppointmentDetails, Long> {

}
