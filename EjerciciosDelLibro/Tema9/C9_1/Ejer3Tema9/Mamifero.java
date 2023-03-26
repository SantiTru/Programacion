package EjerciciosDelLibro.Tema9.C9_1.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Mamifero.java
  @info: clase "Mamifero" - ejercicio 3
*/

  //atributos: lactante,
  //metodos: @override andar, comer

public class Mamifero extends Animal{
  // constructor
    public Mamifero(String nombre, int edad){
      // se llama al constructor de la clase "Animal" y se le pasan el nombre y la edad
        super(nombre, edad);
    }

  /******************************************/

  // métodos
    // amamantar
      public void amamantar(){
        System.out.println("El mamífero está amantando.");
      }
    
    // correr
      public void correr(){
        System.out.println("El mamífero está corriendo.");
      }
}



