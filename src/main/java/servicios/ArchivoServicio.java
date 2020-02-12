package servicios;

import java.util.ArrayList;
import java.util.List;

public class ArchivoServicio {

	protected List<String> alumnosACargar;
	protected PromedioServicioImp promedioServicioImp;
	
	public List<String> getAlumnosACargar() {
		return alumnosACargar;
	}

	public void setAlumnosACargar(List<String> alumnosACargar) {
		this.alumnosACargar = alumnosACargar;
	}

	public PromedioServicioImp getPromedioServicioImp() {
		return promedioServicioImp;
	}

	public void setPromedioServicioImp(PromedioServicioImp promedioServicioImp) {
		this.promedioServicioImp = promedioServicioImp;
	}

	public ArchivoServicio(List<String> alumnosACargar, PromedioServicioImp promedioServicioImp) {
		super();
		this.alumnosACargar = alumnosACargar;
		this.promedioServicioImp = promedioServicioImp;
	}	
	
}