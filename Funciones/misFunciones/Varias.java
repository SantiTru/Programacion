package misFunciones;

/**
 * Varias.java
 * Funciones matematicas Varias
 * @SantiTru
 */

public class Varias {
/*
* @info:
* @param a: primer número
* @param b: segundo número
* @return: multiplicación de a * b
*/
    public static double multiplica(double a, double b) {
        return a*b;
        
    }
/*
* @info:
* @param a: primer número
* @param b: segundo número
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
}

