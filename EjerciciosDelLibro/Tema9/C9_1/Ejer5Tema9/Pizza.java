package EjerciciosDelLibro.Tema9.C9_1.Ejer5Tema9;

/**
 * Definición de la clase Pizza programa principal PedidosPizza.
 * 
 * @author SantiTru
 */

public class Pizza {
    private String variedad;
    private String calibre;
    private boolean servida;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    public Pizza(String variedad, String calibre) {
        this.variedad = variedad;
        this.calibre = calibre;
        this.servida = false;
        totalPedidas++;
    }
    public void sirve() {
        if (!this.servida) {
            this.servida = true;
            totalServidas++;
        } else {
            System.out.println("ya se ha servido");
          }
    }
    public static int getTotalPedidas() {
        return totalPedidas;
    }
    public static int getTotalServidas() {
        return totalServidas;
    }
    public String getVariedad() {
        return variedad;
    }
    public String getCalibre() {
        return calibre;
    }
    @Override
    public String toString() {
        String estado = this.servida ? "Servida" : "Pedida";
        return "Pizza " + this.variedad + " " + this.calibre + ", " + estado;
    }
}