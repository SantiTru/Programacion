package EjerciciosDelLibro.Tema11.EjemploTema11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/*
* @file: Prueba11.java
* @Info: Cread un programa java "Palabras.java", al que pasándole 2 parámetros por línea de comandos: 
* el archivo y la palabra, devuelva cuántas veces se encuentra la palabra en el texto, sin distinguir mayúsculas. 
* Debe devolver un error distinto si el fichero no existe o si no es legible. Si la palabra no existe, devuelve un 
* mensaje que lo indica. El programa main debe ser mínimo, implementando las operaciones en funciones o procedimientos separados.
*
* Archivo para implementar mi parte de código.
*
* @Authors: @SantiTru 
*/
public class Prueba11 {
//se establecen las variables globales de formato.
  static final String ROJO = "\u001B[31m"; //Text red
  static final String CYAN = "\033[0;36m"; //Text cyan
  static final String RESET = "\033[0m";  // Text Reset
  static final String SEPARADOR = "|";
  static final String SALTO_LINEA = "\n"; 
  
  public static void main(String[] args) {
//En el main definimos las variables que vamos a utilizar (que llaman a otras funciones) y el Arraylist.
    String nombreFichero = obtenerNombreFichero(args);
    String opcion[] = obtenerOpciones(args);
    ArrayList<String> texto = lecturaDeArchivo(nombreFichero); 

        String palabraBuscada = "";
        for (int i = 0; i < opcion.length ; i++) {
            
          switch (opcion[i]) {

            case "-c": 
                palabraBuscada = opcion[++i];
                contarPalabras(texto, palabraBuscada);  
                break;

            case "-C": 
                palabraBuscada = opcion[++i];
                colorearPalabras(texto, palabraBuscada, ROJO);
                break;
            /*case "-d":
                palabraBuscada = opcion[++i];
                desordenar(texto, palabraBuscada);
                break;
            */
          }
        }
        imprimir(texto);
  }

    /* 
     @info: funcion que lee el archivo y devuelve un ArrayList con las lineas del archivo.  
     @param nombreFichero: nombre del archivo que se lee
     @name: lecturaDeArchivo
    */
    private static ArrayList<String> lecturaDeArchivo(String nombreFichero) {
      ArrayList<String> textoLeido = new ArrayList<>();
  //Lo metemos en un try-catch para que si hay un error, nos avise.
      try {
          BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
          String linea = br.readLine();
  //Utilizamos un bucle while para que lea todo el archivo.
          while (linea != null) {
              String[] palabras = linea.split(" ");
              for(String palabra : palabras) {
                  textoLeido.add(palabra);
                  textoLeido.add(CYAN + SEPARADOR + RESET);
              }
              textoLeido.add(SALTO_LINEA);
              linea = br.readLine();
          }
  //cerramos el archivo
          br.close();
  //En el catch capturamos la excepción que puede ocurrir y lo mostramos por pantalla.
      } catch (IOException e) {
          System.out.println("Error en fichero: " + e.getMessage());
      }
      return textoLeido;
    }

   /* Funcion para introducir el nombre del fichero por teclado en vez de por linea de comandos (desactivada)
   private static String //obtenerNombreFichero//(String[] args){
      Scanner teclado = new Scanner (System.in);
      System.out.println("Introduce el nombre del fichero: ");
      String fichero = teclado.nextLine();
      teclado.close();
      return fichero;
    */
    private static String obtenerNombreFichero(String[] args) {
      return "texto.txt";
    }

    private static String[] obtenerOpciones(String[] args) {
           
      String[] s = {"-c", "Array", "-C", "Array"};
      return s;
    }

    private static void contarPalabras (ArrayList<String> texto, String palabraBuscada) {
      int cuenta = 0;
      for (String palabra: texto) {
          if (palabra.toLowerCase().contains(palabraBuscada.toLowerCase())) { //Para no distinguir mayúsculas-minúsculas
              cuenta++;
          }
      }
      System.out.println("------------------------------------------------------------------------------");
      System.out.println("Apariciones de " + ROJO + palabraBuscada + RESET + " : " + cuenta);
      System.out.println("------------------------------------------------------------------------------");
    }

    private static int colorearPalabras (ArrayList<String> texto, String palabraBuscada, String color) {
      int cuenta = 0;
      for (int i = 0; i < texto.size(); i++) {
          if (texto.get(i).toLowerCase().contains(palabraBuscada.toLowerCase())) { //Para no distinguir mayúsculas-minúsculas
              texto.set(i, (color + texto.get(i) + RESET)); // Añade código de color y restablece detrás de la palabra
          }
      }
      return cuenta;
    }

    private static void imprimir (ArrayList<String> texto) {
      for (String p: texto) {
          System.out.print(p);
      }
    }
    private static void Contador(ArrayList<String> texto) {
      int cont=0;
  
      for (String i: texto) {
          if (i.toLowerCase().contains(SEPARADOR)) {
              cont++;
          }else{

          }
        }

      }
/*
Parte 4: Funciones de modificación
----------------------------------------------------------

Las siguientes funciones son acumulativas, es decir, que además de imprimir el resultado, se quedan permanentes para la siguiente ejecución. Si alguna no es posible implementarla como está planteado, explicad por qué en un comentario en la tarea, y qué solución podría tener.

-r: Desordena todas las palabras de cada línea aleatoriamente. No tiene parámetro de palabra.
-R: Desordena todas las palabras del texto completo aleatoriamente. No tiene parámetro de palabra.
-m: Devuelve todo el texto en minúscula. No tiene parámetro de palabra.

-M: Devuelve todo el texto en mayúscula. No tiene parámetro de palabra.

-b: Borra cada aparición de la palabra pasada como parámetro. 

-n: Usada con -b, borra la aparición n de la palabra pasada como parámetro. Ejemplo que borra la segunda aparición de la palabra "fichero": java Palabras -b fichero -n 2 -f Tema11intro.txt 
-o: Restaura el texto a su estado original. No tiene parámetro de palabra.  
*/  
  private static String[] desordenar(String[] args) {
    List<String> argList = Arrays.asList(args);
    Collections.shuffle(argList);
    return argList.toArray(new String[0]);
  }
}
