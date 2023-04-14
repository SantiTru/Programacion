package EjerciciosDelLibro.Tema14.C14_1.Ejer7Tema9Mod;

/**
 * Definición de la clase Zona proporcionada en el ejercicio
 * 
 * @author SantiTru
 */
public class Zona {
  
  private int entradasPorVender;
  //constructor que almacena las entradas que quedan libres
  public Zona(int n){
    entradasPorVender = n;
  }
  //metodo para acceder a la variable privada entradasPorVender
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * La función vender comprueba si quedan entradas disponibles y realiza la venta.
   * 
   * @param n: número de entradas a vender
   */
  public void vender(int n) {
  //Si la instancia entradasPorVender es igual a 0  o hemos solicitado un número superior al numero de entradas que quedan, nos da un mensaje
    if (this.entradasPorVender == 0) {
      System.out.println("No quedan entradas para esta zona.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Solo quedan " + this.entradasPorVender
                          + " entradas para esa zona.");
    }
  //Si el número de entradas solicitadas en igual o menor a las que quedan (n). Se restan a entradasPorVender las entradas solicitadas y da un mensaje al usuario
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Le llegará un email con las " + n + " entradas, gracias.");
    }
  }
}