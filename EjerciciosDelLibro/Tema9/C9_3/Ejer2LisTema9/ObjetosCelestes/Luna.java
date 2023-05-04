package EjerciciosDelLibro.Tema9.C9_3.Ejer2LisTema9.ObjetosCelestes;

/**
*  @author: SantiTru
*  @file: Luna.java
*  @info: clase "Luna" hija de ObjetosCelestes. Programa principal SpaceZeroDown
*/

public class Luna extends ObjetosCelestes{

    private double distanciaASuPlaneta;   

    public Luna(String nombre, double distanciaASuPlaneta, double masa, double diametro, double periodoRotacion, double periodoTranslacion, double distanciaALaTierra, double gravedad, String clima){
      super(nombre, masa, diametro, periodoRotacion, periodoTranslacion, distanciaALaTierra, gravedad, clima);
  
      this.distanciaASuPlaneta=distanciaASuPlaneta;
    }
  
  /*
   * @name: informacion
   * @info: metodo que muestra la informacion de un satélite
   */
  
      @Override
        public String informacion(){
          String informacion=("\n**********SATÉLITE DE REFERENCIA**********");
            informacion+="\nNombre del satélite: "+getNombre();
            informacion+="\nDistancia con su planeta: "+this.distanciaASuPlaneta+" Km";
            informacion+="\nMasa del satélite: "+getMasa()+" toneladas";
            informacion+="\nDiametro del satélite: "+getDiametro()+" Km";
            informacion+="\nPeriodo de Rotación del satélite: "+getPeriodoRotacion()+" días";
            informacion+="\nPeriodo de Translación del satélite: "+getPeriodoTranslacion()+" días";
            informacion+="\nDistancia a la Tierra del satélite: "+getDistanciaALaTierra()+" años luz";
            informacion+="\nGravedad del satélite: "+getGravedad()+" m/s^2";
            informacion+="\nClima del satélite: "+getClima();
            return informacion;
        
        }
}