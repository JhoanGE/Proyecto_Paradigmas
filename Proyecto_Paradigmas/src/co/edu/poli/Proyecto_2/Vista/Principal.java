	package co.edu.poli.Proyecto_2.Vista;
	
	import java.util.Date;
	import java.util.Scanner;
	
	import co.edu.poli.Proyecto_2.Modelo.Arbol;
	import co.edu.poli.Proyecto_2.Servicio.*;
	
	public class Principal {
		public static void main(String[] args) {
	    ImplemetacionOperaciones gestor = new ImplemetacionOperaciones();
	    Scanner scanner = new Scanner(System.in);
	    int opcion;{
	
	    do {
	        System.out.println("Seleccione una opción:");
	        System.out.println("1. Crear árbol");
	        System.out.println("2. Leer árbol");
	        System.out.println("3. Actualizar árbol");
	        System.out.println("4. Eliminar árbol");
	        System.out.println("5. Listar árboles");
	        System.out.println("0. Salir");
	        opcion = scanner.nextInt();
	
	        switch (opcion) {
	            case 1:
	               
	                System.out.print("Ingrese numero identificador del arbol: ");
	                int id = scanner.nextInt();
	                scanner.nextLine(); 
	                System.out.print("Ingrese especie: ");
	                String especie = scanner.nextLine();
	                System.out.print("Ingrese ubicación: ");
	                String ubicacion = scanner.nextLine();
	                System.out.print("año en el que se planto: ");
	                String estadoSalud = scanner.nextLine();
	                Date fechaPlantacion = new Date();
	
	                Arbol nuevoArbol = new Arbol(id, especie, ubicacion, estadoSalud, fechaPlantacion);
	                gestor.crearArbol(nuevoArbol);
	                System.out.println("Árbol creado exitosamente.");
	                break;
	
	            case 2:
	               
	                System.out.print("Ingrese ID del árbol a leer: ");
	                int idLeer = scanner.nextInt();
	                Arbol arbolLeido = gestor.leerArbol(idLeer);
	                if (arbolLeido != null) {
	                    System.out.println("Árbol encontrado: " + arbolLeido.getEspecie() + ", Ubicación: " + arbolLeido.getUbicacion());
	                } else {
	                    System.out.println("Árbol no encontrado.");
	                }
	                break;
	
	            case 3:
	               
	                System.out.print("Ingrese ID del árbol a actualizar: ");
	                int idActualizar = scanner.nextInt();
	                scanner.nextLine(); 
	                System.out.print("Ingrese nueva especie: ");
	                String nuevaEspecie = scanner.nextLine();
	                System.out.print("Ingrese nueva ubicación: ");
	                String nuevaUbicacion = scanner.nextLine();
	                System.out.print("Ingrese caracteristicas del arbol : ");
	                String nuevoEstadoSalud = scanner.nextLine();
	
	                Arbol arbolActualizado = new Arbol(idActualizar, nuevaEspecie, nuevaUbicacion, nuevoEstadoSalud, new Date());
	                gestor.actualizarArbol(idActualizar, arbolActualizado);
	                System.out.println("Árbol actualizado exitosamente.");
	                break;
	
	            case 4:
	              
	                System.out.print("Ingrese ID del árbol a eliminar: ");
	                int idEliminar = scanner.nextInt();
	                gestor.eliminarArbol(idEliminar);
	                System.out.println("Árbol eliminado exitosamente.");
	                break;
	
	            case 5:
	              
	                System.out.println("Lista de árboles:");
	                for (Arbol arbol : gestor.getListaArboles()) {
	                    System.out.println("ID: " + arbol.getId() + ", Especie: " + arbol.getEspecie() + ", Ubicación: " + arbol.getUbicacion());
	                }
	                break;
	
	            case 0:
	                System.out.println("Saliendo de la aplicación.");
	                break;
	
	            default:
	                System.out.println("Opción no válida. Intente de nuevo.");
	        }
	    } while (opcion != 0);
	
	    scanner.close();
	}
	}
	}
