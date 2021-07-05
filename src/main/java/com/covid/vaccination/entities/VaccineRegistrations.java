package com.covid.vaccination.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covid.vaccination.entities.regions.Districts;
import com.covid.vaccination.entities.regions.StateDetails;
import com.covid.vaccination.entities.vaccine.VaccinationStatus;

@Entity
@Table(name = "Vaccine_Registrations")
public class VaccineRegistrations {

	@Id
	private long id;

	private String firstName;
	private String lastName;
	private int age;

	@Column(unique = true)
	private long phoneNo;

	// Registered, Appointment Scheduled for Dose 1, Dose 1 Completed, Appointment
	// Scheduled for Dose 2, Dose 2 Completed
	@OneToOne
	private VaccinationStatus vaccinationStatus = VaccinationStatus.defaultVaccinationStatus();

	// @Column(name = "State_Id")
	@OneToOne
	private Districts district;

	public VaccineRegistrations(long id, String firstName, String lastName, int age, long phoneNo,
			Districts district) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNo = phoneNo;
		this.district = district;
	}
	
	public VaccineRegistrations() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public VaccinationStatus getVaccinationStatus() {
		return vaccinationStatus;
	}

	public void setVaccinationStatus(VaccinationStatus vaccinationStatus) {
		this.vaccinationStatus = vaccinationStatus;
	}

	public Districts getDistrict() {
		return district;
	}

	public void setDistrict(Districts district) {
		this.district = district;
	}
}
