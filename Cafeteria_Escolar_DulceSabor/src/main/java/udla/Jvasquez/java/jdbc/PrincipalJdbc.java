package udla.Jvasquez.java.jdbc;

import java.util.Scanner;

public class PrincipalJdbc {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();   //Instanciamos Inventario
        Scanner scanner = new Scanner(System.in);  //para ingresar datos

        int opcion;
                            //Menu Principal
        do {
            System.out.println("");
            System.out.println("*****Bienvenidos a Cafeteria Escolar Dulce Sabor*****");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto ");
            System.out.println("4. Vender Productos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente (para evitar bugs de ingreso)

                                        //opciones del menu
            switch (opcion) {
                case 1:
                    inventario.mostrarProductosDesdeBaseDeDatos();  // llama a metodo para mostrar productos
                    break;

                case 2:
                    Producto producto = ingresarProducto(scanner); //para ingresar productos
                    inventario.agregarProducto(producto);        // llama a metodo para agregar productos en la lista
                    inventario.sincronizarConBaseDeDatos();   //llama metodo de sincronizar para subir la lista a la base
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine(); //para ingresar
                    inventario.eliminarProductoPorNombre(nombreEliminar); //llama metodo para eliminar base de datos
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto que desea vender: ");
                    String nombreProducto = scanner.nextLine();

                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVenta = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea pendiente (para evitar bugs de ingreso)

                    Proveedor.venderProducto(inventario, nombreProducto, cantidadVenta); //llama a mi funcion vender pro
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Función para ingresar un nuevo producto
    private static Producto ingresarProducto(Scanner scanner) {
        Producto producto = null; // Variable para almacenar el producto
        int error; // Variable para controlar el bucle

        do {
            error = 1; // Asumimos que no hay error inicialmente
            try {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingrese la fecha de vencimiento (DD/MM/AAAA): ");
                String fechaVencimiento = scanner.nextLine();

                                                     // Crear el producto con los datos ingresados
                producto = new Producto(0, nombre, cantidad, fechaVencimiento);

            } catch (Exception e) {
                System.out.println("Ocurrió un error al ingresar los datos: " + e.getMessage());
                System.out.println("Por favor, intente nuevamente.");
                error = 0; // poner error en 0 para repetir el bucle
                scanner.nextLine();
            }
        } while (error == 0); // Repetir mientras haya error

        return producto; // Retornar el producto creado
    }


}
