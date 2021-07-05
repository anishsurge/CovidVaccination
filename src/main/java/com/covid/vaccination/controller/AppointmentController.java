package com.covid.vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid.vaccination.dto.AppointmentDTO;
import com.covid.vaccination.dto.UpdateStatusDTO;
import com.covid.vaccination.dto.UserDTO;
import com.covid.vaccination.entities.VaccineRegistrations;
import com.covid.vaccination.entities.appointments.AppointmentDetails;
import com.covid.vaccination.services.AppointmentService;

@RestController
@CrossOrigin
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping(path = "/covidVaccination/scheduleAppointment")
	public AppointmentDetails scheduleAppointment(@RequestBody AppointmentDTO appointment) {
		return appointmentService.scheduleAppointment(appointment);
	}
	
	@PostMapping(path = "/covidVaccination/updateStatus")
	public VaccineRegistrations updateStatus(@RequestBody UpdateStatusDTO updateStatus) {
		return appointmentService.updateStatus(updateStatus);
	}
}
