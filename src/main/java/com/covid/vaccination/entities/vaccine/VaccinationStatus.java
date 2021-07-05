package com.covid.vaccination.entities.vaccine;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VaccinationStatus {

	@Id
	private int id;
	private String desc;
	
	public VaccinationStatus(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
	
	public VaccinationStatus() {
		
	}

	public static VaccinationStatus defaultVaccinationStatus() {
		return new VaccinationStatus(1, "Registered");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
