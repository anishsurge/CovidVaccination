package com.covid.vaccination.entities.vaccine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class VaccinationCenters {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String centerName;
	private String address;
	private long phoneNo;
	
	@OneToOne
	private VaccineDetails vaccineDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public VaccineDetails getVaccineDetails() {
		return vaccineDetails;
	}

	public void setVaccineDetails(VaccineDetails vaccineDetails) {
		this.vaccineDetails = vaccineDetails;
	}

}
