package EjerciciosDelLibro.Tema11.EjemploTema11;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
* Ejercicio C11. v2
* Implementados métodos leerTodoFichero y contarPalabras
* Comprueba nº argumentos
*
* @author Pablo Carmona
*/

public class Palabras2 {

    public static void main (String[] args) {
        if (args.length !=2){                      //Comprueba si el número de argumentos es correcto
            System.out.println("Argumentos no válidos");
            System.exit(0);
        } 
        String palabraBuscada = args[0];
        String nombreFichero = args[1]; 
        ArrayList<String> texto = leerTodoFichero(nombreFichero); //DEFINITIVO
        contarPalabras(texto, palabraBuscada); //FUNCIONAL MEJORABLE
        imprimir(texto);
    }
    
    private static ArrayList<String> leerTodoFichero(String nombreFichero) {
        ArrayList<String> textoLeido = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String linea = br.readLine();
            while (linea != null) {
                String[] palabras = linea.split(" "); //Separa por espacios
                for(String palabra : palabras) {
                    textoLeido.add(palabra);
                    textoLeido.add("|");       //Separador
                }
                textoLeido.add("\n");
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error en fichero: " + e.getMessage());
        }
        return textoLeido;
    }

    private static void contarPalabras (ArrayList<String> texto, String palabraBuscada) {
        int cuenta = 0;
        for (String palabra: texto) {
            if (palabra.equals(palabraBuscada)) { 
                cuenta++;
            }
        }
        System.out.println("Apariciones de " + palabraBuscada + " : " + cuenta);
    }

    private static void imprimir (ArrayList<String> texto) {
        for (String p: texto) {
            System.out.print(p);
        }
    }
}
