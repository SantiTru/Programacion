package EjerciciosDelLibro;

import java.util.Scanner;

/*
*Ejer1_6Tema8.java
*Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. 
*1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
*2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
*3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
*4. potencia: Dada una base y un exponente devuelve la potencia.
*5. digitos: Cuenta el número de dígitos de un número entero.
*6. voltea: Le da la vuelta a un número.
*@SantiTru
*/

public class Ejer1_6Tema8 {
  
//Función 6, voltea
  public static int voltea(int num){
//Declaramos la variable numVolt para almacenar el número volteado
    int numVolt;
    numVolt = 0;
//Declaramos la variable resto necesaria para nuestra acción de volteado
    int resto;
    resto = 1;
//Iniciamos un bucle que se va a repetir mientras nuestro número llega hasta 0
    while(num > 0){
/*
*Para voltear un número tenemos que "extraer" los digitos de los que se compone. 
*Para extraer el último digito de un número primero averiaguamos el resto de su división con 10.
*Este resto será su último digito por lo que lo almacenamos en la variable numVolt.
*Para ello, múltiplicamos numVolt por 10 y le sumamos el resto. De tal manera que ese digito extraido vaya 
*pasando de su posición anterior a la nueva posición.
*luego dividimos el numero dado por el usuario entre 10 y almacenamos su nuevo valor. De esta manera descartamos 
*el último digito que nos de y repetimos el bucle con el nuevo valor hasta llegar a cero.
*/
      resto = num % 10;
      numVolt = numVolt * 10 + resto;
      num /= 10;
    }
/*
*Una vez completado el bucle tendremos el número volteado almacenado en la variable numVolt por lo que le pedimos 
*a nuestra función que lo muestre.
*/
    return numVolt;
  }

  //Función 1, esCapicua
  public static boolean esCapicua(int num){
    int numVolt;
    numVolt = voltea(num);

    if(num == numVolt){
      return true;
    }
    return false;
  }

  //Función 2, esPrimo
  public static boolean esPrimo(int num){
    for(int i = 2; i < num; i++){
      if(num%i == 0){
        return false;
      } 
    }    
    return true;
  }

  //Función 3, sigPrimo
  public static int sigPrimo(int num){
    boolean primo;
    primo = false;

    while (primo == false){
      num++;
      primo = esPrimo(num);
    }

    return num;
  }

  //Función 4, potencia
  public static int potencia(int b, int e){
    int acum;
    acum = 1;

    for(int i = 1; i <= e; i++){
      acum *= b;
    }
    return acum;
  }

  //Función 5, digitos
  public static int digitos(int num){
    int cantNum;
    cantNum = 0;

    while(num > 0){
      cantNum++;
      num /= 10;
    }
    return cantNum;  
  }


  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    //1. Usamos la función esCapicua

    System.out.println("1.- Vamos a comprobar si un número es capicúo.");
    System.out.print("Introduce el número: ");
    int numCapi;
    numCapi = teclado.nextInt();
    
    boolean capiONo;
    capiONo = esCapicua(numCapi);

    if(capiONo){
      System.out.println("El número " + numCapi + " es capicúo");
    } else {
      System.out.println("El número " + numCapi + " no es capicúo");
    }
    System.out.println("");

    //2. Usamos la función esPrimo

    System.out.println("2.- Vamos a comprobar si un número es primo o no.");
    System.out.print("Introduce el número: ");
    int numPrim;
    numPrim =  teclado.nextInt();

    boolean primONo;
    primONo = esPrimo(numPrim);

    if(primONo){
      System.out.println("Tu número es primo");
    } else {
      System.out.println("Tu número no es primo");
    }
    System.out.println("");

    //3.Usamos la función sigPrimo
    System.out.println("3.- Vamos a comprobar el siguiente número primo a uno introducido.");
    System.out.print("Introduce el número: ");
    int numParaSigPrimo;
    numParaSigPrimo =  teclado.nextInt();

    int numSigPrimo;
    numSigPrimo = sigPrimo(numParaSigPrimo);

    System.out.println("A partir de número " + numParaSigPrimo + ", el siguiente primo es: " + numSigPrimo);
    System.out.println("");

    //4. Usamos la función potencia
    System.out.println("4.- Vamos a calcular una potencia.");
    System.out.print("Introduce la base: ");
    int numBase;
    numBase =  teclado.nextInt();

    System.out.print("Introduce el exponente: ");
    int numExp;
    numExp =  teclado.nextInt();

    int pot;
    pot = potencia(numBase, numExp);

    System.out.println(numBase + " ^ " + numExp + " = " + pot);
    System.out.println("");

    //5. Usamos la función digitos
    System.out.println("5.- Vamos a comprobar la cantidad de dígitos de un número.");
    System.out.print("Introduce el número: ");
    int numDig;
    numDig =  teclado.nextInt();

    int cantDig;
    cantDig = digitos(numDig);

    System.out.println("El número " + numDig + " tiene " + cantDig + " dígitos");
    System.out.println("");

    //6. Usamos la función voltea
    System.out.println("6.- Vamos a voltear un número.");
    System.out.print("Introduce el número: ");
    int numParaVolt;
    numParaVolt =  teclado.nextInt();

    int numVolt;
    numVolt = voltea(numParaVolt);

    System.out.println("El número " + numParaVolt + " volteado es " + numVolt + ".");
    
    teclado.close();

  }
}

