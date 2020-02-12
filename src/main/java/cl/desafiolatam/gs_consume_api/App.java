package cl.desafiolatam.gs_consume_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.AlumnoServicio;
import vistas.Menu;

public class App {

		public static void main(String[] args) {
			String nombreArchivo = "notas";
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
			
		}
}