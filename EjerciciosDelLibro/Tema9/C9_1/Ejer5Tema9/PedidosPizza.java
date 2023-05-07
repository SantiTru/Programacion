package EjerciciosDelLibro.Tema9.C9_1.Ejer5Tema9;

/**
 * @info: Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada
 *        pizza
 *        se necesita saber el tamaño - mediana o familiar - el tipo -
 *        margarita, cuatro
 *        quesos o funghi - y su estado - pedida o servida. La clase debe
 *        almacenar
 *        información sobre el número total de pizzas que se han pedido y que se
 *        han servido. Siempre que se crea una pizza nueva, su estado es
 *        “pedida”.
 * @author SantiTru
 */

public class PedidosPizza {
  public static void main(String[] args) {

    Pizza pedido1 = new Pizza("margarita", "mediana");
    Pizza pedido2 = new Pizza("funghi", "familiar");
    pedido2.sirve();
    Pizza pedido3 = new Pizza("cuatro quesos", "mediana");

    System.out.println(" ");
    System.out.println(pedido1);
    System.out.println(pedido2);
    System.out.println(pedido3);
    System.out.println(" ");
    System.out.print("La pizza "+ pedido2.getVariedad() + " " + pedido2.getCalibre() + " ");
    pedido2.sirve();
    System.out.println(" ");
    System.out.println("Pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Servidas: " + Pizza.getTotalServidas());
    System.out.println(" ");
  }

}