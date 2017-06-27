package com.hospital.DAO;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
	public Hospital findById(int id); 
	public List<Hospital> findByNombre(String nombre);    
	public List<Hospital> findByUbicacion(String ubicacion);
	public List<Hospital> findByFechaCreacion(String fechaCreacion);
	public List<Hospital> findByNumMedicos(int numMedicos);
	public List<Hospital> findBySector(String sector);    
	public List<Hospital> findAll();  
}