package EjerciciosDelLibro.Tema11.EjemploTema11;
import java.util.ArrayList;

public class Palabras1 {

    public static void main (String[] args) {
        String palabraBuscada = args[0];
        String nombreFichero = args[1]; 
        System.out.println("Palabra: " + palabraBuscada + "; Fichero: " + nombreFichero); //TEST
        ArrayList<String> texto = leerTodoFichero(nombreFichero); //SIMULADO
        contarPalabras(texto, palabraBuscada); //SIMULADO
        imprimir(texto);
    }
    
    private static ArrayList<String> leerTodoFichero(String nombreFichero) {
        ArrayList<String> textoLeido = new ArrayList<>();
        textoLeido.add("1");
        textoLeido.add("2");
        textoLeido.add("3");
        textoLeido.add("probando");
        return textoLeido;
    }

    private static void contarPalabras (ArrayList<String> texto, String palabraBuscada) {
        int cuenta=0;
        System.out.println("Apariciones de " + palabraBuscada + " : " + cuenta);
    }

    private static void imprimir (ArrayList<String> texto) {
        for (String p: texto) {
            System.out.print(p);
        }
    }
}
