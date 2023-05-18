
public class Ficha {

  //atributos
  private int lado1;
  private int lado2;
  private static int NumFichasCreadas;

  //constructores
  public Ficha (int lado1, int lado2){
    this.lado1=lado1;
    this.lado2=lado2;
    Ficha.NumFichasCreadas++;
  }
  public static int getNumFichasCreadas(){
    return NumFichasCreadas;
  }
    
  //métodos
  public Ficha voltea(){
    return new Ficha(lado2, lado1);
  }
  
  public boolean encaja(Ficha Ficha){
    return (this.lado1==Ficha.lado1)
    || (this.lado1==Ficha.lado2)
    || (this.lado2==Ficha.lado1)
    || (this.lado2==Ficha.lado2);
  }
  @Override
  public String toString() {
    return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + ']';
  }

}
