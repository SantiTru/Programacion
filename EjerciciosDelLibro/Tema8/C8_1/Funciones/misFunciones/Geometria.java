package EjerciciosDelLibro.Tema8.C8_1.Funciones.misFunciones;
import java.util.Scanner;
/**
 * @file: Geometria.java
 * @info: Funciones geometricas
 * @author: SantiTru
 */
public class Geometria {
/**
*  @info: función para imprimir un menú de varias opciones ("circunferencia", "área", "volumen", "todas", "salir")
*  @return opcion: opción seleccionada
*/
    public static int menu(){
//menú
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("\nElige una opción: ");
//obtención de la opción
        Scanner teclado=new Scanner(System.in);
        int opcion=teclado.nextInt();
//cierro Scanner
        teclado.close(); 
        return opcion;    
    }
/**
*  @info: función para obtener un radio y retornarlo
*  @return radio: radio introducido
*/
    public static double pideRadio(){
//print
        System.out.print("Introduce el radio: ");
//obtención
        Scanner teclado=new Scanner(System.in);
          double radio=teclado.nextDouble();
        teclado.close(); 
        return radio;
    }
    
  

  
}