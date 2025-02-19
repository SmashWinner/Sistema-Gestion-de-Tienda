package Tienda;
import Utils.Colors; // Importamos la interfaz Colors

import Productos.Producto;
import java.util.ArrayList;


public class Tienda implements Colors{ // Clase Tienda implementa la interfaz Colors
    private ArrayList<Producto> productos; // Atributo de la clase Tienda (Lista de productos)

    public Tienda() { // Constructor
        this.productos = new ArrayList<>(); // Inicializar la lista de productos
    }

    public void agregarProducto(Producto producto) { // Metodo para agregar productos
        productos.add(producto); // Agregar producto a la lista
        System.out.println(BLUE + "Producto agregado: " + producto.getNombre() + RESET);
    }

    public void mostrarProductos() { // Metodo para mostrar productos
        if (productos.isEmpty()) {
            System.out.println(RED + "No hay productos en la tienda." + RESET);
            return;
        }
        System.out.println(CYAN + "Productos disponibles:" + RESET);
        for (Producto p : productos) { // Recorrer la lista de productos
            System.out.println(BLUE + p.getNombre() + " - $" + p.getPrecio() + " - Stock: " + p.getCantidad() + RESET);
        }
    }

    public Producto buscarProducto(String nombre) { // Metodo para buscar productos
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
