package com.covid.vaccination.entities.vaccine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VaccineDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vaccineId;

	private String vaccineName;
	private String vaccineDeveloper;

	public long getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(long vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineDeveloper() {
		return vaccineDeveloper;
	}

	public void setVaccineDeveloper(String vaccineDeveloper) {
		this.vaccineDeveloper = vaccineDeveloper;
	}
}
