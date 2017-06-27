package com.hospital.DAO;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hospital.model.Hospital;
@SpringBootTest
@RunWith(SpringRunner.class)

public class HospitalRepositoryTest {

	@Autowired
	HospitalRepository hospitalDAO;
	
	
	@Test
	public void testFindByNombre() {			//Validacion para buscar un hospital por nombre
		//VAlidacion cuando las cosas salen bien
		//entrada simulada del usuario
		String nombre="San Mungo";
		try {
			//Se supone que devuelva hospital SAn Mungo
			List<Hospital> hospitalEncontrado = hospitalDAO.findByNombre(nombre);
			assertTrue("No se encontro hospital " + nombre, hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testFindByUbicacion() {			//Validacion para buscar un hospital por ubicacion
		//VAlidacion cuando las cosas salen bien
		//entrada simulada del usuario
		String ubicacion = "medellin"; 
		try {
			//Se supone que devuelva hospital SAn Mungo
			List<Hospital> hospitalEncontrado = hospitalDAO.findByUbicacion(ubicacion);
			assertTrue("No se encontro la ubicacion " + ubicacion, hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testFindByFechaCreacion() {			//Validacion para buscar un hospitar por fecha de creacion
		String fecha = "2017-12-12";
		try {
			//Se supone que devuelva hospital SAn Mungo
			List<Hospital> hospitalEncontrado = hospitalDAO.findByFechaCreacion(fecha);
			assertTrue("No se encontro la fecha " + fecha, hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testFindByNumMedicos() {			//Validacion para buscar un hospital por numero de medicos
		int numMedicos = 23; 
		try {
			//Se supone que devuelva hospital SAn Mungo
			List<Hospital> hospitalEncontrado = hospitalDAO.findByNumMedicos(numMedicos);
			assertTrue("No se encontro el numero de medicos " + numMedicos, hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testFindBySector() {			//Validacion para buscar un hospital por sector
		String sector = "publico"; 
		try {
			//Se supone que devuelva hospital SAn Mungo
			List<Hospital> hospitalEncontrado = hospitalDAO.findBySector(sector);
			assertTrue("No se encontro el sector " + sector, hospitalEncontrado.size()>0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testSaveS() {				//Validacion para insertar un hospital con todas las variables
		Hospital hospital; //declaracion
		hospital = new Hospital("san mungo", "medellin", "2017-12-12", 23,"publico"); //inicializacion
		
		try{
			
			Hospital hospitalGuardado = hospitalDAO.save(hospital);
			assertTrue("No se guardo hospital", hospitalGuardado!=null);
			
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testFindOne() {			//Validacion para buscar un hospital por el ID (Unico)
		int id = 47; 
		try {
			//Se supone que devuelva el hospital con ID 47
			Hospital hospitalEncontrado = hospitalDAO.findById(id);
			assertTrue("No se encontro el ID de usuario " + id, hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void testFindAll() {
		
		try {
			//Se supone que devuelva la lista completa de la BD de los hospitales
			
			List<Hospital>  hospitalEncontrado = hospitalDAO.findAll();
			assertTrue("No se encontro la lista ", hospitalEncontrado!=null);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			// TODO: handle exception
		}
	}

}
