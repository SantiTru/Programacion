package EjerciciosDelLibro.Tema9.C9_1.Ejer5Tema9;

/**
 * @info: Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada
 *        pizza se necesita saber el tamaño - mediana o familiar - el tipo -
 *        margarita, cuatro quesos o funghi - y su estado - pedida o servida. La clase debe
 *        almacenar información sobre el número total de pizzas que se han pedido y que se
 *        han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 * 
 * @author SantiTru
 */

public class PedidosPizza {
//Programa principal del ejercicio 5 Tema 9 del libro Aprende Java con ejercicios
  public static void main(String[] args) {
//Se inician 3 pedidos de pizzas
    Pizza pedido1 = new Pizza("margarita", "mediana");
    Pizza pedido2 = new Pizza("funghi", "familiar");
//Se llama al metodo sirve() para servir la pizza del pedido 2
    pedido2.sirve();
    Pizza pedido3 = new Pizza("cuatro quesos", "mediana");
///Imprimimos por pantalla los 3 pedidos con toString que nos devuelve variedad, calibre y estado del pedido.
    System.out.println(" ");
    System.out.println(pedido1);
    System.out.println(pedido2);
    System.out.println(pedido3);
    System.out.println(" ");
//Imprimimos por pantalla la variedad y el calibre del pedido 2 seguido del metodo sirve para en este caso indicar que ya se ha servido esa pizza.
    System.out.print("La pizza "+ pedido2.getVariedad() + " " + pedido2.getCalibre() + " ");
    pedido2.sirve();
    System.out.println(" ");
//Mostramos el total de pizzas pedidas y servidas.
    System.out.println("Pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Servidas: " + Pizza.getTotalServidas());
    System.out.println(" ");
  }

}