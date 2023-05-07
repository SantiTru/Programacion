package EjerciciosDelLibro.Tema10.Ejer5ArrayPooTema9Mod;

import java.util.Scanner;

/**
 * @author: SantiTru
 * @file: GestisimalMod.java
 * @info: programa principal del Ejercicio 5 del Tema 9. Libro: Aprende Java con ejercicios.
 */

public class GestisimalMod {

//N determina el tamaño del array
  static final int N = 100;

  static ArticuloMod[] articulos = new ArticuloMod[N];

  public static void main(String[] args) {

//Inicializa el array
    for (int i = 0; i < N; i++) {
      GestisimalMod.articulos[i] = new ArticuloMod();
    }
//Definimos las variables 
    int opcion;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigoIntroducido = "";
    String nombreIntroducido = "";
    String familiaIntroducida = "";

    Scanner teclado = new Scanner(System.in);

//Definimos el menú
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

//Opción del menú "Listado"
        case 1:
          pintaTitulo("LISTADO");

          for (ArticuloMod a : articulos) {
            if (!a.getCodigo().equals("LIBRE")) {
              System.out.println(a);
            }
          }

          break;

//Opción del menú "Alta"
        case 2:
          pintaTitulo("NUEVO ARTÍCULO");

          if (primeraPosicionLibre() == N) {
            System.out.println("La base de datos está llena.");
          } else {

//Introducción de datos
            System.out.println("Introduzce los datos del artículo.");
            System.out.print("Código: ");

//Comprueba que el código introducido no se repita
            do {
              codigoIntroducido = teclado.nextLine();
              if (existeCodigo(codigoIntroducido)) {
                System.out.println("El código ya existe en la base de datos.");
                System.out.print("Introduzce otro código: ");
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

//Crea el nuevo artículo
            articulos[primeraPosicionLibre()] = new ArticuloMod(
                codigoIntroducido, nombreIntroducido, familiaIntroducida, precioDeCompraIntroducido,
                precioDeVentaIntroducido, stockIntroducido);
          }

          break;

//Opción del menú "Baja"
        case 3:
          pintaTitulo("BAJA");

          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            articulos[posicionConCodigo(codigoIntroducido)].setCodigo("LIBRE");
            System.out.println("Artículo borrado.");
          }

          break;

//Opción del menú "Modificación"
        case 4:
          pintaTitulo("MODIFICACIÓN");

          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.print("Introduzce los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");

            int i = posicionConCodigo(codigoIntroducido);

            System.out.println("Código: " + articulos[i].getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = teclado.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos[i].setCodigo(codigoIntroducido);
            }

            System.out.println("Nombre del producto: " + articulos[i].getNombreProducto());
            System.out.print("Nuevo nombre: ");
            nombreIntroducido = teclado.nextLine();
            if (!nombreIntroducido.equals("")) {
              articulos[i].setNombreProducto(nombreIntroducido);
            }

            System.out.println("Familia del producto: " + articulos[i].getFamilia());
            System.out.print("Nueva familia: ");
            familiaIntroducida = teclado.nextLine();
            if (!familiaIntroducida.equals("")) {
              articulos[i].setFamilia(familiaIntroducida);
            }

            System.out.println("Precio de compra: " + articulos[i].getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = teclado.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos[i].setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulos[i].getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = teclado.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos[i].setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulos[i].getStock());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = teclado.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos[i].setStock(Integer.parseInt(stockIntroducidoString));
            }
          }

          break;

//Opción del menú "Entrada de mercancía"
        case 5:
          pintaTitulo("ENTRADA DE MERCANCÍA");

          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulos[i]);
            System.out.print("Introduzce el número de unidades que entran: ");
            String stockIntroducidoString = teclado.nextLine();
            articulos[i].setStock(
                Integer.parseInt(stockIntroducidoString) + articulos[i].getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }

          break;

//Opción del menú "Salida de mercancia"
        case 6:
          pintaTitulo("SALIDA DE MERCANCÍA");

          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = teclado.nextLine();

          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Salida de mercancía del siguiente artículo: ");
            System.out.println(articulos[i]);
            System.out.print("Introduzce el número de unidades que desea sacar del almacén: ");
            stockIntroducido = Integer.parseInt(teclado.nextLine());
            if (articulos[i].getStock() - stockIntroducido > 0) {
              articulos[i].setStock(articulos[i].getStock() - stockIntroducido);
              System.out.println("La mercancía ha salido del almacén.");
            } else {
              System.out.println("Lo siento, no hay tanto producto en el almacén.");
            }
          }

          break;
//Opción del mené "Borrar todo el stock"
          case 7:
          pintaTitulo("BORRADO DE STOCK");
          borrarStock();
          System.out.println("Stock borrado.");
      } //Cerramos el switch
    } while (opcion != 8);
    System.out.println("\u001B[31mGracias por utilizar nuestro programa. ¡Hasta Luego Lucas!\033[0m");
    teclado.close();
  }

//Funciones necesarias

  /**
   * @info: Busca la primera posición libre del array. Si no quedan huecos, devuelve -1.
   * 
   * @return primera posición libre del array o -1 si no quedan huecos
   */
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }

  /**
   * @info: Dice si existe o no un artículo con un determinado código.
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
   * @info:Devuelve la posición dentro del array en la que se encuentra un artículo
   *       con un determinado código. Si el código no se encuentra, devuelve -1.
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  /**
   * @info: Borra todo el contenido del stock del array
   */
  public static void borrarStock() {
    for (ArticuloMod a : articulos) {
        if (!a.getCodigo().equals("LIBRE")) {
            a.setStock(0);
        }
    }
    System.out.println("Stock de todos los artículos borrado.");
  }


}