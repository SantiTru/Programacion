package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9;
import java.util.Scanner;

import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Exoplanetas;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Satelites;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Tierra;
import EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes.Luna;

/**
*  @author: SantiTru
*  @file: SpaceZeroDown.java
*  @info: programa principal del Ejercicio 2 del libro Tema 9
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

    do{
      System.out.println("\n\n\n Bienvenido al programa SPACE ZERO DOWN");
      System.out.println("\n\n\n Elija una opción para visualizar información al respecto: ");
      System.out.println("\n\n\n 1. Referencia: Planeta Tierra");
      System.out.println("\n\n\n 2. Kepler-452b");
      System.out.println("\n\n\n 3. Kepler-186f");
      System.out.println("\n\n\n 4. Kepler-438b");
      System.out.println("\n\n\n 5. Trappist-1e");
      System.out.println("\n\n\n 6. Proxima Centauri b");
      System.out.println("\n\n\n 7. WASP-121b");
      System.out.println("\n\n\n 8. 51 Pegasi b");
      System.out.println("\n\n\n 9. Gliese 581d");
      System.out.println("\n\n\n 10. HD 40307g");
      System.out.println("\n\n\n 11. HD 209458 b");





    }while(menu!=24);

  }
  
}
