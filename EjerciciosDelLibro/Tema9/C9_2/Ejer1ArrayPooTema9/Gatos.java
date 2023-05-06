package EjerciciosDelLibro.Tema9.C9_2.Ejer1ArrayPooTema9;

/**
*  @author: SantiTru
*  @file: Gatos.java
*  @info: clase Gatos programa principal PruebaGatos.java.
*/

public class Gatos {
//Aqui estan las variables y los atributos
  String nombre;
  int edad;
  String sexo;
  static int sardinas = 10;
  int sardinasComidas = 0;
//constructor
  public Gatos(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
  }
//método especifico de las sardinas
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