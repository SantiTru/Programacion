
public class Ficha {

  // atributos
  private int lado1;
  private int lado2;
  private static int NumFichasCreadas;

  // constructores
  public Ficha(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    Ficha.NumFichasCreadas++;
  }

  public Ficha() {
    lado1 = (int) (Math.random() * 6 + 1);
    lado2 = (int) (Math.random() * 6 + 1);
    Ficha.NumFichasCreadas++;
  }

  // Getter
  public static int getNumFichasCreadas() {
    return NumFichasCreadas;
  }

  // métodos
  public Ficha voltea() {
    Ficha.NumFichasCreadas--;
    return new Ficha(lado2, lado1);
  }

  public boolean encaja(Ficha Ficha) {
    return (this.lado1 == Ficha.lado1)
        || (this.lado1 == Ficha.lado2)
        || (this.lado2 == Ficha.lado1)
        || (this.lado2 == Ficha.lado2);
  }

  /*
   * otra posibilidad de toString
   * @Override
   * public String toString() {
   * return "[" + (lado1 == 0 ? " " : lado1) + "||" + (lado2 == 0 ? " " : lado2) +
   * ']';
   * }
   */
  @Override
  public String toString() {
    String l1 = Integer.toString(this.lado1);
    String l2 = Integer.toString(this.lado2);
    if (this.lado1 == 0) {
      l1 = " ";
    }
    if (this.lado2 == 0) {
      l2 = " ";
    }
    return "[" + l1 + "||" + l2 + ']';
  }

}
