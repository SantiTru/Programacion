package EjerciciosDelLibro.Tema10.Ejer5ArrayPooTema9Mod;

import java.util.ArrayList;
import java.util.Scanner;

public class GestisimalMod {

  // ArrayList que contiene todos los artículos
  static ArrayList<ArticuloMod> articulos = new ArrayList<ArticuloMod>();

  public static void main(String[] args) {

    // Definimos las variables
    int opcion;
    String codigoIntroducido;
    String nombreIntroducido;
    String familiaIntroducida;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    int stockIntroducido;

    Scanner teclado = new Scanner(System.in);

    // Definimos el menú
    do {
      pintaTitulo("G E S T I S I M A L");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salida de toda la mercancía del stock");
      System.out.println("8. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(teclado.nextLine());

      switch (opcion) {

        // Opción del menú "Listado"
        case 1:
          pintaTitulo("LISTADO");

          for (ArticuloMod a : articulos) {
            System.out.println(a);
          }

          break;

        // Opción del menú "Alta"
        case 2:
          pintaTitulo("NUEVO ARTÍCULO");

          // Introducción de datos
          System.out.println("Introduzca los datos del artículo.");
          System.out.print("Código: ");

          // Comprueba que el código introducido no se repita
          do {
            codigoIntroducido = teclado.nextLine();
            if (existeCodigo(codigoIntroducido)) {
              System.out.println("El código ya existe en la base de datos.");
              System.out.print("Introduzca otro código: ");
            }
          } while (existeCodigo(codigoIntroducido));

          System.out.print("Nombre del producto: ");
          nombreIntroducido = teclado.nextLine();
          System.out.print("Familia del producto: ");
          familiaIntroducida = teclado.nextLine();
          System.out.print("Precio de compra: ");
          precioDeCompraIntroducido = Double.parseDouble(teclado.nextLine());
          System.out.print("Precio de venta: ");
          precioDeVentaIntroducido = Double.parseDouble(teclado.nextLine());
          System.out.print("Stock: ");
          stockIntroducido = Integer.parseInt(teclado.nextLine());

          // Crea el nuevo artículo y lo agrega a la lista de artículos
          ArticuloMod nuevoArticulo = new ArticuloMod();
          nuevoArticulo.setCodigo(codigoIntroducido);
          nuevoArticulo.setNombreProducto(nombreIntroducido);
          nuevoArticulo.setFamilia(familiaIntroducida);
          nuevoArticulo.setPrecioDeCompra(precioDeCompraIntroducido);
          nuevoArticulo.setPrecioDeVenta(precioDeVentaIntroducido);
          nuevoArticulo.setStock(stockIntroducido);
          articulos.add(nuevoArticulo);

          break;

        // Opción del menú "Baja"
        case 3:
          pintaTitulo("BAJA");

          System.out.print("Introduzca el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          boolean encontrado = false;
          for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getCodigo().equals(codigoIntroducido)) {
              articulos.remove(i);
              System.out.println("Artículo borrado.");
              encontrado = true;
              break;
            }
          }
          if (!encontrado) {
            System.out.println("El código introducido no existe.");
          }

          break;

        // Opción del menú "Modificación"
        case 4:
          pintaTitulo("MODIFICACIÓN");

          System.out.print("Introduzca el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            int i = posicionConCodigo(codigoIntroducido);

            System.out.print("Nuevo código (" + articulos.get(i).getCodigo() + "): ");
            String nuevoCodigo = teclado.nextLine();
            if (!nuevoCodigo.equals("")) {
              // Modifica el código del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setCodigo(nuevoCodigo);
            }

            System.out.print("Nuevo nombre (" + articulos.get(i).getNombreProducto() + "): ");
            nombreIntroducido = teclado.nextLine();
            if (!nombreIntroducido.equals("")) {
              // Modifica el nombre del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setNombreProducto(nombreIntroducido);
            }

            System.out.print("Nueva familia (" + articulos.get(i).getFamilia() + "): ");
            familiaIntroducida = teclado.nextLine();
            if (!familiaIntroducida.equals("")) {
              // Modifica la familia del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setFamilia(familiaIntroducida);
            }

            System.out.print("Nuevo precio de compra (" + articulos.get(i).getPrecioDeCompra() + "): ");
            String nuevoPrecioCompra = teclado.nextLine();
            if (!nuevoPrecioCompra.equals("")) {
              // Modifica el precio de compra del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setPrecioDeCompra(Double.parseDouble(nuevoPrecioCompra));
            }

            System.out.print("Nuevo precio de venta (" + articulos.get(i).getPrecioDeVenta() + "): ");
            String nuevoPrecioVenta = teclado.nextLine();
            if (!nuevoPrecioVenta.equals("")) {
              // Modifica el precio de venta del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setPrecioDeVenta(Double.parseDouble(nuevoPrecioVenta));
            }

            System.out.print("Nuevo stock (" + articulos.get(i).getStock() + "): ");
            String nuevoStock = teclado.nextLine();
            if (!nuevoStock.equals("")) {
              // Modifica el stock del artículo
              ArticuloMod articuloModificado = articulos.get(i);
              articuloModificado.setStock(Integer.parseInt(nuevoStock));
            }
          }

          break;

        // Opción del menú "Entrada de mercancía"
        case 5:
          pintaTitulo("ENTRADA DE MERCANCÍA");

          System.out.print("Introduzca el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulos.get(i));
            System.out.print("Introduzca el número de unidades que entran: ");
            String stockIntroducidoString = teclado.nextLine();
            if (!stockIntroducidoString.equals("")) {
              // Añade la cantidad de stock introducida al artículo
              ArticuloMod articuloModificado = articulos.get(i);
              int stockAnterior = articuloModificado.getStock();
              int stockEntrante = Integer.parseInt(stockIntroducidoString);
              articuloModificado.setStock(stockAnterior + stockEntrante);
              System.out.println("La mercancía ha entrado en el almacén.");
            } else {
              System.out.println("Entrada cancelada.");
            }
          }

          break;

        // Opción del menú "Salida de mercancia"
        case 6:
          pintaTitulo("SALIDA DE MERCANCÍA");

          System.out.print("Introduzca el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Salida de mercancía del siguiente artículo: ");
            System.out.println(articulos.get(i));
            System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
            stockIntroducido = Integer.parseInt(teclado.nextLine());
            if (stockIntroducido == 0) {
              System.out.println("Operación cancelada.");
            } else if (stockIntroducido < 0) {
              System.out.println("Operación incorreca.");
            } else if (articulos.get(i).getStock() - stockIntroducido >= 0) {
              // Resta la cantidad de stock introducida al artículo
              ArticuloMod articuloModificado = articulos.get(i);
              int stockAnterior = articuloModificado.getStock();
              articuloModificado.setStock(stockAnterior - stockIntroducido);
              System.out.println("La mercancía ha salido del almacén.");
            } else {
              System.out.println("No hay suficiente mercancía en el almacén.");
            }
          }

          break;

        // Opción del mené "Borrar todo el stock"
        case 7:
          pintaTitulo("BORRADO DE STOCK");
          borrarStock();
          System.out.println("Stock borrado.");
          break;
      } // Cerramos el switch
    } while (opcion != 8);
    System.out.println("\u001B[31mGracias por utilizar nuestro programa. ¡Hasta Luego Lucas!\033[0m");
    teclado.close();
  }

  // Funciones necesarias

  /**
   * @info: Dice si existe o no un artículo con un determinado código. *
   * 
   * @return true si existe el código y false si no existe
   */
  public static boolean existeCodigo(String codigo) {
    for (ArticuloMod a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  /**
   * @info: Pinta un título con subrayado.
   */
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("\033[0;36m=\033[0m");
    }
    System.out.println();
  }

  /**
   * @info:Devuelve la posición dentro del array en la que se encuentra un
   *       artículo con un determinado código. Si el código no se
   *       encuentra,
   *       devuelve -1. *
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * @info: Borra todo el contenido del stock del array
   */
  public static void borrarStock() {
    for (ArticuloMod borra : articulos) {
      borra.setStock(0);
    }
  }

}