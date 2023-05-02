package EjemplosDelLibro;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
* @file: EjemploArrayList.java
* @info: Programa para probar la funcionalidad de carga de ficheros.
* @author SantiTru
*/

public class EjemploFichero {
  
  public static void main (String[] args) {
    try{
      BufferedReader br = new BufferedReader (new FileReader("C:\\Usuarios\\truji\\Documentos\\Cártama.txt"));

      String linea= "";

      while (linea !=null) {
        System.out.println(linea);
        linea = br.readLine();
      }
      br.close();
    }catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero Cártama.txt");
    }catch (IOException ioe) {
      System.out.println("No se puede leer el fichero Cártama.txt");
      }
  }
}
