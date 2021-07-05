package com.covid.vaccination.entities.regions;

import java.util.Locale.IsoCountryCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StateDetails {
	
	@Id
	private long stateId;
	
	private String stateName;
	
	@OneToOne
	private CountryDetails country;

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public CountryDetails getCountry() {
		return country;
	}

	public void setCountry(CountryDetails country) {
		this.country = country;
	}	
}
