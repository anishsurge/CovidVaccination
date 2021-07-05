package com.covid.vaccination.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.vaccination.dto.AppointmentDTO;
import com.covid.vaccination.dto.UpdateStatusDTO;
import com.covid.vaccination.entities.VaccineRegistrations;
import com.covid.vaccination.entities.appointments.AppointmentDetails;
import com.covid.vaccination.entities.vaccine.VaccinationCenters;
import com.covid.vaccination.repository.AppointmentRepository;
import com.covid.vaccination.repository.VaccinationCenterRepository;
import com.covid.vaccination.repository.VaccinationStatusRepository;
import com.covid.vaccination.repository.VaccineRegistrationsRepository;

@Service
public class AppointmentService {

	@Autowired
	VaccinationCenterRepository vaccinationCenterRepository;

	@Autowired
	AppointmentRepository appointmentRepository;

	@Autowired
	VaccineRegistrationsRepository registrationsRepository;

	@Autowired
	VaccinationStatusRepository vaccinationStatusRepository;

	public AppointmentDetails scheduleAppointment(AppointmentDTO appointment) {
		VaccinationCenters vacCenter = vaccinationCenterRepository.findById(appointment.getVaccinationCenterId())
				.orElseGet(null);
		VaccineRegistrations user = registrationsRepository.findById(appointment.getUserId()).orElse(null);
		AppointmentDetails appointmentDetails = appointmentRepository
				.save(new AppointmentDetails(appointment.getDoseNo(), LocalDate.parse(appointment.getDate()),
						LocalTime.parse(appointment.getStartTime()), LocalTime.parse(appointment.getEndTime()),
						vacCenter, user));
		if (appointment.getDoseNo() == 1) {
			user.setVaccinationStatus(vaccinationStatusRepository.findById(2).get());
		} else if (appointment.getDoseNo() == 2) {
			user.setVaccinationStatus(vaccinationStatusRepository.findById(4).get());
		}
		registrationsRepository.save(user);
		return appointmentDetails;
	}

	public VaccineRegistrations updateStatus(UpdateStatusDTO updateStatus) {
		VaccineRegistrations user = null;;
		Optional<VaccineRegistrations> optUser = registrationsRepository.findById(updateStatus.getUserId());
		if(optUser.isPresent()) {
			user = optUser.get();
			if(updateStatus.getDoseNo() == 1) {
				user.setVaccinationStatus(vaccinationStatusRepository.findById(3).orElse(null));
			}else if(updateStatus.getDoseNo() == 2) {
				user.setVaccinationStatus(vaccinationStatusRepository.findById(5).orElse(null));
			}
		}
		return user;
	}

}
