package EjerciciosDelLibro.Tema9.C9_3.Ejer3LisTema9;
import java.util.ArrayList;

/**
  @author: SantiTru
  @file: Inventario.java
  @info: clase "Inventario"
*/

public class Inventario {
  private ArrayList<Mascotas> listaAnimales;
  
  public Inventario() {
    listaAnimales = new ArrayList<>();
  }
  
  public void mostrarListaAnimales() {
      for (Mascotas animal : listaAnimales) {
          System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNombre());
      }
  }
  
  public void mostrarDatosAnimal(Mascotas animal) {
      System.out.println("Tipo: " + animal.getClass().getSimpleName());
      System.out.println("Nombre: " + animal.getNombre());
  }
  
  public void mostrarDatosTodosLosAnimales() {
      for (Mascotas animal : listaAnimales) {
          mostrarDatosAnimal(animal);
          System.out.println(); 
      }
  }
    
  public void insertarAnimal(Mascotas animal) {
    listaAnimales.add(animal);
    System.out.println("Animal insertado en el inventario: " + animal.getNombre());
  }
  public void insertarAnimal(Canario canario) {
    listaAnimales.add(canario);
    System.out.println("Canario insertado en el inventario: " + canario.getNombre());
  }

  public void insertarAnimal(Loro loro) {
      listaAnimales.add(loro);
      System.out.println("Loro insertado en el inventario: " + loro.getNombre());
  }
  
  public void insertarAnimal(Perro perro) {
      listaAnimales.add(perro);
      System.out.println("Perro insertado en el inventario: " + perro.getNombre());
  }
  
  public void insertarAnimal(Gato gato) {
      listaAnimales.add(gato);
      System.out.println("Gato insertado en el inventario: " + gato.getNombre());
  }
  
  public void eliminarAnimal(Mascotas animal) {
    listaAnimales.remove(animal);
  }
  
  public void vaciarInventario() {
    listaAnimales.clear();
  }
}
