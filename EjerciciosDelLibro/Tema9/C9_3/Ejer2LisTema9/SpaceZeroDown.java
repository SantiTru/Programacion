package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9;

import java.util.Scanner;

import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Exoplanetas;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Satelites;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Tierra;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Luna;

/**
 * @author: SantiTru
 * @file: SpaceZeroDown.java
 * @info: programa principal del Ejercicio 2 del libro Tema 9
 */

public class SpaceZeroDown {
  public static void main(String[] args){

    Exoplanetas[] arrayExoplanetas = new Exoplanetas[10];

    arrayExoplanetas[0] = new Exoplanetas();
    arrayExoplanetas[1] = new Exoplanetas();
    arrayExoplanetas[2] = new Exoplanetas();
    arrayExoplanetas[3] = new Exoplanetas();
    arrayExoplanetas[4] = new Exoplanetas();
    arrayExoplanetas[5] = new Exoplanetas();
    arrayExoplanetas[6] = new Exoplanetas();
    arrayExoplanetas[7] = new Exoplanetas();
    arrayExoplanetas[8] = new Exoplanetas();
    arrayExoplanetas[9] = new Exoplanetas();

    Tierra[] arrayTierra = new Tierra[1];

    arrayTierra[0] = new Tierra();

    Satelites[] arraySatelites = new Satelites[7];

    arraySatelites[0] = new Satelites();
    arraySatelites[1] = new Satelites();
    arraySatelites[2] = new Satelites();
    arraySatelites[3] = new Satelites();
    arraySatelites[4] = new Satelites();
    arraySatelites[5] = new Satelites();
    arraySatelites[6] = new Satelites();
    
    Luna[] arrayLuna = new Luna[1];

    arrayLuna[0] = new Luna();

    int menu;

    System.out.println("Bienvenido al programa de investigación espacial y proyecto de terraformación Space Zero Down.");
    System.out.println(" ");
    System.out.println("En nuestro programa de investigación vamos a visitar varios exoplanetas y satelites con el fin de estudiar el idoneo para su terraformación. ");
    System.out.println("Un exoplaneta es un planeta que orbita alrededor de una estrella diferente a nuestro Sol.Estos planetas están fuera de nuestro sistema solar");
    System.out.println(" y se han descubierto miles de ellos en los últimos años gracias a la mejora de la tecnología de detección. Los exoplanetas pueden variar en tamaño");
    System.out.println(", composición, masa, temperatura y distancia de su estrella. Algunos de estos planetas están en zonas habitables, lo que significa que podrían tener ");
    System.out.println("condiciones similares a las de la Tierra y ser adecuados para la vida tal como la conocemos. El estudio de los exoplanetas es un campo de la astronomía");
    System.out.println(" que se ha expandido rápidamente en las últimas décadas y ha proporcionado información valiosa sobre la formación y evolución de los planetas y los sistemas estelares.");
    System.out.println(" ");
    System.out.println("En nuestra expedición también vamos a visitar algunos satélites planetarios que son interesantes para la exploración humana o bien para los fines del proyecto");
    System.out.println(" ");
    
   

    do{
      System.out.println("\n\n\n SPACE ZERO DOWN PROJECT");
      System.out.println(" Por favor, elije una opción para visualizar información al respecto: ");
      System.out.println("  1. Referencia: Planeta Tierra");
      System.out.println("  2. Exoplaneta Kepler-452b");
      System.out.println("  3. Exoplaneta Kepler-186f");
      System.out.println("  4. Exoplaneta Kepler-438b");
      System.out.println("  5. Exoplaneta Trappist-1e");
      System.out.println("  6. Exoplaneta Proxima Centauri b");
      System.out.println("  7. Exoplaneta WASP-121b");
      System.out.println("  8. Exoplaneta 51 Pegasi b");
      System.out.println("  9. Exoplaneta Gliese 581d");
      System.out.println("  10. Exoplaneta HD 40307g");
      System.out.println("  11. Exoplaneta HD 209458 b");
      System.out.println("  12. Referencia: Satélite Luna");
      System.out.println("  13. Satélite Encélado");
      System.out.println("  14. Satélite Europa");
      System.out.println("  15. Satélite Titán");
      System.out.println("  16. Satélite Io");
      System.out.println("  17. Satélite Ganímedes");
      System.out.println("  18. Satélite Fobos");
      System.out.println("  19. Satélite Deimos");
      System.out.println("  20. Exit");






    }while(menu!=20);

  }

}
