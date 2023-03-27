package EjerciciosDelLibro.Tema9.C9_3.Ejer3LisTema9;

/**
*  @author: SantiTru
*  @file: PruebaMascotas.java
*  @info: Implementa una clase llamada Inventario que utilizaremos para almacenar referencias a todos los
*         animales existentes en una tienda de mascotas.
*         Esta clase debe cumplir con los siguientes requisitos:
*         En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios.
*         Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario.
*         La clase debe permitir realizar las siguientes acciones:
*         Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
*         Mostrar todos los datos de un animal concreto.
*         Mostrar todos los datos de todos los animales.
*         Insertar animales en el inventario.
*         Eliminar animales del inventario.
*         Vaciar el inventario.
*/

public class PruebaMascotas {
  public static void main(String[] args) {
// Creamos un inventario
    Inventario inventario = new Inventario();
    
// Creamos algunos animales y los añadimos al inventario
    Perro perro = new Perro("Canela", 5, "abandonado", "01.01.2018");
    inventario.insertarAnimal(perro);
    
    Gato gato = new Gato("Perry", 2, "abandonada", "01.01.2021");
    inventario.insertarAnimal(gato);
    
    Loro loro = new Loro("Batman", 40, "adoptado", "01.01.1983");
    inventario.insertarAnimal(loro);
    
    Canario canario = new Canario("Piquito de Oro", 2, "criado", "01.02.2021");
    inventario.insertarAnimal(canario);
    
// Mostramos la lista de animales
    System.out.println("Lista de animales:");
    inventario.mostrarListaAnimales();
    System.out.println();
    
// Mostramos los datos de un animal concreto
    System.out.println("Datos de Batman el loro:");
    inventario.mostrarDatosAnimal(loro);
    System.out.println();
    
// Mostramos los datos de todos los animales
    System.out.println("Datos de todos los animales:");
    inventario.mostrarDatosTodosLosAnimales();
    System.out.println();
    
// Eliminamos un animal
    System.out.println("Eliminando a Luna el gato...");
    inventario.eliminarAnimal(gato);
    
// Mostramos la lista de animales actualizada
    System.out.println("Lista de animales actualizada:");
    inventario.mostrarListaAnimales();
    System.out.println();
    
// Vaciamos el inventario
    System.out.println("Vaciamos el inventario...");
    inventario.vaciarInventario();
    
// Mostramos la lista de animales después de vaciar el inventario
    System.out.println("Lista de animales después de vaciar el inventario:");
    inventario.mostrarListaAnimales();
    
  }
  
}
