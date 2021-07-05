package com.covid.vaccination.dto;

public class UpdateStatusDTO {
	private long userId;
	private int doseNo;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getDoseNo() {
		return doseNo;
	}

	public void setDoseNo(int doseNo) {
		this.doseNo = doseNo;
	}
}
