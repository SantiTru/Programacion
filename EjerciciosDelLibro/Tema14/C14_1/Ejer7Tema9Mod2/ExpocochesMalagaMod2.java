package EjerciciosDelLibro.Tema14.C14_1.Ejer7Tema9Mod2;
import java.util.Scanner;

/**
 * 7. Queremos gestionar la venta de entradas (no numeradas) de
 *    Expocoches Campanillas que tiene 3 zonas, la sala principal con
 *    1000 entradas disponibles, la zona de compra-venta con 200
 *    entradas disponibles y la zona vip con 25 entradas disponibles.
 *    Hay que controlar que existen entradas antes de venderlas.
 *    La clase <code>Zona</code> con sus atributos y métodos se
 *    proporciona al alumno.
 *    <p>
 *    El menú del programa debe ser el que se muestra a continuación.
 *    Cuando elegimos la opción <code>2</code>, se nos debe preguntar
 *    para qué zona queremos las entradas y cuántas queremos.
 *    Lógicamente, el programa debe controlar que no se puedan vender
 *    más entradas de la cuenta.
 *    <p>
 *    <code>
 *    <pre> 
 *    1. Mostrar número de entradas libres
 *    2. Vender entradas
 *    3. Salir
 *    </pre>
 *    </code>
 * @author SantiTru
 */
public class ExpocochesMalagaMod2 {
  public static void main(String[] args) {
    
    ZonaMod2 principal = new ZonaMod2(1000);
    ZonaMod2 gallinero = new ZonaMod2(200);
    ZonaMod2 vip = new ZonaMod2(25);
    
    String opcion= "";
    String opcion2= "";
    int opcionNum;
    int opcion2Num;
    int n = 0;
    
    Scanner teclado = new Scanner(System.in);
    do {
      
      System.out.println("\nEXPOCOCHES MÁLAGA");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Comprar entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion= teclado.nextLine();
      try{
      opcionNum= Integer.parseInt (opcion);
      }catch(Exception e){
        opcionNum=0;
        System.out.println("Excepcion: " + e.getClass());
        System.out.println(("Error: " + e.getMessage()));
        System.out.print("Elige una opción valida por favor.");
      }
      

      switch (opcionNum) {
        case 1:
          System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
          System.out.println("En el gallinero hay " + gallinero.getEntradasPorVender());
          System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.print("Elige la zona para la que quieres comprar las entradas: ");
          System.out.println("\n1. Principal");
          System.out.println("2. Gallinero");
          System.out.println("3. Vip");
          
            opcion2 = teclado.nextLine();    
            try{
            
            opcion2Num= Integer.parseInt (opcion2);
            
            
              System.out.print("¿Cuántas entradas quieres? ");
              n = teclado.nextInt();;

              switch (opcion2Num) {
                case 1:
                  principal.vender(n);
                  break;
                case 2:
                  gallinero.vender(n);
                  break;
                case 3:
                  vip.vender(n);
                  break;
                default:  System.out.print("Esa zona no existe");
              }
            }catch(Exception e){
              opcion2Num=0;
              System.out.println("Excepcion: " + e.getClass());
              System.out.println(("Error: " + e.getMessage()));
              System.out.print("Si quieres comprar entradas elige una opción valida si no, selecciona otra opción.");
            }  
          break;
        case 3:
        System.out.print("¡Hasta luego MariCarmen!");
        break;
            
      }
      teclado.nextLine();
      
    } while (opcionNum != 3); // salida del menú principal
      
    teclado.close();
  }
}