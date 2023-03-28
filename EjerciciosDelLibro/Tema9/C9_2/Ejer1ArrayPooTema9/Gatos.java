package EjerciciosDelLibro.Tema9.C9_2.Ejer1ArrayPooTema9;

/**
*  @author: SantiTru
*  @file: Gatos.java
*  @info: clase Gatos.
*/

public class Gatos {
// Aqui estan las variables y los atributos
  String nombre;
  int edad;
  String sexo;
  static int sardinas = 10;
  int sardinasComidas = 0;
// constructor
  public Gatos(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
  }
// método especifico de las sardinas
  public void come(int s) {
    System.out.print(this.nombre + ": ");
    if (sardinas >= s) {
      for (int i = 0; i < s; i++) {
        System.out.print("Nam...");
        sardinas--;
        sardinasComidas++;
      }
      System.out.println();
    } else {
      System.out.println("No quedan sardinas. Lo siento... ");
    }
  }
//métodos
  public String getNombre() {
    return nombre;
  }
  public int getEdad() {
    return edad;
  }
  public String getSexo() {
    return sexo;
  }
  public int getSardinasComidas() {
    return sardinasComidas;
  }
  public static int getSardinas() {
    return sardinas;
  }
}