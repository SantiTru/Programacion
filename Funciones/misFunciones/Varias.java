package misFunciones;

/**
 * Varias.java
 * Funciones matematicas Varias
 * @SantiTru
 */

public class Varias {
/*
* @info: función para realizar la multiplicación de dos números
* @param:
*  - "a": primer número
*  - "b": segundo número
* @return: multiplicación de a * b
*/
    public static double multiplica(double a, double b) {
        return a*b;
        
    }
/*
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
}

