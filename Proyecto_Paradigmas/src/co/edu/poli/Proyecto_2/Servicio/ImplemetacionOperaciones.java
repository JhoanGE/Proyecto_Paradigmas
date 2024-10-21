package co.edu.poli.Proyecto_2.Servicio;
import co.edu.poli.Proyecto_2.Modelo.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import co.edu.poli.Proyecto_2.Modelo.Arbol;


public class ImplemetacionOperaciones {
    private List<Arbol> listaArboles;
    private HashMap<Integer, Arbol> arbolesMap;

    public ImplemetacionOperaciones() {
        this.listaArboles = new ArrayList<>();
        this.arbolesMap = new HashMap<>();
    }

    public String crearArbol(Arbol arbol) {
        if (!arbolesMap.containsKey(arbol.getId())) {
            listaArboles.add(arbol);
            arbolesMap.put(arbol.getId(), arbol);
            return "Objeto creado con éxito";
        } else {
            return "Error: Ya existe un árbol con el ID " + arbol.getId();
        }
    }

    public Arbol leerArbol(int id) {
        return arbolesMap.get(id);
    }

    public List<Arbol> leerTodos() {
        return new ArrayList<>(listaArboles);
    }

    public String actualizarArbol(int id, Arbol arbolActualizado) {
        if (arbolesMap.containsKey(id)) {
            arbolesMap.put(id, arbolActualizado);
            for (int i = 0; i < listaArboles.size(); i++) {
                if (listaArboles.get(i).getId() == id) {
                    listaArboles.set(i, arbolActualizado);
                    return "Objeto actualizado con éxito: " + id;
                }
            }
        } else {
            return "Error: No se encontró un árbol con el ID " + id;
        }
        return null;
    }

    public Arbol eliminarArbol(int id) {
        if (arbolesMap.containsKey(id)) {
            Arbol eliminado = arbolesMap.get(id);
            listaArboles.remove(eliminado);
            arbolesMap.remove(id);
            return eliminado;
        } else {
            return null; 
        }
    }

    public List<Arbol> getListaArboles() {
        return new ArrayList<>(listaArboles); 
    }
}