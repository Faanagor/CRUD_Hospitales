package com.hospital.model;

import com.sun.istack.NotNull;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datos_hospital")
public class Hospital implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String nombre;
    private String ubicacion;
	
    private String fechaCreacion;
	
    private int numMedicos;
	
    private String sector;
    private boolean enable;
        
    
	public Hospital() {

	}

	public Hospital(int id, String nombre, String ubicacion, String fechaCreacion, int numMedicos,
			String sector) {
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.fechaCreacion = fechaCreacion;
		this.numMedicos = numMedicos;
		this.sector = sector;
	}

	public Hospital(String nombre, String ubicacion, String fechaCreacion, int numMedicos,
			String sector) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.fechaCreacion = fechaCreacion;
		this.numMedicos = numMedicos;
		this.sector = sector;
	}
	public int getId() {
		return id;
	}
    
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public int getnumMedicos() {
		return numMedicos;
	}

	public void setnumMedicos(int numMedicos) {
		this.numMedicos = numMedicos;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}	
	
	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}	
}
