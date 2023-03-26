package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;

/**
  @author: SantiTru
  @file: PruebaZoo.java
  @info: Prueba ejercicio 3
*/

public class PruebaZoo{
  public static void main(String[] args){
    // instancia de las clases creadas
      Mamifero mamifero1=new Mamifero("Dolly", 20);
      Oviparo ovi1=new Oviparo("Perry", 3);
      Gato gato1=new Gato("Garfield", 10);
      Perro perro1=new Perro("Lassie", 18);
      Pinguino pinguino1=new Pinguino("Pingu", 6);
      Lagarto lagarto1=new Lagarto("Juancho", 70);

    /*****************************************/

    // interacciones
      // mamífero
        System.out.println("--- Métodos de la clase \"Mamifero\" ---");
        mamifero1.amamantar();
        mamifero1.correr();
        System.out.println("Nombre del mamífero: "+mamifero1.getNombre());
        System.out.println("Edad del mamífero: "+mamifero1.getEdad());

      // Oviparo
        System.out.println("\n--- Métodos de la clase \"Oviparo\" ---");
        ovi1.poneHuevos();
        ovi1.hacerNido();
        System.out.println("Nombre del ovíparo: "+ovi1.getNombre());
        System.out.println("Edad del ovíparo: "+ovi1.getEdad());

      /******************/

      // gato
        System.out.println("\n--- Métodos de la clase \"Gato\" ---");
        gato1.maullar();
        gato1.arañar();
        System.out.println("Nombre del gato: "+gato1.getNombre());
        System.out.println("Edad del gato: "+gato1.getEdad());

      /******************/

      // perro
        System.out.println("\n--- Métodos de la clase \"Perro\" ---");
        perro1.ladrar();
        perro1.morder();
        System.out.println("Nombre del perro: "+perro1.getNombre());
        System.out.println("Edad del perro: "+perro1.getEdad());

      /******************/

      // pingüino
        System.out.println("\n--- Métodos de la clase Pinguino ---");
        pinguino1.nadar();
        pinguino1.deslizarse();
        System.out.println("Nombre del pingüino: "+pinguino1.getNombre());
        System.out.println("Edad del pingüino: "+pinguino1.getEdad());

      /******************/

      // lagarto
        System.out.println("\n--- Métodos de la clase Lagarto ---");
        lagarto1.tomarElSol();
        lagarto1.cazar();
        System.out.println("Nombre del lagarto: "+lagarto1.getNombre());
        System.out.println("Edad del lagarto: "+lagarto1.getEdad());
  }
}




