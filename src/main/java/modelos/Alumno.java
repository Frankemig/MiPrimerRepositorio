package modelos;

import java.util.List;

public class Alumno {

	protected String nombre;
	protected String apellido;
	protected String rut;
	protected String direccion;
	protected List<Materia> materia;
	
	
	public Alumno(String nombre, String apellido, String rut, String direccion, List<Materia> materia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", direccion=" + direccion
				+ ", materia=" + materia + "]";
	}
	public Alumno(String nombre, String apellido, String rut, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
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
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Materia> getMateria() {
		return materia;
	}
	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}
	
	

}
