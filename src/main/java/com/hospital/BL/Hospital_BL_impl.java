//package com.hospital.BL;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.hospital.model.Hospital;
//import com.hospital.DAO.HospitalRepository;
//
//@Service
//public class Hospital_BL_impl implements Hospital_BL{
//
//
///**
// * This class implements all business rules for a Hospital
// * @author Fabio Aguirre
// *
// */
//
//	@Autowired
//	private HospitalRepository hospitalRepository;	
//	private Hospital hospital_BL;
//	
//	@Override
//	public void createHospital(Hospital hospital) {
//		if (null == hospital) {
//			
//		}
//		if (null == hospital.getNombre()) {
//			
//		}
//		if (null == hospital.getUbicacion() || hospital.getUbicacion().isEmpty()) {
//			
//		}
//		if (null == hospital.getfechaCreacion()) {
//			
//		} 
//		hospitalRepository.save(hospital);
//	}
//
//	@Override
//	public void updateHospital(Hospital hospital) {
//		if (null == hospital) {
//			
//		}
//		if (null == hospital.getNombre() || hospital.getNombre().isEmpty()) {
//			
//		}
//		if (null == hospital.getUbicacion() || hospital.getUbicacion().isEmpty()) {
//			
//		}
//		if (null == hospital.getfechaCreacion() || hospital.getfechaCreacion().isEmpty()) {
//			
//		}
//		// NumMedicos al ser int, no se coloca ninguna excepcion
//		if (null == hospital.getSector() || hospital.getSector().isEmpty()) {
//			
//		}
//		hospitalRepository.save(hospital);
//	}
//
////	@Override
////	public void deleteHospitalLogically(Integer idHospital) {
////		
////		Hospital hospital = hospitalRepository.findOne(enable);
////		hospital.setBlnIsActive(false);
////		hospitalRepository.save(hospital);
////		
////	}
////
////	@Override
////	public Hospital findHospitalById(Integer id) {
////		if (null == id) {
////			
////		}
////		Hospital hospital = hospitalRepository.findOne(id);
////		return hospital;
////	}
////
////	@Override
////	public Hospital findHospitalByName(String nombre) {
////		if (null == nombre) {
////			
////		}
////		if ("".equals(nombre.trim())) {
////			
////		}
////		Hospital hospital = HospitalRepository.findByStrName(nombre);
////		return hospital;
////	}
////
////	@Override
////	public List<Hospital> findAllHospitals() {
////		List<Hospital> hospitals = (List<Hospital>) hospitalRepository.findAll();
////		return hospitals;
////	}
//
//}
