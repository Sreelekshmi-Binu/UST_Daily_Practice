package com.Int.ust.bean;

import com.Int.ust.service.Patient;

public class PatientBean implements Patient{
	private String patientID;
	private String UserID;
	private String appointmentDate;
	private String ailmentType;
	private String ailmentDetails;
	private String diagonsisHistory;
	
	public PatientBean(String patientID, String userID, String appointmentDate, String ailmentType,
			String ailmentDetails, String diagonsisHistory) {
		super();
		this.patientID = patientID;
		UserID = userID;
		this.appointmentDate = appointmentDate;
		this.ailmentType = ailmentType;
		this.ailmentDetails = ailmentDetails;
		this.diagonsisHistory = diagonsisHistory;
	}
	@Override
	public String addAilmentDetails(PatientBean patientBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean modifyAilmentDetails(PatientBean patientBean) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "PatientBean [patientID=" + patientID + ", UserID=" + UserID + ", appointmentDate=" + appointmentDate
				+ ", ailmentType=" + ailmentType + ", ailmentDetails=" + ailmentDetails + ", diagonsisHistory="
				+ diagonsisHistory + "]";
	}
	
}
