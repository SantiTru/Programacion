package EjerciciosDelLibro.Tema11.EjemploTema11;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
* Ejercicio C11. v3
* Implementadas opciones, pero entrada de opciones por argumentos SIMULADA
* Implementados métodos cuentaPalabras y coloreaPalabras DEFINITIVOS
*
* @author Pablo Carmona
*/

public class Palabras3 {
    
    static final String ROJO = "\u001B[31m"; //Text red
    static final String CYAN = "\033[0;36m"; //Text cyan
    static final String RESET = "\033[0m";  // Text Reset
    static final String SEPARADOR = "|";
    static final String SALTO_LINEA = "\n"; 

    public static void main (String[] args) {
        String nombreFichero = obtenerNombreFichero(args); //Argumento -f SIMULADO
        String opcion[] = obtenerOpciones(args);           //SIMULADO
        ArrayList<String> texto = leerTodoFichero(nombreFichero); //DEFINITIVO

        String palabraBuscada = "";
        for (int i = 0; i < opcion.length ; i++) {
            switch (opcion[i]) {

                case "-c": //Cuenta palabras DEFINITIVO
                    palabraBuscada = opcion[++i];
                    contarPalabras(texto, palabraBuscada);  
                    break;

                case "-C": //Colorea palabras DEFINITIVO
                    palabraBuscada = opcion[++i];
                    colorearPalabras(texto, palabraBuscada, ROJO);
                    break;
            }
        }
        imprimir(texto);
    }
    
    private static ArrayList<String> leerTodoFichero(String nombreFichero) {
        ArrayList<String> textoLeido = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String linea = br.readLine();
            while (linea != null) {
                String[] palabras = linea.split(" ");
                for(String palabra : palabras) {
                    textoLeido.add(palabra);
                    textoLeido.add(CYAN + SEPARADOR + RESET);
                }
                textoLeido.add(SALTO_LINEA);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error en fichero: " + e.getMessage());
        }
        return textoLeido;
    }

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
}
