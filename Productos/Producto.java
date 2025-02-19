package Productos;
import Utils.Colors;

public class Producto implements Colors{ // Clase Producto implementa la interfaz Colors

    private String nombre; // Atributos
    private float precio;
    private int cantidad;
    private String Informacion;

    public Producto(String nombre, float precio, int cantidad, String Informacion){ // Constructors
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.Informacion = Informacion;
    }

    public String getNombre(){return this.nombre;} // Getter

    public float getPrecio(){return this.precio;} // Getter

    public int getCantidad(){ return this.cantidad;} // Getter

    public String getInformacion() {return this.Informacion;} // Getter

    

    public void vender(int cantidad){ // Metodo para vender
        this.cantidad -= cantidad; 
        System.out.println(PURPLE + "Se han vendido " + cantidad + " unidades de " + this.nombre + RESET);
        System.out.println(PURPLE + "Quedan " + this.cantidad + " unidades de " + this.nombre + RESET);
    }

    public void Reabastecer(int cantidad){ // Metodo para reabastecer
        this.cantidad += cantidad;
        System.out.println(PURPLE + "Se han reabastecido " + cantidad + " unidades de " + this.nombre + RESET);
        System.out.println(PURPLE + "Ahora hay " + this.cantidad + " unidades de " + this.nombre + RESET);
    }

}
