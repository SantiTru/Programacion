package EjerciciosDelLibro.Tema10.Ejer2LisTema9Mod;

import java.util.Scanner;

import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Exoplanetas;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Satelites;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Tierra;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Luna;

/**
 * @author: SantiTru
 * @file: SpaceZeroDownMod.java
 * @info: programa principal del Ejercicio 2 del listado facilitado del Tema 9
 */

public class SpaceZeroDownMod {
  public static void main(String[] args) {

    Exoplanetas[] arrayExoplanetas = new Exoplanetas[10];

    arrayExoplanetas[0] = new Exoplanetas("Kepler-452b",
        "Es un exoplaneta rocoso que orbita en la zona habitable de una estrella similar al sol, a unos 1.400 años luz de distancia de la Tierra.",
        1, "5,7", 13.5, 1.03, 384.8, 1.400, 9.2,
        "Desconocido");
    arrayExoplanetas[1] = new Exoplanetas("Kepler-186f",
        "Es un exoplaneta rocoso que orbita en la zona habitable de una estrella enana roja, a unos 500 años luz de distancia.",
        0.037, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "desconocido, pero se estima que podría tener agua líquida en su superficie si tiene una atmósfera adecuada. Se piensa que podría ser templado");
    arrayExoplanetas[2] = new Exoplanetas("Kepler-438b",
        "Es un exoplaneta rocoso que orbita en la zona habitable de una estrella enana roja, a unos 640 años luz de distancia.",
        0.166, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "desconocido, pero se cree que debido a su tamaño y masa, podría ser un planeta rocoso similar a la Tierra, aunque más caliente debido a su cercanía a su estrella.");
    arrayExoplanetas[3] = new Exoplanetas("Trappist-1e",
        "Es uno de los siete planetas que orbitan la estrella enana roja TRAPPIST-1, y es un candidato potencial para la habitabilidad.",
        0.029, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Desconocido");
    arrayExoplanetas[4] = new Exoplanetas("Proxima Centauri b",
        "Es un exoplaneta rocoso que orbita la estrella más cercana a nuestro sistema solar, Proxima Centauri, a unos 4,2 años luz de distancia.",
        0.05, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "se desconoce, pero se cree que podría ser templado.");
    arrayExoplanetas[5] = new Exoplanetas("WASP-121b",
        "Es un exoplaneta gaseoso caliente que orbita una estrella similar al sol, a unos 880 años luz de distancia.",
        0.025, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Caliente y sofocante. se cree que es muy caliente, con temperaturas que alcanzan los 2,500 grados Celsius");
    arrayExoplanetas[6] = new Exoplanetas("51 Pegasi b",
        "Es un exoplaneta gaseoso caliente que fue el primer planeta extrasolar descubierto orbitando una estrella de secuencia principal.",
        0.052, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Desconocido");
    arrayExoplanetas[7] = new Exoplanetas("Gliese 581d",
        "Es un exoplaneta rocoso que orbita en la zona habitable de la estrella enana roja Gliese 581, a unos 20 años luz de distancia.",
        0.22, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Frío y posiblemente húmedo, aunque se piensa que podría ser templado");
    arrayExoplanetas[8] = new Exoplanetas("HD 40307g",
        "Es un exoplaneta rocoso que orbita en la zona habitable de una estrella similar al sol, a unos 42 años luz de distancia.",
        0.135, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Desconocido");
    arrayExoplanetas[9] = new Exoplanetas("HD 209458 b",
        "Es un exoplaneta gaseoso caliente que orbita una estrella similar al sol, a unos 150 años luz de distancia.",
        0.047, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Caliente y gaseoso. se cree que es muy caliente, con temperaturas que alcanzan los 1,000 grados Celsius");

    Tierra[] arrayTierra = new Tierra[1];

    arrayTierra[0] = new Tierra("Planeta Tierra", 0.00001581, "5.97 x 10^24", 12.742, 24, 365.25, 0, 9.81,
        "Varía según la ubicación y la época del año, pero en general, la Tierra tiene una amplia variedad de climas, desde los polos fríos hasta los trópicos cálidos, y todo lo que hay en medio.");

    Satelites[] arraySatelites = new Satelites[7];

    arraySatelites[0] = new Satelites("Encélado",
        "Es una luna de Saturno que tiene géiseres de agua que son expulsados desde su superficie. Estos géiseres han sido estudiados por la nave espacial Cassini, y se cree que pueden indicar la presencia de un océano subterráneo.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Temperaturas extremadamente frías, alrededor de -198°C.");
    arraySatelites[1] = new Satelites("Europa",
        "Es una luna de Júpiter que también se cree que tiene un océano subterráneo, y su superficie está cubierta de hielo que ha sido estudiado por la nave espacial Galileo. Se ha considerado que podría haber vida en este océano.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Superficie helada con ocasionales chorros de agua.");
    arraySatelites[2] = new Satelites("Titán",
        "Es una luna de Saturno que tiene una atmósfera densa y compuestos orgánicos en su superficie, lo que lo convierte en un objeto de interés para la investigación de la química prebiótica.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Superficie helada con lagos y mares de hidrocarburos.");
    arraySatelites[3] = new Satelites("Io",
        "Es una luna de Júpiter que es extremadamente volcánica, con más de 400 volcanes activos. Estos volcanes han sido estudiados por la nave espacial Galileo, y proporcionan información sobre los procesos geológicos en los cuerpos celestes.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162, "Superficie rocosa y volcanes activos.");
    arraySatelites[4] = new Satelites("Ganímedes",
        "Es la luna más grande de Júpiter y también tiene un océano subterráneo. Ha sido estudiado por la nave espacial Galileo y también se considera un objetivo para la búsqueda de vida en el sistema solar.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "Superficie helada con algunas zonas oscuras y brillantes.");
    arraySatelites[5] = new Satelites("Fobos",
        "Fobos y Deimos: Son dos pequeñas lunas que orbitan alrededor de Marte. Han sido estudiados por varias misiones espaciales, incluyendo la nave espacial Mars Reconnaissance Orbiter, y se cree que pueden ser asteroides capturados por la gravedad de Marte.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "No tiene atmósfera, la temperatura oscila entre -130°C y -40°C en la superficie.");
    arraySatelites[6] = new Satelites("Deimos",
        "Fobos y Deimos: Son dos pequeñas lunas que orbitan alrededor de Marte. Han sido estudiados por varias misiones espaciales, incluyendo la nave espacial Mars Reconnaissance Orbiter, y se cree que pueden ser asteroides capturados por la gravedad de Marte.",
        1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 162,
        "No tiene atmósfera, la temperatura oscila entre -143°C y -30°C en la superficie.");

    Luna[] arrayLuna = new Luna[1];

    arrayLuna[0] = new Luna("Luna", 1.28, "7,34 x 10^22", 3474.00, 27.3, 27.3, 1.28, 1.62,
        "la Luna no tiene una atmósfera significativa y no tiene un clima como la Tierra");

    int menu;

    System.out
        .println(
            "Bienvenido al programa de investigación espacial y proyecto de terraformación \u001B[31mSpace Zero Down\033[0m.");
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

    Scanner teclado = new Scanner(System.in);

    do {
      System.out.println("\n \u001B[31mSPACE ZERO DOWN PROJECT \033[0m\n");

      System.out.println(" \033[0;36mPor favor, elije una opción para visualizar información al respecto: \n\033[0m");

      System.out.println("  01. \033[0;36mReferencia: Planeta Tierra\n\033[0m");
      System.out.println("  02. Exoplaneta \u001B[31mKepler-452b\033[0m");
      System.out.println("  03. Exoplaneta \u001B[31mKepler-186f\033[0m");
      System.out.println("  04. Exoplaneta \u001B[31mKepler-438b\033[0m");
      System.out.println("  05. Exoplaneta \u001B[31mTrappist-1e\033[0m");
      System.out.println("  06. Exoplaneta \u001B[31mProxima Centauri b\033[0m");
      System.out.println("  07. Exoplaneta \u001B[31mWASP-121b\033[0m");
      System.out.println("  08. Exoplaneta \u001B[31m51 Pegasi b\033[0m");
      System.out.println("  09. Exoplaneta \u001B[31mGliese 581d\033[0m");
      System.out.println("  10. Exoplaneta \u001B[31mHD 40307g\033[0m");
      System.out.println("  11. Exoplaneta \u001B[31mHD 209458 b\033[0m\n");
      System.out.println("  12. \033[0;36mReferencia: Satélite Luna\n\033[0m");
      System.out.println("  13. Satélite \u001B[31mEncélado\033[0m");
      System.out.println("  14. Satélite \u001B[31mEuropa\033[0m");
      System.out.println("  15. Satélite \u001B[31mTitán\033[0m");
      System.out.println("  16. Satélite \u001B[31mIo\033[0m");
      System.out.println("  17. Satélite \u001B[31mGanímedes\033[0m");
      System.out.println("  18. Satélite \u001B[31mFobos\033[0m");
      System.out.println("  19. Satélite \u001B[31mDeimos\033[0m\n");
      System.out.println("  20. Exit");

      System.out.print("\nDime el número del objeto celeste para más información: ");
      
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
    teclado.close();
    System.out.println("\u001B[31mPara establecer el programa de viaje, utilice SIRI.\033[0m");
  }

}
