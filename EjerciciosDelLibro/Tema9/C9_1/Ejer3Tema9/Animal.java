package EjerciciosDelLibro.Tema9.Ejer3Tema9;

/**
  @author: SantiTru
  @file: Animal.java
  @info: clase "Animal" - ejercicio 3
*/

public abstract class Animal {
  //atributos: comida, sexo, edad, color, peso, habitat
  //metodos: comer, desplazarse, esCompatible

  // atributos
    private String nombre;
    private int edad;

  /***********************************/

  // constructor
    public Animal(String nombre, int edad){
      this.nombre=nombre;

      this.edad=edad;
    }

  /***********************************/

  // métodos
    // getNombre
      public String getNombre(){
        return nombre;
      }

    /*******************/

    // getEdad
      public int getEdad(){
        return edad;
      }

    /*******************/

    // comer
      public void comer(){
        System.out.print("El animal llamado "+this.nombre+" está comiendo.");
      }

    /*******************/

    // comer
    public void moverse(){
      System.out.print("El animal llamado "+this.nombre+" se está moviendo.");
    }

    /*******************/

    // comer
    public void emitirSonido(){
      System.out.print("El animal llamado "+this.nombre+" está emitiendo un sonido.");
    }
}