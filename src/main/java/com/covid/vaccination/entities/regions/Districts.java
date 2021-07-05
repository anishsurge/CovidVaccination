package com.covid.vaccination.entities.regions;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Districts {
	@Id
	private long districtId;

	private String districtName;

	@OneToOne
	private StateDetails stateDetails;

	public long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public StateDetails getStateDetails() {
		return stateDetails;
	}

	public void setStateDetails(StateDetails stateDetails) {
		this.stateDetails = stateDetails;
	}
}
