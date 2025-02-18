// Sistema de Gestion de Tienda
// Version: 1.0 
// Description: Programa que simula una tienda de productos, donde se pueden agregar, vender y reabastecer productos
import java.util.Scanner;
import Productos.*;
import Tienda.*;
public class Main{
    public static void main(String[] args){
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        // Prouctos en la tienda
        Tienda tienda = new Tienda();
        //Agregar productos
        tienda.agregarProducto(new Producto("Papitas", 20.5f, 10, "50g"));
        tienda.agregarProducto(new Producto("Galletas", 15.5f, 20, "100g"));
        tienda.agregarProducto(new Producto("Refresco", 10.5f, 30, "500ml"));
        System.out.println("Bienvenido a la tienda Smash, Que decea realizar?");
        do{
        System.out.println("1. Mostrar los productos disponibles");
        System.out.println("2. Ver informacion de un producto");
        System.out.println("3. Agregar un nuevo producto");
        System.out.println("4. Vender un producto (disminuir stock)");
        System.out.println("5. Reabastecer un producto (aumentar stock)");
        System.out.println("6. Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                tienda.mostrarProductos();
                break;
            case 2:
                System.out.println("Ingrese el nombre del producto: ");
                String nombrei = sc.next();
                Producto infProducto = tienda.buscarProducto(nombrei);
                if(infProducto == null){
                    System.out.println("Producto no encontrado");
                    break;
                }
                System.out.println("Nombre: " + infProducto.getNombre() + infProducto.getInformacion());
                break;
            case 3:
                System.out.println("Ingrese el nombre del producto: ");
                String nombrea = sc.next();
                sc.nextLine(); // Limpiar buffer
                System.out.println("Ingrese el precio del producto: ");
                float precioa = sc.nextFloat();
                sc.nextLine(); // Limpiar buffer
                System.out.println("Ingrese la cantidad del producto: ");
                int cantidada = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                System.out.println("Ingrese la informacion del producto: ");
                String infoa = sc.nextLine();
                tienda.agregarProducto(new Producto(nombrea, precioa, cantidada, infoa));
                break;
            case 4:
                    System.out.println("Ingrese el nombre del producto a vender: ");
                    tienda.mostrarProductos();
                    Producto nombreProducto = tienda.buscarProducto(sc.next());
                    if(nombreProducto == null){
                        System.out.println("Producto no encontrado");
                        break;
                    }
                    System.out.println("Ingrese la cantidad a vender: ");
                    int cantidadVender = sc.nextInt();
                    ((Producto)nombreProducto).vender(cantidadVender);
                break;      
            case 5:
                System.out.println("Ingrese el nombre del producto a reabastecer: ");
                tienda.mostrarProductos();
                Producto nombreR = tienda.buscarProducto(sc.next());
                if(nombreR == null){
                    System.out.println("Producto no encontrado");
                    break;
                }
                System.out.println("Ingrese la cantidad a reabastecer: ");
                int cantidadR = sc.nextInt();
                ((Producto)nombreR).Reabastecer(cantidadR);
                break;
            case 6:
                System.out.println("Gracias por visitar la tienda Smash");
                salir = false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }while(salir);
        sc.close();
    }
}