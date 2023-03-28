package EjerciciosDelLibro.Tema9.C9_3.Ejer3LisTema9;

/**
  @author: SantiTru
  @file: Aves.java
  @info: clase abstracta "Aves"
*/

public abstract class Aves extends Mascotas {
  private String nombre;
    
  public Aves(String nombre, int edad, String estado, String fechaNacimiento) {
    super(nombre, edad, estado, fechaNacimiento);
    this.nombre = nombre;
  }
  public String getNombre() {
      return nombre;
  }  
}
