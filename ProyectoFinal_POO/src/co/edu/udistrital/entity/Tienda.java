package co.edu.udistrital.entity;

import java.util.ArrayList;

import co.edu.udistrital.entity.*;

public class Tienda {
	private String nombre,ubicacion;
	private Administrador administrador;
	private ArrayList<Cliente> clientes;
	private ArrayList<Supervisor> supervisores;
	

	public Tienda() {
		clientes= new ArrayList<Cliente>();
		supervisores= new ArrayList<Supervisor>();
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
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Supervisor> getSupervisores() {
		return supervisores;
	}
	public void setSupervisores(ArrayList<Supervisor> supervisores) {
		this.supervisores = supervisores;
	}
	

	
}
