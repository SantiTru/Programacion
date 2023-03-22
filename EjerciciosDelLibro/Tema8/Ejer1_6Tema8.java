package EjerciciosDelLibro.Tema8;

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

//Función 1, esCapicua
/*
*Para la función esCapicua utilizamos la función voltea. Con dicha función comprobamos si el número 
*introducido es igual dandole la vuelta de tal manera podemos saber si es capicúa.
*/
  public static boolean esCapicua(int num){
//Declaramos la variable numVolt para llamar a la función voltea y aplicarla al número introducido
    int numVolt;
    numVolt = voltea(num);
//Con un condicional If comprobamos si la condición num == numVolt se cumple como verdadero o falso.
    if(num == numVolt){
      return true;
    }
    return false;
//De esta manera en el main podemos declarar una variable booleana y con un condicional hacer la comprobación
  }

//Función 2, esPrimo
/*
*En la función esPrimo comprobamos si un número es primo. Para ello utilizamos una función Boleana.
*Dicha función va a ejecutar un bucle en el que va a dividir el numero ingresado sucesivamente hasta 
*llegar al propio número. Si en algún momento el resto de dicha división es cero, significa que el número 
*no es primo ya que estos solo son divisibles por si mismos y por 1.
*/
  public static boolean esPrimo(int num){
//Iniciamos el bucle en 2 ya que los números primos son divisibles por 1
    for(int i = 2; i < num; i++){
//Marcamos la condición en la que vemos si el resto es 0.
      if(num%i == 0){
//Si el resto es 0 no es primo por lo que retornamos Falso
        return false;
      } 
    }    
//Si no se cumple la condición retornamos Verdadero
    return true;
  }

//Función 3, sigPrimo
/*
*En la función sigPrimo vamos a decirle al usuario el numero primo más próximo que siga al introducido por teclado
*Para ello usamos una función boleana y un bucle que vaya sumando unidades hasta que se cumpla la función esPrimo 
*en la que nos apoyamos para hacer la comprobación. 
*/
  public static int sigPrimo(int num){
//Declaramos la variable booleana primo y le damos valor de falso para así condicionar nuestro bucle.
    boolean primo;
    primo = false;
//En nuestro bucle vamos a ir aplicando la función esPrimo e incrementando 1 a 1 nuestra variable num
    while (primo == false){
      num++;
      primo = esPrimo(num);
    }
//Cuando se cumple la condición y nuestra función esPrimo devuelve verdadero retornamos el numero incrementado
    return num;
  }

//Función 4, potencia
/*
*En la función potencia vamos a calcular la potencia de los números introducidos por teclado.
*Para ello usamos un bucle que vaya multiplicando la base por si misma tantas veces como marca el exponente.
*Devolvemos el acumulado.
*/
  public static int potencia(int b, int e){
    int acum;
    acum = 1;

    for(int i = 1; i <= e; i++){
      acum *= b;
    }
    return acum;
  }

//Función 5, digitos
/*
*En la función digitos vamos a contar los digitos de un número introducido por teclado.
*Para ello usamos un bucle que vaya dividiendo entre 10 el número y acumulando las veces.
*Devolvemos el acumulado.
*/
  public static int digitos(int num){
    int cantNum;
    cantNum = 0;

    while(num > 0){
      cantNum++;
      num /= 10;
    }
    return cantNum;  
  }
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
  

  public static void main(String[]args){
//Llamamos a Scanner
    Scanner teclado = new Scanner(System.in);

//Ejer. 1. Usamos la función esCapicua
//Solicitamos al usuario el número para comprobar si es capicúa
    System.out.println("Ejer 1.- Vamos a comprobar si un número es capicúa.");
    System.out.print("Dime el número: ");
//Declaramos la variable numCapi para recoger lo introducido por teclado por el usuario    
    int numCapi;
    numCapi = teclado.nextInt();
//Declaramos la variable capiSiNo para aplicar la función esCapicua    
    boolean capiSiNo;
    capiSiNo = esCapicua(numCapi);
//Aplicamos un If para comprobar si la función nos devuelve verdadero o falso e imprimir según el caso por pantalla
    if(capiSiNo){
      System.out.println("El número " + numCapi + " es capicúa");
    } else {
      System.out.println("El número " + numCapi + " no es capicúa");
    }
//Este print es simplemente estetico para dar espacio en el terminal con la siguiente función
    System.out.println("");

//Ejer. 2. Usamos la función esPrimo

    System.out.println("Ejer 2.- Vamos a comprobar si un número es primo o no.");
    System.out.print("Dime el número: ");
    int numPrim;
    numPrim =  teclado.nextInt();

    boolean primONo;
    primONo = esPrimo(numPrim);

    if(primONo){
      System.out.println("Tu número es primo");
    } else {
      System.out.println("Tu número no es primo");
    }
//Este print es simplemente estetico para dar espacio en el terminal con la siguiente función
    System.out.println("");

//Ejer. 3.Usamos la función sigPrimo
    System.out.println("Ejer 3.- Vamos a comprobar el siguiente número primo a uno introducido.");
    System.out.print("Dime el número: ");
    int numParaSigPrimo;
    numParaSigPrimo =  teclado.nextInt();

    int numSigPrimo;
    numSigPrimo = sigPrimo(numParaSigPrimo);

    System.out.println("A partir de número " + numParaSigPrimo + ", el siguiente primo es: " + numSigPrimo);
//Este print es simplemente estetico para dar espacio en el terminal con la siguiente función    
    System.out.println("");

//Ejer. 4. Usamos la función potencia
    System.out.println("Ejer 4.- Vamos a calcular una potencia.");
    System.out.print("Dime la base: ");
    int numBase;
    numBase =  teclado.nextInt();

    System.out.print("Dime el exponente: ");
    int numExp;
    numExp =  teclado.nextInt();

    int pot;
    pot = potencia(numBase, numExp);

    System.out.println(numBase + " ^ " + numExp + " = " + pot);
//Este print es simplemente estetico para dar espacio en el terminal con la siguiente función    
    System.out.println("");

//Ejer. 5. Usamos la función digitos
    System.out.println("Ejer 5.- Vamos a comprobar la cantidad de dígitos de un número.");
    System.out.print("Dime el número: ");
    int numDig;
    numDig =  teclado.nextInt();

    int cantDig;
    cantDig = digitos(numDig);

    System.out.println("El número " + numDig + " tiene " + cantDig + " dígitos");
//Este print es simplemente estetico para dar espacio en el terminal con la siguiente función    
    System.out.println("");

//Ejer. 6. Usamos la función voltea
//Solicitamos al usuario el número que vamos a voltear
    System.out.println("Ejer 6.- Vamos a darle la vuelta a un número.");
    System.out.print("Dime el número: ");
    int numParaVoltear;
    numParaVoltear = teclado.nextInt();
//Llamamos a la función
    int numVolt;
    numVolt = voltea(numParaVoltear);

    System.out.println("El número " + numParaVoltear + " volteado es " + numVolt + ".");
    
    teclado.close();

  }
}

