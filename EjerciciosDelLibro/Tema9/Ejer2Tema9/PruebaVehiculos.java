package EjerciciosDelLibro.Tema9.Ejer2Tema9;
import java.util.Scanner;

/**
* PruebaVehiculos.java
* 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
* como subclases de la primera. Para la clase Vehiculo , crea los
* atributos de clase vehiculosCreados y kilometrosTotales , así como
* el atributo de instancia kilometrosRecorridos . Crea también algún
* método específico para cada una de las subclases. Prueba las
* clases creadas mediante un programa con un menú como el que se
* muestra a continuación:
*
* VEHÍCULOS
* =========
* 1. Anda con la bicicleta
* 2. Haz el caballito con la bicicleta
* 3. Haz el invertido con la bicicleta
* 4. Ve sin manos en la bicicleta
* 5. Anda con el coche
* 6. Quema rueda con el coche
* 7. Ver kilometraje de la bicicleta
* 8. Ver kilometraje del coche
* 9. Ver kilometraje total
* 10. Salir
* Elige una opción (1-10):
*
* @author SantiTru
*/

public class PruebaVehiculos {
  public static void main(String[] args) {
    int opcion = 0;
    int km;
    int caidas = 0;
    Bicicleta btween = new Bicicleta(9);
    Coche kia = new Coche(1900);
    Scanner teclado = new Scanner(System.in);
    while (opcion != 10) {
    System.out.println(" ");
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Haz el invertido con la bicicleta");
    System.out.println("4. Ve sin manos en la bicicleta");
    System.out.println("5. Anda con el coche");
    System.out.println("6. Quema rueda con el coche");
    System.out.println("7. Ver kilometraje de la bicicleta");
    System.out.println("8. Ver kilometraje del coche");
    System.out.println("9. Ver kilometraje total");
    System.out.println("10. Salir");
    System.out.println("Elige una opción (1-10): ");
    opcion = teclado.nextInt();
      switch (opcion) {
        case 1:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = teclado.nextInt();
        btween.recorre(km);
        break;
        case 2:
        btween.hazCaballito();
        break;
        case 3:
        btween.Invertido();
        caidas++;
        break;
        case 4:
        btween.SinManos();
        caidas++;
        break;
        case 5:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = teclado.nextInt();
        kia.recorre(km);
        break;
        case 6:
        kia.quemaRueda();
        break;
        case 7:
        System.out.println("La bicicleta lleva recorridos ");
        System.out.println(btween.getKilometrosRecorridos() + " Km");
        if (caidas!=0){
          System.out.println("Te has caido " +caidas +" veces. No hagas más el tonto.");
        }
        break;
        case 8:
        System.out.println("El coche lleva recorridos ");
        System.out.println(kia.getKilometrosRecorridos() + " Km");
        break;
        case 9:
        System.out.println("Los vehículos llevan recorridos ");
        System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        if (caidas!=0){
          System.out.println("Te has caido " +caidas +" veces con la bicicleta. No hagas más el tonto.");
        }
        default:
      } // switch
    } // while
    teclado.close();//cierro Scanner
  }
}

