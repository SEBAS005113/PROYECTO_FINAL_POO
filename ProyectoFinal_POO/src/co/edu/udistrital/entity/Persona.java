package co.edu.udistrital.entity;

public class Persona {
	private String nombre,apellido,correo, usuario,contraseña,telefono,tipoDocumento,numeroDocumento,rol,genero;
	private int edad;
	
	
	public Persona(String nombre, String apellido, String correo, String usuario, String contraseña, String telefono,
			String tipoDocumento, String numeroDocumento, String rol, String genero,int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.telefono = telefono;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.rol = rol;
		this.edad = edad;
		this.genero=genero;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}
