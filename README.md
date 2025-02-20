# Sistema de Gestión de Tienda

## Descripción
Este proyecto es un sistema de gestión de tienda que permite agregar, vender y reabastecer productos. Está desarrollado en Java y simula las operaciones básicas de una tienda.

## Estructura del Proyecto
El proyecto está organizado en los siguientes paquetes y archivos:
- `Productos/Producto.java`: Define la clase `Producto` con sus atributos y métodos.
- `Tienda/Tienda.java`: Define la clase `Tienda` que gestiona una lista de productos.
- `Main.java`: Contiene el método `main` que ejecuta el programa y permite interactuar con la tienda.

## Funcionalidades
- **Agregar Producto**: Permite agregar nuevos productos a la tienda.
- **Mostrar Productos**: Muestra todos los productos disponibles en la tienda.
- **Buscar Producto**: Permite buscar un producto por su nombre.
- **Vender Producto**: Disminuye el stock de un producto.
- **Reabastecer Producto**: Aumenta el stock de un producto.

## Ejecución
Para ejecutar el programa, sigue estos pasos:
1. Compila los archivos `.java`:
    ```sh
    javac Productos/Producto.java Tienda/Tienda.java Main.java
    ```
2. Ejecuta el programa:
    ```sh
    java Main
    ```

## Uso
Al ejecutar el programa, se mostrará un menú con las siguientes opciones:
1. Mostrar los productos disponibles
2. Ver información de un producto
3. Agregar un nuevo producto
4. Vender un producto (disminuir stock)
5. Reabastecer un producto (aumentar stock)
6. Salir

Selecciona una opción ingresando el número correspondiente y sigue las instrucciones en pantalla.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas contribuir, por favor realiza un fork del repositorio y envía un pull request con tus cambios.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
