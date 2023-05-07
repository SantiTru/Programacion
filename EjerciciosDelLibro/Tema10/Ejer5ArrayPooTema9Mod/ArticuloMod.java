package EjerciciosDelLibro.Tema10.Ejer5ArrayPooTema9Mod;

/**
 * @author: SantiTru
 * @file: ArticuloMod.java
 * @info: clase "ArticuloMod" Programa principal GestisimalMod.java
 */

 public class ArticuloMod {
  //Definicion de variables de clase Articulo.
    private String codigo;
    private String nombreProducto;
    private String familia;
    private double precioDeCompra;
    private double precioDeVenta;
    private int stock;
  
    public ArticuloMod() {
      this.codigo = "LIBRE";
    }
  //Establecemos los valores de las variables de clase Articulo.
    public ArticuloMod(
      String codigo, String nombreProducto, String familia, double precioDeCompra,
      double precioDeVenta, int stock) {
        
      this.codigo = codigo;
      this.nombreProducto = nombreProducto;
      this.familia = familia; 
      this.precioDeCompra = precioDeCompra;
      this.precioDeVenta = precioDeVenta;
      this.stock = stock;
    }
  //Declaramos los metodos get y set de la clase Articulo.
    public String getCodigo() {
      return codigo;
    }
  
    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
  
    public String getNombreProducto() {
      return nombreProducto;
    }
  
    public void setNombreProducto(String nombreProducto) {
      this.nombreProducto = nombreProducto;
    }
  
    public String getFamilia() {
      return familia;
    }
  
    public void setFamilia(String familia) {
      this.familia = familia;
    }
  
    public double getPrecioDeCompra() {
      return precioDeCompra;
    }
  
    public void setPrecioDeCompra(double precioDeCompra) {
      this.precioDeCompra = precioDeCompra;
    }
  
    public double getPrecioDeVenta() {
      return precioDeVenta;
    }
  
    public void setPrecioDeVenta(double precioDeVenta) {
      this.precioDeVenta = precioDeVenta;
    }
  
    public int getStock() {
      return stock;
    }
  
    public void setStock(int stock) {
      this.stock = stock;
    }
  //Definimos el metodo toString de la clase Articulo.
    public String toString() {
      String cadena = "------------------------------------------\n";
      cadena += "Código: " + this.codigo + "\n";
      cadena += "Nombre del producto: " + this.nombreProducto + "\n";
      cadena += "Familia del producto: " + this.familia + "\n";
      cadena += "Precio de compra: " + this.precioDeCompra + "\n";
      cadena += "Precio de venta: " + this.precioDeVenta + "\n";
      cadena += "Stock: " + this.stock + " unidades\n";
      cadena += "------------------------------------------\n";
      return cadena;
    }
  }