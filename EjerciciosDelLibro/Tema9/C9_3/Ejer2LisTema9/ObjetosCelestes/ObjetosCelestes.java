package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes;

/**
*  @author: SantiTru
*  @file: ObjetosCelestes.java
*  @info: clase abstracta "ObjetosCelestes" Programa principal SpaceZeroDown
*/

public abstract class ObjetosCelestes {

//Atributos de la clase ObjetosCelestes
  private String nombre;
  private double masa;
  private double diametro;
  private double periodoRotacion;
  private double periodoTranslacion;
  private double distanciaALaTierra;
  private double gravedad;
  private String clima;
  
//Constructores de la clase ObjetosCelestes

  public ObjetosCelestes(String nombre, double masa, double diametro, double periodoRotacion, double periodoTranslacion, double distanciaALaTierra, double gravedad, String clima){
  
    this.nombre=nombre;
    this.masa=masa;
    this.diametro=diametro;
    this.periodoRotacion=periodoRotacion;
    this.periodoTranslacion=periodoTranslacion;
    this.distanciaALaTierra=distanciaALaTierra;
    this.gravedad=gravedad;
    this.clima=clima;
  }

//Métodos getter para acceder a los atributos privados de la clase ObjetosCelestes 

  public String getNombre(){
    return this.nombre;
  }

  public double getMasa(){
    return this.masa;
  }

  public double getDiametro(){
    return this.diametro;
  }

  public double getPeriodoRotacion(){
    return this.periodoRotacion;
  }

  public double getPeriodoTranslacion(){
    return this.periodoTranslacion;
  }
  
  public double getDistanciaALaTierra(){
    return this.distanciaALaTierra;
  }

  public double getGravedad(){
    return this.gravedad; 
  }
  
  public String getClima(){
    return this.clima;
  }


/**
*  @name: "informacion"
*  @info: muestra la información del objeto celeste
*/

  public abstract String informacion();
}

  

