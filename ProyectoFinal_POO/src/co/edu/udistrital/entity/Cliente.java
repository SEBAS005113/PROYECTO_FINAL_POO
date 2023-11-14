package co.edu.udistrital.entity;

import co.edu.udistrital.interfaces.TarjetaCredito;

public class Cliente extends Persona implements TarjetaCredito{
	
	private double cupoTotal,cupoDisponible;
	
	
	public Cliente(String nombre, String apellido, String correo, String usuario, String contraseña, String telefono,
			String tipoDocumento, String numeroDocumento, String rol, String genero, int edad) {
		super(nombre, apellido, correo, usuario, contraseña, telefono, tipoDocumento, numeroDocumento, rol, genero, edad);
		
	}


	public double getCupoTotal() {
		return cupoTotal;
	}


	public void setCupoTotal(double cupoTotal) {
		this.cupoTotal = cupoTotal;
	}


	public double getCupoDisponible() {
		return cupoDisponible;
	}


	public void setCupoDisponible(double cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}


	@Override
	public void asignarCupo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void liberarCupo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void realizarPago() {
		// TODO Auto-generated method stub
		
	}
	

}
