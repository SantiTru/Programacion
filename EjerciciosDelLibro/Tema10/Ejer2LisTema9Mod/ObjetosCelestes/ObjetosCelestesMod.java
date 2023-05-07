package EjerciciosDelLibro.Tema10.Ejer2LisTema9Mod.ObjetosCelestes;

/**
 * @author: SantiTru
 * @file: ObjetosCelestesMod.java
 * @info: clase abstracta "ObjetosCelestesMod" Programa principal SpaceZeroDownMod
 */

public abstract class ObjetosCelestesMod {

  // Atributos de la clase ObjetosCelestesMod
  private String nombre;
  private String masa;
  private double diametro;
  private double periodoRotacion;
  private double periodoTranslacion;
  private double distanciaALaTierra;
  private double gravedad;
  private String clima;

  // Constructores de la clase ObjetosCelestesMod

  public ObjetosCelestesMod(String nombre, String masa, double diametro, double periodoRotacion, double periodoTranslacion,
      double distanciaALaTierra, double gravedad, String clima) {

    this.nombre = nombre;
    this.masa = masa;
    this.diametro = diametro;
    this.periodoRotacion = periodoRotacion;
    this.periodoTranslacion = periodoTranslacion;
    this.distanciaALaTierra = distanciaALaTierra;
    this.gravedad = gravedad;
    this.clima = clima;
  }

  // Métodos getter para acceder a los atributos privados de la clase ObjetosCelestesMod

  public String getNombre() {
    return this.nombre;
  }

  public String getMasa() {
    return this.masa;
  }

  public double getDiametro() {
    return this.diametro;
  }

  public double getPeriodoRotacion() {
    return this.periodoRotacion;
  }

  public double getPeriodoTranslacion() {
    return this.periodoTranslacion;
  }

  public double getDistanciaALaTierra() {
    return this.distanciaALaTierra;
  }

  public double getGravedad() {
    return this.gravedad;
  }

  public String getClima() {
    return this.clima;
  }

  /**
   * @name: "informacion"
   * @info: muestra la información del objeto celeste
   */

  public abstract String informacion();
}
