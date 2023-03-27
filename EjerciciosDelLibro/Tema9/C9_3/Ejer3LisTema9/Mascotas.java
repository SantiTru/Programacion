package EjerciciosDelLibro.Tema9.C9_3.Ejer3LisTema9;

/**
  @author: SantiTru
  @file: Mascotas.java
  @info: clase abstracta "Mascotas"
*/

public abstract class Mascotas {
  private String nombre;
  private int edad;
  private String estado;
  private String fechaNacimiento;
    
  public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
      this.nombre=nombre;
      this.edad=edad;
      this.estado=estado;
      this.fechaNacimiento=fechaNacimiento;
  }
  
  public String getNombre() {
      return nombre;
  }  
  public int getEdad() {
      return edad;
  }
  public String getEstado() {
      return estado;
  } 
  public String getFechaNacimiento() {
      return fechaNacimiento;
  }
}
