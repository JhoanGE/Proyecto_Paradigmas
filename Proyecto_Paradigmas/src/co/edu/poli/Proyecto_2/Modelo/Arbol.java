package co.edu.poli.Proyecto_2.Modelo;
import java.util.Date;
public class Arbol {
	 	private int id;
	    private String especie;
	    private String ubicacion;
	    private String estadoSalud;
	    private Date fechaPlantacion;

	    public Arbol(int id, String especie, String ubicacion, String estadoSalud, Date fechaPlantacion) {
	        this.id = id;
	        this.especie = especie;
	        this.ubicacion = ubicacion;
	        this.estadoSalud = estadoSalud;
	        this.fechaPlantacion = fechaPlantacion;
	    }

	    public int getId() {
	    	return id; 
	    }
	    public String getEspecie() { 
	    	return especie; 
	    	}
	    public String getUbicacion() { 
	    	return ubicacion; 
	    }
	    public String getEstadoSalud() {
	    	return estadoSalud; 
	  }
	    public Date getFechaPlantacion() { 
	    	return fechaPlantacion; }

	    public void setEspecie(String especie) { 
	    	this.especie = especie; 
	    	}
	    public void setUbicacion(String ubicacion) { 
	    	this.ubicacion = ubicacion; 
	    	}
	    public void setEstadoSalud(String estadoSalud) { 
	    	this.estadoSalud = estadoSalud; 
	   }
	}


