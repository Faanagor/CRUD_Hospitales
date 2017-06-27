package com.hospital.BL;

import java.util.List;

import com.hospital.model.Hospital;

/**
 * This interface give methods for validate the business rules.
 * @author Fabio Aguirre
 *
 */
public interface Hospital_BL {
	
	public void createHospital(Hospital Hospital);
	public void updateHospital(Hospital Hospital);
	public void deleteHospitalLogically(Integer IdHospital);
	public Hospital_BL findHospitalById(Integer IdHospital);
	public Hospital_BL findHospitalByName(String nameHospital);
	public List<Hospital_BL> findAllHospitals();
}
