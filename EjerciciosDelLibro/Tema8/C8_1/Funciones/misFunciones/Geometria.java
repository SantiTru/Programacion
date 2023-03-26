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
/**
*  @info: función para calcular el perímetro de un rectángulo
*  @param:
*    - "ancho": ancho del rectángulo
*    - "alto": alto del rectángulo
*  @return perimetro: perímetro del rectángulo
*/
    public static double perimetroRectangulo(double ancho, double alto){
//variable para el perímetro
        double perimetro=(ancho*=2)+(alto*=2);
        return perimetro;
    }
/**
*  @info: función para calcular el área de un rectángulo
*  @param:
*    - "ancho": ancho del rectángulo
*    - "alto": alto del rectángulo
*  @return area: área del rectángulo
*/
    public static double areaRectangulo(double ancho, double alto){
//variable para el perímetro
        double area=ancho*alto; 
        return area;
    }  
/**
*  @info: función para calcular la circunferencia dado un radio
*  @param radio: radio introducido
*  @return circunferencia: circunferencia del radio
*/
    public static double circunferencia(double radio){
//constantes para pi
        final double pi=3.1416;   
//cálculo de la circunferencia
        double circunferencia=2*pi*radio;   
        return circunferencia;
    }
/**
*  @info: función para calcular el área de un circulo dado un radio
*  @param radio: radio introducido
*  @return area: área del circulo
*/
    public static double areaCirculo(double radio){
//constantes para pi
        final double pi=3.1416;   
//cálculo del área
        double area=pi*Math.pow(radio, 2);  
        return area;
    }
/**
*  @info: función para calcular el volumen de una esfera dado un radio
*  @param radio: radio introducido
*  @return volumen: volumen de la esfera
*/
    public static double volumenCirculo(double radio){
//constantes para pi
        final double pi=3.1416;   
//cálculo del área
        double volumen=(4/3)*pi*Math.pow(radio, 3); 
        return volumen;
    }
}