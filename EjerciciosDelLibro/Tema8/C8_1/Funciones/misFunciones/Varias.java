package EjerciciosDelLibro.Tema8.C8_1.Funciones.misFunciones;

/**
* @file: Varias.java
* @info: Funciones matematicas Varias
* @author: SantiTru
*/
public class Varias {
/**
* @info: función para realizar la multiplicación de dos números
* @param:
*  - "a": primer número
*  - "b": segundo número
* @return: multiplicación de a * b
*/
    public static double multiplica(double a, double b) {
        return a*b;
        
    }
/**
* @info: función para encontrar el mayor de dos números
* @param:
*  - "a": primer número
*  - "b": segundo número
* @return: el mayor de los dos números
*/
    public static int mayor(int a, int b){
        if (a>b){
          return a;
        }
        else{
          return b;
        }
      }
/**
* @info: función para encontrar el minimo de dos números
* @param:
*  - "a": primer número
*  - "b": segundo número
* @return: el minimo de los dos números
*/
public static int minimo(int a, int b){
  if (a<b){
    return a;
  }
  else{
    return b;
  }
}

/**
* @info: Para la función esCapicua utilizamos la función voltea. Con dicha función comprobamos si el número 
*        introducido es igual dandole la vuelta de tal manera podemos saber si es capicúa.
* @param:
*  - "num": número
* @return: true si se cumple la condición o false en caso contrario
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
      
/**
* @info: En la función esPrimo comprobamos si un número es primo. Para ello utilizamos una función Boleana.
*        Dicha función va a ejecutar un bucle en el que va a dividir el numero ingresado sucesivamente hasta 
*        llegar al propio número. Si en algún momento el resto de dicha división es cero, significa que el número 
*        no es primo ya que estos solo son divisibles por si mismos y por 1.
* @param:
*  - "num": número
* @return: true si no se cumple la condición del If o false en caso contrario
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

/**
* @info: En la función sigPrimo vamos a decirle al usuario el numero primo más próximo que siga al introducido por teclado
*        Para ello usamos una función boleana y un bucle que vaya sumando unidades hasta que se cumpla la función esPrimo 
*        en la que nos apoyamos para hacer la comprobación.
* @param:
*  - "num": número
* @return: número primo siguiente al número introducido por teclado
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
/**
* @info: En la función potencia vamos a calcular la potencia de los números introducidos por teclado.
*        Para ello usamos un bucle que vaya multiplicando la base por si misma tantas veces como marca el exponente.
*        Devolvemos el acumulado.
* @param:
*  - "b": base
*  - "e": exponente
* @return: potencia de la base y exponente introducidos por teclado
*/   
    public static int potencia(int b, int e){
      int acum;
      acum = 1;
      for(int i = 1; i <= e; i++){
        acum *= b;
      }
      return acum;
    }
/**
* @info: En la función digitos vamos a contar los digitos de un número introducido por teclado.
*        Para ello usamos un bucle que vaya dividiendo entre 10 el número y acumulando las veces.
*        Devolvemos el acumulado.
* @param:
*  - "num": número
* @return: número volteado
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
/**
*  @info: función para averiguar el signo de un número
*  @param "a": número
*  @return signo:
*    - "-1": el número es negativo
*    - "0": el número es igual a 0
*    - "1": el número es positivo
*/
  public static int dimeSigno(int a){
//declaramos variable para darle el valor al signo
      int signo;
//comprobamos con un if anidado y le damos valor a la variable "signo"
      if(a<0){
        signo=-1;
      }else if(a==0){
        signo=0;
      }else{
        signo=1;
      }
      return signo;
  }
/**
*  @info: función para calcular la suma desde 1 a "n"
*  @param n: número "n"
*  @return suma: suma de los enteros de 1 a "n"
*/
    public static int suma1N(int n){
//variable acumuladora
        int suma=0;
//bucle
        for(int i=1; i<=n; i++){
          suma+=i;
        }
        return suma;
    }
/**
*  @info: función para calcular el producto de los factoriales desde 1 a "n"
*  @param n: número "n"
*  @return producto: producto resultante de todos los factoriales de 1 a "n"
*/
    public static int producto1N(int n){
//variable para el resultado
        int producto=1;
//bucle para obtener el resultado
        for(int i=1; i<=n; i++){
          producto*=i;
        }
        return producto;
    }
/**
*  @info: función para obtener el valor intermedio entre 1 y "n"
*  @param n: número "n"
*  @return intermedio: valor intermedio de los enteros de 1 a "n"
*/
    public static double intermedio1N(int n){
//diferencia (números que se deben sumar a 1 para llegar a "n")
        int dif=0;
//cálculo de la diferencia
        for(int i=1; i<n; i++){
          dif++;
        }
//diferentes casos
        if(dif==0){
          return 0;
        }else if(dif==1){
          return 1;
        }else{
//valor intermedio
            double intermedio=(1+n)/2.0;
            return intermedio;
        }
    }
/**
*  @info: función para tabla de multiplicar
*  @param x: número del que se saca la tabla de multiplicar
*/
  public static void tablaMultiplicar(int x){
//Variable auxiliar para resetear el valor
      int aux=x;
//Bucle de 10 elementos
      for(int i=1; i<=10; i++){
        System.out.println("- "+x+"*"+i+"= "+(x*=i));
//Reseteamos la variable
          x=aux;
      }
  }
/**
*  @info: función para imprimir un triángulo de n líneas
*  @param:
*    - "c": carácter a utilizar
*    - "n": número de líneas
*/
  public static void printTiangulo(char c, int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=2*i-1; j++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
 /**
*  @info: función para averiguar la letra correspondiente a un dni
*  @param x: dni
*  @return letra: letra correspondiente
*/
    public static char obtenerLetra(int dni){
//resto del dni
        int resto = dni % 23;
//variable para la letra
        char letra;
//switch para cada letra
        switch(resto){
          case 0:
            letra='T';
          break;
          case 1:
            letra='R';
          break;
          case 2:
            letra='W';
          break;
          case 3:
            letra='A';
          break;
          case 4:
            letra='G';
          break;
          case 5:
            letra='M';
          break;
          case 6:
            letra='Y';
          break;
          case 7:
            letra='F';
          break;
          case 8:
            letra='P';
          break;
          case 9:
            letra='D';
          break;
          case 10:
            letra='X';        
          break;
          case 11:
            letra='B';
          break;
          case 12:
            letra='N';
          break;
          case 13:
            letra='J';
          break;
          case 14:
            letra='Z';
          break;
          case 15:
            letra='S';
          break;
          case 16:
            letra='Q';
          break;
          case 17:
            letra='V';
          break;
          case 18:
            letra='H';
          break;
          case 19:
            letra='L';
          break;
          case 20:
            letra='C';
          break;
          case 21:
            letra='K';
          break;
          case 22:
            letra='E';
          break;
          default:
            letra=' ';
        }
        return letra;
    }  
}

