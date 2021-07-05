package com.covid.vaccination.entities.regions;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryDetails {
	
	@Id
	private long countryId;
	
	private String countryName;

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
