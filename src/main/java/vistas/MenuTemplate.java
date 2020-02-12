package vistas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import modelos.Materia;

public abstract class MenuTemplate {

	public abstract void cargarDatos() throws IOException;
	
	public abstract void exportarDatos();
	
	public abstract void agregarMateria();
	
	public abstract void agregarNotaPasoUno();
	
	public abstract void listarAlummnos();
	
	public abstract void terminarPrograma();
	
	public abstract void iniciarMenu();
	
	public abstract List<String> crearAlumno();


		// TODO Auto-generated method stub
		
	}


	


	

	
