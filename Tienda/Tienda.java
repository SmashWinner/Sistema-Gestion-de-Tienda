package Tienda;
import Productos.Producto;
import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos; // Atributo de la clase Tienda (Lista de productos)

    public Tienda() { // Constructor
        this.productos = new ArrayList<>(); // Inicializar la lista de productos
    }

    public void agregarProducto(Producto producto) { // Metodo para agregar productos
        productos.add(producto); // Agregar producto a la lista
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void mostrarProductos() { // Metodo para mostrar productos
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
            return;
        }
        for (Producto p : productos) { // Recorrer la lista de productos
            System.out.println(p.getNombre() + " - $" + p.getPrecio() + " - Stock: " + p.getCantidad());
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
