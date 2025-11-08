package com.Int.ust.service;

import com.Int.ust.bean.PatientBean;

public interface Patient {
	String addAilmentDetails(PatientBean patientBean);
	boolean modifyAilmentDetails(PatientBean patientBean);

}
