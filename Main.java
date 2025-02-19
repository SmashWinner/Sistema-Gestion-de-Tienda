// Sistema de Gestion de Tienda
// Version: 1.0 
// Description: Programa que simula una tienda de productos, donde se pueden agregar, vender y reabastecer productos
import java.util.Scanner;
import Productos.*;
import Tienda.*;
import Utils.Colors;
public class Main implements Colors{

    public static void main(String[] args){
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        // Prouctos en la tienda
        Tienda tienda = new Tienda();
        //Agregar productos
        tienda.agregarProducto(new Producto("Papitas", 20.5f, 10, "50g"));
        tienda.agregarProducto(new Producto("Galletas", 15.5f, 20, "100g"));
        tienda.agregarProducto(new Producto("Refresco", 10.5f, 30, "500ml"));
        
        System.out.println(YELLOW +"Bienvenido a la tienda Smash, Que decea realizar?"+ RESET);
        do{
        System.out.println(CYAN + "----------------------" + GREEN +"Menu" + CYAN + "------------------------" + RESET);
        System.out.println(CYAN + "1. Mostrar los productos disponibles");
        System.out.println(CYAN + "2. Ver informacion de un producto");
        System.out.println(CYAN + "3. Agregar un nuevo producto");
        System.out.println(CYAN + "4. Vender un producto (disminuir stock)");
        System.out.println(CYAN + "5. Reabastecer un producto (aumentar stock)");
        System.out.println(RED + "6. Salir" + RESET);
        System.out.println(CYAN + "--------------------------------------------------" + RESET);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                tienda.mostrarProductos();
                break;
            case 2:
                System.out.println(CYAN + "Ingrese el nombre del producto para ver su informacion: " + RESET);
                tienda.mostrarProductos();
                String nombrei = sc.next();
                Producto infProducto = tienda.buscarProducto(nombrei);
                if(infProducto == null){
                    System.out.println(GREEN + "Producto no encontrado" + RESET);
                    break;
                }
                System.out.println(CYAN + "Nombre: " + YELLOW + infProducto.getNombre() + CYAN +" - Info:" + YELLOW + infProducto.getInformacion());
                break;
            case 3:
                System.out.println(CYAN + "Ingrese el nombre del producto para agregar: "+ RESET);
                tienda.mostrarProductos();
                String nombrea = sc.next();
                sc.nextLine(); // Limpiar buffer
                System.out.println(CYAN + "Ingrese el precio del producto: "+ RESET);
                float precioa = sc.nextFloat();
                sc.nextLine(); // Limpiar buffer
                System.out.println(CYAN + "Ingrese la cantidad del producto: "+ RESET);
                int cantidada = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                System.out.println(CYAN + "Ingrese la informacion del producto: " + RESET);
                String infoa = sc.nextLine();
                tienda.agregarProducto(new Producto(nombrea, precioa, cantidada, infoa));
                break;
            case 4:
                    System.out.println(CYAN + "Ingrese el nombre del producto a vender: "+ RESET);
                    tienda.mostrarProductos();
                    Producto nombreProducto = tienda.buscarProducto(sc.next());
                    if(nombreProducto == null){
                        System.out.println(RED + "Producto no encontrado" + RESET);
                        break;
                    }
                    System.out.println(CYAN +"Ingrese la cantidad a vender: " + RESET);
                    int cantidadVender = sc.nextInt();
                    ((Producto)nombreProducto).vender(cantidadVender);
                break;      
            case 5:
                System.out.println(CYAN +"Ingrese el nombre del producto a reabastecer: "+ RESET);
                tienda.mostrarProductos();
                Producto nombreR = tienda.buscarProducto(sc.next());
                if(nombreR == null){
                    System.out.println(RED +"Producto no encontrado" + RESET);
                    break;
                }
                System.out.println(CYAN +"Ingrese la cantidad a reabastecer: "+ RESET);
                int cantidadR = sc.nextInt();
                ((Producto)nombreR).Reabastecer(cantidadR);
                break;
            case 6:
                System.out.println(CYAN +"Gracias por visitar la tienda Smash"+ RESET);
                salir = false;
                break;
            default:
                System.out.println(RED +"Opcion no valida"+ RESET);
                break;
        }
        }while(salir);
        sc.close();
    }
}