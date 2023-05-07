package EjerciciosDelLibro.Tema10.Ejer2LisTema9Mod.ObjetosCelestes;

/**
 * @author: SantiTru
 * @file: ExoplanetasMod.java
 * @info: clase "ExoplanetasMod" hija de ObjetosCelestesMod. Programa principal
 *        SpaceZeroDownMod
 */

public class ExoplanetasMod extends ObjetosCelestesMod {

  private double distanciaEstrella;
  private String info;

  public ExoplanetasMod(
      String nombre,
      String info,
      double distanciaEstrella,
      String masa,
      double diametro,
      double periodoRotacion,
      double periodoTranslacion,
      double distanciaALaTierra,
      double gravedad,
      String clima) {
    super(nombre, masa, diametro, periodoRotacion, periodoTranslacion, distanciaALaTierra, gravedad, clima);

    this.distanciaEstrella = distanciaEstrella;
    this.info = info;
  }

  /*
   * @name: informacion
   * 
   * @info: metodo que muestra la informacion de un Exoplaneta
   */

  @Override
  public String informacion() {
    String informacion = ("\n**********EXOPLANETAS SUSCEPTIBLES DE TERRAFORMACIÓN**********\n ");
    System.out.println(" ");
    informacion += "\nNombre del Exoplaneta: " + getNombre();
    informacion += "\nInformación del Exoplaneta: " + this.info;
    informacion += "\nDistancia con su estrella: " + this.distanciaEstrella + " UA (Unidad Astronómica)";
    informacion += "\nMasa del Exoplaneta: " + getMasa() + " toneladas";
    informacion += "\nDiametro del Exoplaneta: " + getDiametro() + " Km";
    informacion += "\nPeriodo de Rotación del Exoplaneta: " + getPeriodoRotacion() + " días";
    informacion += "\nPeriodo de Translación del Exoplaneta: " + getPeriodoTranslacion() + " días";
    informacion += "\nDistancia a la Tierra del Exoplaneta: " + getDistanciaALaTierra() + " años luz";
    informacion += "\nGravedad del Exoplaneta: " + getGravedad() + " m/s^2";
    informacion += "\nClima del Exoplaneta: " + getClima();
    return informacion;

  }

}
