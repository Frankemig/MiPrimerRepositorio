package modelos;

import java.util.List;

public class Materia {

	private MateriaEnum nombre;
    private List<Float> nota;
    
	public Materia(MateriaEnum nombre, List<Float> nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public MateriaEnum getNombre() {
		return nombre;
	}

	public void setNombre(MateriaEnum nombre) {
		this.nombre = nombre;
	}

	public List<Float> getNota() {
		return nota;
	}

	public void setNota(List<Float> nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", nota=" + nota + "]";
	}
    
}