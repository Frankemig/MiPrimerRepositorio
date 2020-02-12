package vistas;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;
import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

import modelos.Materia;

public class Menu extends MenuTemplate {
	protected AlumnoServicio alumnoServicio;
	protected ArchivoServicio archivoServicio;

	public Menu(AlumnoServicio alumnoServicio, ArchivoServicio archivoServicio) {
		super();
		this.alumnoServicio = alumnoServicio;
		this.archivoServicio = archivoServicio;
	}

	@Override
	public void cargarDatos() throws IOException {
		
		/*String nombreArchivo = "notas.csv";
		FileReader fr;
	    BufferedReader br;
	    String data = " ";
	    ArrayList<String> listaAlumnos;
	   
	    try {
				fr = new FileReader(nombreArchivo);
				br = new BufferedReader(fr);
				data = br.readLine();
				while (data != null) {
					listaAlumnos = new ArrayList<String>();
	    	listaAlumnos.add(data);
	    	
	    	fr.close();
	    	br.close();
				}	
		} catch (Exception e) {
	     System.out.println("Error" + e.getMessage());	
		}
	    	*/
	}
	

	@Override
	public void exportarDatos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarMateria() {
		Scanner sc = new Scanner(System.in); // TODO
		// PREGUNTAR EL ALUMNO (RUT)
		System.out.println("Ingrese Rut del alumno");
		String rutAlumno = sc.nextLine();
		// QUÉ MATERIA VA A AGREGAR
		System.out.println("selecione la materia de la nota correspondiente");
		System.out.println("MATEMATICAS = 0");
		System.out.println("LEGUAJE = 1");
		System.out.println("CIENCIA = 2");
		System.out.println("HISTORIA = 3");
		int materia = sc.nextInt();
		MateriaEnum mat;
		if (materia == 0) {
			mat = MateriaEnum.MATEMATICAS;
		} else if (materia == 1) {
			mat = MateriaEnum.LENGUAJE;
		} else if (materia == 2) {
			mat = MateriaEnum.CIENCIA;
		} else {
			mat = MateriaEnum.HISTORIA;
		}
		Materia mate = new Materia(mat, new ArrayList());
	}

	@Override
	public void agregarNotaPasoUno() {
		System.out.println("======== AGREGAR NOTA ========");
		Scanner sc = new Scanner(System.in); // TODO
		// PREGUNTAR EL ALUMNO (RUT)
		System.out.println("Ingrese Rut del alumno");
		String rutAlumno = sc.nextLine();
		// QUÉ MATERIA VA A AGREGAR
		System.out.println("selecione la materia de la nota correspondiente");
		System.out.println("MATEMATICAS = 0");
		System.out.println("LEGUAJE = 1");
		System.out.println("CIENCIA = 2");
		System.out.println("HISTORIA = 3");
		int materia = sc.nextInt();
		MateriaEnum mat;
		if (materia == 0) {
			mat = MateriaEnum.MATEMATICAS;
		} else if (materia == 1) {
			mat = MateriaEnum.LENGUAJE;
		} else if (materia == 2) {
			mat = MateriaEnum.CIENCIA;
		} else {
			mat = MateriaEnum.HISTORIA;
		}
		Materia mate = new Materia(mat, new ArrayList());
		System.out.print("Nota que desea agregar a " + mate + ": ");
		float nota = sc.nextInt();
		List<Float> nuevaNota = new ArrayList<Float>();
		nuevaNota.add(nota);
		alumnoServicio.agregarNotaPasoDos(rutAlumno, mate, nuevaNota);
	}

	@Override
	public void listarAlummnos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciarMenu() {
		System.out.println("     Menu ");
		System.out.println("Bienvenido... Que Desea Hacer?");

		System.out.println("1. Crear Alumno " + "2. Listar Alumno" + "3. Agregar Materias" + "4. Agregar Notas"
				+ "5. Cargar Datos" + "6. Exportar Datos" + "7. Salir" + "Seleccion:");

	}

	@Override
	public List<String> crearAlumno() {

		Scanner sc = new Scanner(System.in);
		System.out.println("------ Creando Alumno Nuevo ------");
		System.out.println("Por Favor, Ingresar Nombres");
		String nombre = sc.nextLine();
		System.out.println("Ingrese los Apellidos");
		String apellido = sc.nextLine();
		System.out.println("Ingrese Dirección del Alumno");
		String direccion = sc.nextLine();
		System.out.println("Ingrese rut (usar formato '11.111.111-1')");
		String rut = sc.nextLine();
		Alumno nuevoAlumno = new Alumno(rut, nombre, apellido, direccion);
		alumnoServicio.crearAlumno(nuevoAlumno);

		return null;
	}
}
