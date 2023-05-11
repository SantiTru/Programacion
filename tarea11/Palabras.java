package tarea11;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* @file: Palabras.java
* @Info: Programa java "Palabras.java", al que pasándole 2 parámetros por línea de comandos: 
* el archivo y la palabra, devuelva cuántas veces se encuentra la palabra en el texto, sin distinguir mayúsculas. 
* Debe devolver un error distinto si el fichero no existe o si no es legible. Si la palabra no existe, devuelve un 
* mensaje que lo indica. El programa main debe ser mínimo, implementando las operaciones en funciones o procedimientos separados.
* @Authors: @SantiTru @MarioN
*/

public class Palabras {

  // se establecen las variables globales de formato.
  static final String ROJO = "\u001B[31m"; // Variable constante para introducir parametro de color rojo
  static final String CYAN = "\033[0;36m"; // Variable constante para introducir parametro de color azul
  static final String RESET = "\033[0m"; // Variable constante para devolver al color original
  static final String SEPARADOR = "|"; // Variable constante para introducir un separador
  static final String SALTO_LINEA = "\n"; // Variable constante para añadir salto de linea

  // Programa principal
  public static void main(String[] args) {
    // En el main definimos las variables que vamos a utilizar (que llaman a otras
    // funciones) y el Arraylist.
    String nombreFichero = obtenerNombreFichero(args); // Argumento -f SIMULADO
    String opcion[] = args;
    ArrayList<String> texto = leerTodoFichero(nombreFichero); // DEFINITIVO

    String palabraBuscada = "";
    for (int i = 0; i < opcion.length; i++) {
      // Switch que se encarga de ejecutar las funciones segun la opcion que se le
      // pase por parametro.
      switch (opcion[i]) {

        case "-c": // Cuenta palabras DEFINITIVO
          palabraBuscada = opcion[++i];
          contarPalabras(texto, palabraBuscada);
          imprimir(texto);
          break;

        case "-R": // Colorea palabras DEFINITIVO
          palabraBuscada = opcion[++i];
          colorearPalabras(texto, palabraBuscada, ROJO);
          imprimir(texto);
          break;

        case "-A": // Cuenta palabras de todo el texto
          Contador(texto);
          imprimir(texto);
          break;
        case "-p": // Posición de la palabra introducida en el texto
          palabraBuscada = opcion[++i];
          DevolverPosicion(texto, palabraBuscada);
          imprimir(texto);
          break;
        case "-l": // Posición de la palabra introducida en el texto
          palabraBuscada = opcion[++i];
          DevolverLinea(texto, palabraBuscada);
          imprimir(texto);
          break;
        case "-d": // Desordena el texto
          desordenar(texto);
          imprimir(texto);
          break;
        case "-m": // Imprime el texto completamente en minusculas
          imprimirMinusculas(texto);
          break;
        case "-M": // Imprime el texto completamente en mayusculas
          imprimirMayusculas(texto);
          break;
      }
    }
  }

