package co.edu.poli.Proyecto_2.Modelo;

import java.util.Date;

public class Imforme {
	private String contenido;
    private Date fechaGeneracion;

    public Imforme(String contenido) {
        this.contenido = contenido;
        this.fechaGeneracion = new Date();
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void generar() {
        System.out.println("Informe generado: " + contenido);
    }
}


