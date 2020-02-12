package servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;

public class AlumnoServicio {

	protected Map<String, Alumno> listaAlumnos;

	public AlumnoServicio(Map<String, Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public Map<String, Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Map<String, Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "AlumnoServicio [listaAlumnos=" + listaAlumnos + "]";
	}

	public void crearAlumno(Alumno nuevoAlumno) {
		// TODO Auto-generated method stub
		
	}

	public void agregarNotaPasoDos(String rutAlumno, Materia currentMate, List<Float> listaDeNota) {
		// llamo al alumno de la lista por su rut
		Alumno alumno = listaAlumnos.get(rutAlumno);
		// de su materia agregada, incluyo la nueva nota en la lista de notas
		currentMate.setNota(listaDeNota);

        // actualizar el alumno con la materia (que incluye las notas)



		// guardo y actualizo los datos en el alumno
		listaAlumnos.put(rutAlumno, alumno);
	}
}