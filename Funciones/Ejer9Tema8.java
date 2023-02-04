//En las dos lineas siguientes importo tanto la funcion Varias como la funcion de Scanner
import java.util.Scanner;
import misFunciones.Varias;
/*
* Ejer9Tema8.java
* Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
* elevado. Implementalo creando únicamente una función a la que le pasemos dos valores (no
* tres) y nos devuelva el máximo de los dos valores.
* @SantiTru
*/
public class Ejer9Tema8 {
  public static void main(String[] args) {
    int num1=0;
    int num2=0;
    int num3=0;

    Scanner teclado= new Scanner(System.in);
    System.out.println("Dime un número: ");
    num1=teclado.nextInt();
    System.out.println("Dime otro número: ");
    num2=teclado.nextInt();
    System.out.println("Dime el último número: ");
    num3=teclado.nextInt();
    teclado.close();

    

  }
  
}
