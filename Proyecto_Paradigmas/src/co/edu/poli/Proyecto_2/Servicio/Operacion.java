package co.edu.poli.Proyecto_2.Servicio;

import java.util.List;

import co.edu.poli.Proyecto_2.Modelo.Arbol;

public interface Operacion {
	public String crearArbol(Arbol arbol);
	public Arbol leerArbol(int id);
	public String actualizarArbol(int id, Arbol arbolActualizado);
	public Arbol eliminarArbol(int id);
	public List<Arbol> getListaArboles();

}
