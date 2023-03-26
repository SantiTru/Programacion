package EjerciciosDelLibro.Tema9.C9_3.Ejer3LisTema9;

public class PruebaMascotas {
  public static void main(String[] args) {
    // Creamos un inventario
    Inventario inventario = new Inventario();
    
    // Creamos algunos animales y los añadimos al inventario
    Perro perro = new Perro("Toby");
    inventario.insertarAnimal(perro);
    
    Gato gato = new Gato("Luna");
    inventario.insertarAnimal(gato);
    
    Loro loro = new Loro("Pepe");
    inventario.insertarAnimal(loro);
    
    Canario canario = new Canario("Piolín");
    inventario.insertarAnimal(canario);
    
    // Mostramos la lista de animales
    System.out.println("Lista de animales:");
    inventario.mostrarListaAnimales();
    System.out.println();
    
    // Mostramos los datos de un animal concreto
    System.out.println("Datos de Pepe el loro:");
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
