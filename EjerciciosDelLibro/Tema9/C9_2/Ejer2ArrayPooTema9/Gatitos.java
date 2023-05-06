package EjerciciosDelLibro.Tema9.C9_2.Ejer2ArrayPooTema9;

/**
*  @author: SantiTru
*  @file: Gatitos.java
*  @info: clase Gatitos, programa principal PruenaGatitos.java.
*/

public class Gatitos {
// Aqui estan las variables y los atributos
  String nombre;
  String color;
  String sexo;
  static int sardinas = 10;
  int sardinasComidas = 0;
// constructor
  public Gatitos(String nombre, String color, String sexo) {
    this.nombre=nombre;
    this.color = color;
    this.sexo = sexo;
  }
// método especifico de las sardinas
  public void come(int s) {

    System.out.print(this.nombre + ": ");
    for (int i = 1; i <= s; i++) {
        if (sardinas == 0) {
          System.out.println(" ");
          System.out.println("No quedan más sardinas. Lo siento... ");
          break;
        
        } else {
        System.out.println(" ");
        System.out.print("Ñam...");
        sardinas--;
        sardinasComidas++;
        System.out.println(); 
        } 
    }
  }
//métodos
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public int getSardinasComidas() {
    return sardinasComidas;
  }
  public static int getSardinas() {
    return sardinas;
  }
}