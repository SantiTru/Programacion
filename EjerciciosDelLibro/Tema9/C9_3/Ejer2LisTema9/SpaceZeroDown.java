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
  public static void main(String[] args) {

    Exoplanetas[] arrayExoplanetas = new Exoplanetas[10];

    arrayExoplanetas[0] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[1] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[2] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[3] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[4] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[5] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[6] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[7] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[8] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arrayExoplanetas[9] = new Exoplanetas("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");

    Tierra[] arrayTierra = new Tierra[1];

    arrayTierra[0] = new Tierra("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");

    Satelites[] arraySatelites = new Satelites[7];

    arraySatelites[0] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[1] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[2] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[3] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[4] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[5] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");
    arraySatelites[6] = new Satelites("Prueba", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Prueba");

    Luna[] arrayLuna = new Luna[1];

    arrayLuna[0] = new Luna("Luna", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 1.62,
        "la Luna no tiene una atmósfera significativa y no tiene un clima como la Tierra");

    int menu;

    System.out
        .println("Bienvenido al programa de investigación espacial y proyecto de terraformación Space Zero Down.");
    System.out.println(" ");
    System.out.println(
        "En nuestro programa de investigación vamos a visitar varios exoplanetas y satelites con el fin de estudiar el idoneo para su terraformación. ");
    System.out.println(
        "Un exoplaneta es un planeta que orbita alrededor de una estrella diferente a nuestro Sol.Estos planetas están fuera de nuestro sistema solar");
    System.out.println(
        "y se han descubierto miles de ellos en los últimos años gracias a la mejora de la tecnología de detección. Los exoplanetas pueden variar en tamaño, ");
    System.out.println(
        "composición, masa, temperatura y distancia de su estrella. Algunos de estos planetas están en zonas habitables, lo que significa que podrían tener ");
    System.out.println(
        "condiciones similares a las de la Tierra y ser adecuados para la vida tal como la conocemos. El estudio de los exoplanetas es un campo de la astronomía");
    System.out.println(
        "que se ha expandido rápidamente en las últimas décadas y ha proporcionado información valiosa sobre la formación y evolución de los planetas y los sistemas estelares.");
    System.out.println(" ");
    System.out.println(
        "En nuestra expedición también vamos a visitar algunos satélites planetarios que son interesantes para la exploración humana o bien para los fines del proyecto");
    System.out.println(" ");

    do {
      System.out.println("\n SPACE ZERO DOWN PROJECT \n");

      System.out.println(" Por favor, elije una opción para visualizar información al respecto: \n  ");

      System.out.println("  01. Referencia: Planeta Tierra\n");
      System.out.println("  02. Exoplaneta Kepler-452b");
      System.out.println("  03. Exoplaneta Kepler-186f");
      System.out.println("  04. Exoplaneta Kepler-438b");
      System.out.println("  05. Exoplaneta Trappist-1e");
      System.out.println("  06. Exoplaneta Proxima Centauri b");
      System.out.println("  07. Exoplaneta WASP-121b");
      System.out.println("  08. Exoplaneta 51 Pegasi b");
      System.out.println("  09. Exoplaneta Gliese 581d");
      System.out.println("  10. Exoplaneta HD 40307g");
      System.out.println("  11. Exoplaneta HD 209458 b\n");
      System.out.println("  12. Referencia: Satélite Luna\n");
      System.out.println("  13. Satélite Encélado");
      System.out.println("  14. Satélite Europa");
      System.out.println("  15. Satélite Titán");
      System.out.println("  16. Satélite Io");
      System.out.println("  17. Satélite Ganímedes");
      System.out.println("  18. Satélite Fobos");
      System.out.println("  19. Satélite Deimos\n");
      System.out.println("  20. Exit");

      System.out.print("\nDime el número del objeto celeste para más información: ");
      Scanner teclado = new Scanner(System.in);
      menu = teclado.nextInt();

      switch (menu) {

        case 1:
          System.out.println(arrayTierra[0].informacion());
          break;
        case 2:
          System.out.println(arrayExoplanetas[0].informacion());
          break;
        case 3:
          System.out.println(arrayExoplanetas[1].informacion());
          break;
        case 4:
          System.out.println(arrayExoplanetas[2].informacion());
          break;
        case 5:
          System.out.println(arrayExoplanetas[3].informacion());
          break;
        case 6:
          System.out.println(arrayExoplanetas[4].informacion());
          break;
        case 7:
          System.out.println(arrayExoplanetas[5].informacion());
          break;
        case 8:
          System.out.println(arrayExoplanetas[6].informacion());
          break;
        case 9:
          System.out.println(arrayExoplanetas[7].informacion());
          break;
        case 10:
          System.out.println(arrayExoplanetas[8].informacion());
          break;
        case 11:
          System.out.println(arrayExoplanetas[9].informacion());
          break;
        case 12:
          System.out.println(arrayLuna[0].informacion());
          break;
        case 13:
          System.out.println(arraySatelites[0].informacion());
          break;
        case 14:
          System.out.println(arraySatelites[1].informacion());
          break;
        case 15:
          System.out.println(arraySatelites[2].informacion());
          break;
        case 16:
          System.out.println(arraySatelites[3].informacion());
          break;
        case 17:
          System.out.println(arraySatelites[4].informacion());
          break;
        case 18:
          System.out.println(arraySatelites[5].informacion());
          break;
        case 19:
          System.out.println(arraySatelites[6].informacion());
          break;
      }
    } while (menu != 20);
    System.out.println("Para establecer el programa de viaje, utilice SIRI.");
  }

}