  /*
   * @info: funcion que lee el archivo y devuelve un ArrayList con las lineas del
   * archivo.
   * 
   * @param nombreFichero: nombre del archivo que se lee
   * 
   * @name: leerTodoFichero
   * 
   * @return: ArrayList con las lineas del archivo
   */
  public static ArrayList<String> leerTodoFichero(String nombreFichero) {
    ArrayList<String> textoLeido = new ArrayList<>();
    // Lo metemos en un try-catch para que si hay un error, nos avise.
    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      String linea = br.readLine();
      // Utilizamos un bucle while para que lea todo el archivo.
      while (linea != null) {
        String[] palabras = linea.split(" ");
        for (String palabra : palabras) {
          textoLeido.add(palabra);
          textoLeido.add(CYAN + SEPARADOR + RESET);
        }
        textoLeido.add(SALTO_LINEA);
        linea = br.readLine();
      }
      // cerramos el archivo
      br.close();
      // En el catch capturamos la excepción que puede ocurrir y lo mostramos por
      // pantalla.
    } catch (IOException e) {
      System.out.println("Error en fichero: " + e.getMessage());
    }
    return textoLeido;
  }

  /*
   * @info: funcion que obtiene el nombre del archivo que se lee.
   * 
   * @param args: argumentos de la linea de comandos
   * 
   * @name: obtenerNombreFichero
   * 
   * @return: archivo de texto indicado (es una función simulada)
   */
  public static String obtenerNombreFichero(String[] args) {
    String nombreArchivo = "";

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-f")) {
        nombreArchivo = args[++i];
      }
    }

    if (nombreArchivo.equals("")) {
      System.out.println("No se ha introducido un -f.");
    }

    return nombreArchivo; // bucle for buscando -f y en la siguiente posición (args [i+1] es el archivo)
  }

  /*
   * @info: funcion que cuenta la palabra introducida por linea de comandos en el
   * texto.
   * 
   * @param args: ArrayList de lineas del texto, palabraBuscada (introducida por
   * linea de comandos)
   * 
   * @name: contarPalabras
   */
  public static void contarPalabras(ArrayList<String> texto, String palabraBuscada) {
    int cuenta = 0; // Variable que contiene el contador de palabras
    for (String palabra : texto) { // Bucle for que recorre el ArrayList de lineas del texto
      if (palabra.toLowerCase().contains(palabraBuscada.toLowerCase())) { // Para no distinguir mayúsculas-minúsculas
        cuenta++; // incrementa el contador de palabras
      }
    }
    // imprime por pantalla el resultado del contador cuenta
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Apariciones de " + ROJO + palabraBuscada + RESET + " : " + cuenta);
    System.out.println("------------------------------------------------------------------------------");
  }

  /*
   * @info: funcion que colorea la palabra buscada en rojo en el texto.
   * 
   * @param args: ArrayList de lineas del texto, palabraBuscada (introducida por
   * linea de comandos), constante ROJO
   * 
   * @name: colorearPalabras
   * 
   * @return: contador de palabras coloreadas por la palabra introducida por linea
   * de comandos
   */
  public static int colorearPalabras(ArrayList<String> texto, String palabraBuscada, String ROJO) {
    int colorea = 0; // variable que contiene el contador de colorea
    for (int i = 0; i < texto.size(); i++) { // Bucle for que recorre el ArrayList de lineas del texto
      if (texto.get(i).toLowerCase().contains(palabraBuscada.toLowerCase())) { // Para no distinguir
                                                                               // mayúsculas-minúsculas
        texto.set(i, (ROJO + texto.get(i) + RESET)); // Añade código de color y restablece detrás de la palabra
        colorea++; // aumenta el contador de colorea para saber cuantas veces se ha coloreada la
                   // palabra.
      }
    }
    // imprime por pantalla el resultado del contador colorea
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Palabra coloreada: " + colorea + " veces.");
    System.out.println("------------------------------------------------------------------------------");
    return colorea;

  }

  /*
   * @info: funcion que cuenta las palabras del texto.
   * 
   * @param args: ArrayList de lineas del texto
   * 
   * @name: Contador
   */
  public static void Contador(ArrayList<String> texto) {
    int cont = 0; // variable que contiene el contador de contador (valga la redundancia)
    for (String i : texto) { // Bucle for que recorre el ArrayList de lineas del texto
      if (i.toLowerCase().contains(SEPARADOR)) { // Para no distinguir mayúsculas-minúsculas pasamos por toLowerCase
        cont++; // aumenta el contador
      }
    }
    // imprime por pantalla el resultado del contador
    System.out.println("--------------------------------------------");
    System.out.println("Palabras en total : " + cont);
    System.out.println("--------------------------------------------");
  }

  /*
   * @info: funcion que devuelve la posición de la palabra introducida por linea
   * de comandos en el texto.
   * 
   * @param args: ArrayList de lineas del texto, palabra (introducida por linea de
   * comandos)
   * 
   * @name: DevolverPosicion
   */
  public static void DevolverPosicion(ArrayList<String> texto, String Palabra) {
    // Variables para almacenar la posición de la palabra introducida por linea de
    // comandos en el texto
    int cont = 0;
    int posicion = 0;
    System.out.println("--------------------------------------------");
    System.out.println("Posiciones: ");
    for (String i : texto) { // Bucle for que recorre el ArrayList de lineas del texto
      // Tenemos dos if anidados que contabilizan primera la posición y después
      // comprueba si la palabra se encuentra en dicha posición
      if (i.toLowerCase().contains(SEPARADOR)) {
        cont++;

      }
      if (i.toLowerCase().contains(Palabra.toLowerCase())) {
        posicion = cont;
        // Imprime la posición de la palabra introducida por linea de comandos en el
        // texto si se ha encontrado coincidencia.
        System.out.print(posicion + ", ");
      }
    }
    System.out.print("\n");
    System.out.println("--------------------------------------------");
  }

  /*
   * @info: funcion que devuelve la linea donde se encuentra la palabra
   * introducida por linea de comandos en el texto.
   * 
   * @param args: ArrayList de lineas del texto, palabra (introducida por linea de
   * comandos)
   * 
   * @name: DevolverLinea
   */
  public static void DevolverLinea(ArrayList<String> texto, String Palabra) {
    // Variable para almacenar la linea donde se encuentra la palabra introducida
    // por linea de comandos en el texto
    int linea = 1;
    System.out.println("--------------------------------------------");
    System.out.println("Lineas que contienen la palabra: ");
    for (String i : texto) { // Bucle for que recorre el ArrayList de lineas del texto
      // Similar a la función anterior tenemos dos if anidados que contabilizan
      // primera la linea y aumenta el contador y después comprueba si la palabra se
      // encuentra en dicha linea
      if (i.contains("\n")) {
        linea++;
      }
      if (i.toLowerCase().contains(Palabra.toLowerCase())) {
        // Imprime la linea de la palabra introducida por linea de comandos en el texto
        // si se ha encontrado coincidencia.
        System.out.print(linea + ", ");
      }
    }
    System.out.print("\n");
    System.out.println("--------------------------------------------");
  }

  /*
   * @info: funcion que desordena las lineas del texto.
   * 
   * @param args: ArrayList de lineas del texto
   * 
   * @name: desordenar
   */
  public static void desordenar(ArrayList<String> texto) {
    // Usamos la clase Random para desordenar las lineas del texto
    Random desorden = new Random();
    // Mediante un bucle for que recorre el ArrayList de lineas del texto
    // almacenamos en un String temporal el contenido de cada linea.
    for (int i = texto.size() - 1; i > 0; i--) {
      int indice = desorden.nextInt(i + 1);
      String temporal = texto.get(i);
      // Despúes lo cambiamos con la función set de ArrayList para que se desordenen
      // las lineas del texto
      texto.set(i, texto.get(indice));
      texto.set(indice, temporal);
    }
  }

  /*
   * 
   * 
   * 
   * 
   * 
   * @info: funcion que imprime en minúsculas las lineas del texto.
   * 
   * @param args: ArrayList de lineas del texto
   * 
   * @name: imprimirMinusculas
   */
  public static void imprimirMinusculas(ArrayList<String> texto) {
    // Variable para almacenar cada una de las lineas del texto en minúsculas
    String textoMinusculas;
    // Al igual que en la función anterior tenemos un bucle for que recorre el
    // ArrayList de lineas del texto y almacena en un String temporal el contenido
    // de cada linea pasado a minúsculas.
    for (int i = 0; i < texto.size(); i++) {
      textoMinusculas = texto.get(i).toLowerCase();
      // En cada iteración imprimimos el String temporal en minésculas para que se
      // vaya imprimiendo el texto completo.
      System.out.print(textoMinusculas);
    }
    System.out.print("\n");
  }

  /*
   * @info: funcion que imprime en mayúsculas las lineas del texto.
   * 
   * @param args: ArrayList de lineas del texto
   * 
   * @name: imprimirMayusculas
   */
  public static void imprimirMayusculas(ArrayList<String> texto) {
    // Variable para almacenar cada una de las lineas del texto en mayúsculas
    String textoMayusculas;
    // Al igual que en la función anterior tenemos un bucle for que recorre el
    // ArrayList de lineas del texto y almacena en un String temporal el contenido
    // de cada linea pasado a mayúsculas.
    for (int i = 0; i < texto.size(); i++) {
      textoMayusculas = texto.get(i).toUpperCase();
      // En cada iteración imprimimos el String temporal en minésculas para que se
      // vaya imprimiendo el texto completo.
      System.out.print(textoMayusculas);
    }
    System.out.print("\n");
  }

  /*
   * @info: funcion que imprime el texto.
   * 
   * @param args: ArrayList de lineas del texto
   * 
   * @name: imprimir
   */
  public static void imprimir(ArrayList<String> texto) {
    for (int i = 0; i < texto.size(); i++) { // Bucle for que recorre el ArrayList de lineas del texto
      // En cada iteración imprimimos el String por el que ha pasado el bucle para que
      // se vaya imprimiendo el texto completo.
      System.out.print(texto.get(i));
    }
    // Imprimimos una linea en blanco para facilitar la visualización del texto.
    System.out.println();
  }
}