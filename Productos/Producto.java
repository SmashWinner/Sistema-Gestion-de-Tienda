package Productos;

public class Producto {

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
        System.out.println("Se han vendido " + cantidad + " unidades de " + this.nombre);
    }

    public void Reabastecer(int cantidad){ // Metodo para reabastecer
        this.cantidad += cantidad;
        System.out.println("Se han reabastecido " + cantidad + " unidades de " + this.nombre);
    }

}
