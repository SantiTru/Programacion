package EjerciciosDelLibro.Tema9.Ejer2Tema9;

/**
* @file: Vehiculo.java
* @info: clase "Vehiculo" Ejer 2 Tema 9 Aprende Java con Ejercicios
* @author SantiTru
*/

public abstract class Vehiculo {
// atributos de clase
  private static int kilometrosTotales = 0;
// atributos de instancia
  private int kilometrosRecorridos;
  public Vehiculo() {
  this.kilometrosRecorridos = 0;
  }
  public int getKilometrosRecorridos() {
  return this.kilometrosRecorridos;
  }
  public static int getKilometrosTotales() {
  return Vehiculo.kilometrosTotales;
  }
/**
* Hace que un vehículo recorra una distancia determinada.
* 
* Cuando un vehículo recorre una distancia k, se
* incrementan su propio cuentakilómetros, es decir, su atributo
* kilometrosRecorridos y también se incrementa la cuenta
* global de kilómetros que recorren todos los vehículos, es decir, el
* atributo de clase kilometrosTotales.
*
* @param k kilómetros a recorrer
*/
  public void recorre(int k) {
  this.kilometrosRecorridos += k;
  Vehiculo.kilometrosTotales += k;
  }
}
