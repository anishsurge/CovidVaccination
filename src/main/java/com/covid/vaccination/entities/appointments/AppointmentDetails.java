package com.covid.vaccination.entities.appointments;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.covid.vaccination.entities.VaccineRegistrations;
import com.covid.vaccination.entities.vaccine.VaccinationCenters;

/**
 * @author anish
 *
 */
@Entity
public class AppointmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private int doseNo;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;

	@OneToOne
	VaccinationCenters vaccinationCenter;
	
	@OneToOne
	VaccineRegistrations user;

	public AppointmentDetails(int doseNo, LocalDate date, LocalTime startTime, LocalTime endTime,
			VaccinationCenters vaccinationCenter, VaccineRegistrations user) {
		super();
		this.doseNo = doseNo;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.vaccinationCenter = vaccinationCenter;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDoseNo() {
		return doseNo;
	}

	public void setDoseNo(int doseNo) {
		this.doseNo = doseNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public VaccinationCenters getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(VaccinationCenters vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public VaccineRegistrations getUser() {
		return user;
	}

	public void setUser(VaccineRegistrations user) {
		this.user = user;
	}
}
