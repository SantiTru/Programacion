package EjerciciosDelLibro.Tema9.C9_2.Ejer2ArrayPooTema9;

/**
*  @author: SantiTru
*  @file: PruebaGatos.java
*  @info: Cambia el programa anterior de tal forma que los datos de los gatos se
*         introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
*         bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
*         "macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
*/

public class PruebaGatitos {
  public static void main(String[] args) {
    Gatitos[] gato = new Gatitos[4];
// Se describen los 4 objetos de array inicializado anteriormente y se definen sus características
    gato[0] = new Gatitos("Alfredo", "atigrado", "macho");
    gato[1] = new Gatitos("Copito", "blanco", "hembra");
    gato[2] = new Gatitos("Trasto", "negro", "macho");
    gato[3] = new Gatitos("Perry", "canela", "macho");
    
//Se imprime por pantalla las características de cada gato usando un bucle para imprimir los 4 diferentes 
    for (Gatitos g : gato) {
      int sardinas = (int) (Math.random() * 11);
      g.come(sardinas);
      System.out.println("Su nombre es: " + g.getNombre() + ", su color es: " + g.getColor() + " y es : " + g.getSexo()
          + ", Sardinas comidas: " + g.getSardinasComidas());
      System.out.println(" ");
    }
  }
}