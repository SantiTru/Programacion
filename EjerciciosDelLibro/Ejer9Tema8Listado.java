package EjerciciosDelLibro;
//En las dos lineas siguientes importo tanto la funcion Varias como la funcion de Scanner
import java.util.Scanner;
import misFunciones.Varias;
/*
* Ejer9Tema8Listado.java
* Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
* elevado. Implementalo creando únicamente una función a la que le pasemos dos valores (no
* tres) y nos devuelva el máximo de los dos valores.
* @SantiTru
*/
public class Ejer9Tema8Listado {
  public static void main(String[] args) {
//Declaro las variables num1, num2 y num3 donde voy a almacenar lo que introduzca por teclado el usuario
    int num1=0;
    int num2=0;
    int num3=0;
//Llamo a Scanner para solicitar los números
    Scanner teclado= new Scanner(System.in);
    System.out.println("Dime un número: ");
    num1=teclado.nextInt();
    System.out.println("Dime otro número: ");
    num2=teclado.nextInt();
    System.out.println("Dime el último número: ");
    num3=teclado.nextInt();
    teclado.close();//cierro Scanner
/*
* Declaro la variable aux para almacenar el mayor de dos números comparados con la función mayor ya que 
* dicha función solo compara dos números
*/
    int aux= Varias.mayor(num1, num2);
//Imprimo por pantalla el resultado comparando el tercer número solicitado con el mayor almacenado en aux
    System.out.println("El mayor de los tres números es el: "+ Varias.mayor(aux, num3));
  }
  
}
