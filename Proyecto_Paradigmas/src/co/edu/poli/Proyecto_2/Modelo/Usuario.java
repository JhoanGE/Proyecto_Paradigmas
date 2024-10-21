package co.edu.poli.Proyecto_2.Modelo;

public class Usuario {
	  private int id;
	  private String nombre;
	  private String rol;
	  private String correo;
	  private int telefono;
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void cerrarSesion() {
        System.out.println(nombre + " ha cerrado sesión.");
    }
}


