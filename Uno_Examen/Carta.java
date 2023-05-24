package Uno_Examen;

/**
 * Clase Carta: Juego de cartas simulado con jugadas aleatorias.
 * Contiene los métodos necesarios para crear las cartas desde el programa
 * principal en "Uno"..
 * Dependencias: Clase Jugador (instancias y estático)
 * 
 * Examen DAM DAW del 19/05/2023
 * Faltan métodos que debe implementar el/la alumno/a
 * 
 * @Author SantiTru
 * @version 19/05/2023
 */

public class Carta {

  private int numero;
  private String color;
  private static Carta cartaEnJuego;

  static final String ROJO = "\033[1;101m";
  static final String VERDE = "\033[42m";
  static final String AMARILLO = "\033[1;103m";
  static final String AZUL = "\033[0;104m";
  static final String PURPURA = "\033[1;105m";
  static final String GRIS = "\033[1;100m";
  static final String RESET = "\033[0m";

  public Carta(int numero, String color) {
    this.numero = numero;
    this.color = color;
  }

  public int getNumero() {
    return numero;
  }

  public String getColor() {
    return color;
  }

  public static void setCartaEnJuego(Carta carta) {
    cartaEnJuego = carta;
  }

  public static Carta getCartaEnJuego() {
    return cartaEnJuego;
  }

  public boolean esComodin() {
    return this.numero == 0&&PURPURA.equals(this.color);
  }

  public boolean esJugable() {
    Carta cartaEnJuego = Carta.getCartaEnJuego();
    return this.numero == cartaEnJuego.numero || this.color.equals(cartaEnJuego.color) || (this.numero == 0);
  }

  /*
   * public boolean esJugable() {
   * return (this.numero == Carta.getCartaEnJuego().numero)
   * || (!this.color.equals(Carta.getCartaEnJuego().color))
   * || (this.numero == 0 && Carta.getCartaEnJuego().numero == 0);
   * }
   */
  @Override
  public String toString() {
    return numero + " " + color + RESET;
  }

  public String dibujaFila(int fila) {
    String dibujo = "";
    switch (fila) {
      case 1:
        if (numero == 0) {
          dibujo = ROJO + "/" + PURPURA + "   " + VERDE + "\\" + RESET;
        } else {
          dibujo = "/   \\";
        }
        break;
      case 2:

        dibujo = "  " + numero + "  ";

        break;
      case 3:
        if (numero == 0) {
          dibujo = AZUL + "\\" + PURPURA + "   " + AMARILLO + "/" + RESET;
          ;
        } else {
          dibujo = "\\   /";
        }
        break;
    }
    return color + dibujo + RESET;
  }

}
