package EjerciciosDelLibro.Tema9.Ejer2Tema9;

public class Bicicleta extends Vehiculo {
  private int pinones; // número de piñones
  public Bicicleta(int p) {
  super();
  this.pinones = p;
  }
  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
  public void Invertido() {
    System.out.println("Estoy haciendo el invertido");
    System.out.println("Me he caido... :()");
  }
  public void SinManos() {
    System.out.println("Suelto el manillar!!");
    System.out.println("Me he caido... :()");
  }
}
