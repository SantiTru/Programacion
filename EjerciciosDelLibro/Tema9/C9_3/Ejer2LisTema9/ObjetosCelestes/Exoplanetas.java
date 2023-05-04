package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes;

/**
*  @author: SantiTru
*  @file: Exoplanetas.java
*  @info: clase "Exoplanetas" hija de ObjetosCelestes. Programa principal SpaceZeroDown
*/

public class Exoplanetas extends ObjetosCelestes {

    private double distanciaEstrella;

    public Exoplanetas(
      String nombre, 
      double distanciaEstrella, 
      double masa, 
      double diametro, 
      double periodoRotacion, 
      double periodoTranslacion, 
      double distanciaALaTierra, 
      double gravedad, 
      String clima
      ){
    super(nombre, masa, diametro, periodoRotacion, periodoTranslacion, distanciaALaTierra, gravedad, clima);

    this.distanciaEstrella=distanciaEstrella;
    }

/*
 * @name: informacion
 * @info: metodo que muestra la informacion de un Exoplaneta
 */

    @Override
      public String informacion(){
        String informacion=("\n**********EXOPLANETAS SUSCEPTIBLES DE TERRAFORMACIÓN**********");
          informacion+="\nNombre del Exoplaneta: "+getNombre();
          informacion+="\nDistancia con su estrella: "+this.distanciaEstrella+" Km";
          informacion+="\nMasa del Exoplaneta: "+getMasa()+" toneladas";
          informacion+="\nDiametro del Exoplaneta: "+getDiametro()+" Km";
          informacion+="\nPeriodo de Rotación del Exoplaneta: "+getPeriodoRotacion()+" días";
          informacion+="\nPeriodo de Translación del Exoplaneta: "+getPeriodoTranslacion()+" días";
          informacion+="\nDistancia a la Tierra del Exoplaneta: "+getDistanciaALaTierra()+" años luz";
          informacion+="\nGravedad del Exoplaneta: "+getGravedad()+" m/s^2";
          informacion+="\nClima del Exoplaneta: "+getClima();
          return informacion;
      
      }
  
}
