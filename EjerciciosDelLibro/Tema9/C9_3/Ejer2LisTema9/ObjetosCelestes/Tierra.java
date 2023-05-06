package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes;

/**
 * @author: SantiTru
 * @file: Tierra.java
 * @info: clase "Tierra" hija de ObjetosCelestes. Programa principal
 *        SpaceZeroDown
 */

public class Tierra extends ObjetosCelestes {

  private double distanciaEstrella;

  public Tierra(String nombre, double distanciaEstrella, String masa, double diametro, double periodoRotacion,
      double periodoTranslacion, double distanciaALaTierra, double gravedad, String clima) {
    super(nombre, masa, diametro, periodoRotacion, periodoTranslacion, distanciaALaTierra, gravedad, clima);

    this.distanciaEstrella = distanciaEstrella;
  }

  /*
   * @name: informacion
   * 
   * @info: metodo que muestra la informacion de un Exoplaneta
   */

  @Override
  public String informacion() {
    String informacion = ("\n**********PLANETA HABITADO DE REFERENCIA**********\n");
    informacion += "\nNombre del planeta: " + getNombre();
    informacion += "\nDistancia con el sol: " + this.distanciaEstrella + " Km";
    informacion += "\nMasa del planeta: " + getMasa() + " toneladas";
    informacion += "\nDiametro del planeta: " + getDiametro() + " Km";
    informacion += "\nPeriodo de Rotación del planeta: " + getPeriodoRotacion() + " días";
    informacion += "\nPeriodo de Translación del planeta: " + getPeriodoTranslacion() + " días";
    informacion += "\nGravedad del planeta: " + getGravedad() + " m/s^2";
    informacion += "\nClima del planeta: " + getClima();
    return informacion;

  }

}
