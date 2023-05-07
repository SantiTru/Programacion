package EjerciciosDelLibro.Tema10.Ejer2LisTema9Mod.ObjetosCelestes;

/**
*  @author: SantiTru
*  @file: LunaMod.java
*  @info: clase "LunaMod" hija de ObjetosCelestesMod. Programa principal SpaceZeroDownMod
*/

public class LunaMod extends ObjetosCelestesMod{

    private double distanciaASuPlaneta;   

    public LunaMod(String nombre, double distanciaASuPlaneta, String masa, double diametro, double periodoRotacion, double periodoTranslacion, double distanciaALaTierra, double gravedad, String clima){
      super(nombre, masa, diametro, periodoRotacion, periodoTranslacion, distanciaALaTierra, gravedad, clima);
  
      this.distanciaASuPlaneta=distanciaASuPlaneta;
    }
  
  /*
   * @name: informacion
   * @info: metodo que muestra la informacion de un satélite
   */
  
      @Override
        public String informacion(){
          String informacion=("\n**********SATÉLITE DE REFERENCIA**********\n ");
            informacion+="\nNombre del satélite: "+getNombre();
            informacion+="\nDistancia con la Tierra: "+this.distanciaASuPlaneta+" segundos luz";
            informacion+="\nMasa del satélite: "+getMasa()+" toneladas";
            informacion+="\nDiametro del satélite: "+getDiametro()+" Km";
            informacion+="\nPeriodo de Rotación del satélite: "+getPeriodoRotacion()+" días";
            informacion+="\nPeriodo de Translación del satélite: "+getPeriodoTranslacion()+" días";
            //informacion+="\nDistancia a la Tierra del satélite: "+getDistanciaALaTierra()+" segundos luz";
            informacion+="\nGravedad del satélite: "+getGravedad()+" m/s^2";
            informacion+="\nClima del satélite: "+getClima();
            return informacion;
        
        }
}