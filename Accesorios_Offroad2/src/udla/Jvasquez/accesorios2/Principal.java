package udla.Jvasquez.accesorios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Neumatico> listaNeumaticos = new ArrayList<>();
        ArrayList<Suspension> listaSuspensiones = new ArrayList<>();
        ArrayList<Proteccion> listaProtecciones = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver Neumáticos");
            System.out.println("2. Ver Suspensiones");
            System.out.println("3. Ver Protecciones");
            System.out.println("4. Agregar Neumático");
            System.out.println("5. Agregar Suspensión");
            System.out.println("6. Agregar Protección");
            System.out.println("7. Eliminar Neumático");
            System.out.println("8. Eliminar Suspensión");
            System.out.println("9. Eliminar Protección");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    mostrarNeumaticos(listaNeumaticos);
                    break;
                case 2:
                    mostrarSuspensiones(listaSuspensiones);
                    break;
                case 3:
                    mostrarProtecciones(listaProtecciones);
                    break;
                case 4:
                    agregarNeumatico(listaNeumaticos, scanner);
                    break;
                case 5:
                    agregarSuspension(listaSuspensiones, scanner);
                    break;
                case 6:
                    agregarProteccion(listaProtecciones, scanner);
                    break;
                case 7:
                    eliminarNeumatico(listaNeumaticos, scanner);
                    break;
                case 8:
                    eliminarSuspension(listaSuspensiones, scanner);
                    break;
                case 9:
                    eliminarProteccion(listaProtecciones, scanner);
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 10);

        scanner.close();
    }

    public static void mostrarNeumaticos(ArrayList<Neumatico> lista) {
        System.out.println("\n=== Lista de Neumáticos ===");
        if (lista.isEmpty()) {
            System.out.println("No hay neumáticos disponibles.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Neumatico n = lista.get(i);
                System.out.println((i + 1) + ". Nombre: " + n.nombre +
                        ", Cantidad: " + n.cantidad +
                        ", Precio: " + n.precio +
                        ", Tipo: " + n.tipo +
                        ", Código: " + n.codigo);
            }
        }
    }

    public static void agregarNeumatico(ArrayList<Neumatico> lista, Scanner scanner) {
        System.out.println("\n=== Agregar Neumático ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        lista.add(new Neumatico(nombre, cantidad, precio, tipo, codigo));
        System.out.println("Neumático agregado.");
    }

    public static void eliminarNeumatico(ArrayList<Neumatico> lista, Scanner scanner) {
        mostrarNeumaticos(lista);
        System.out.print("Selecciona el número del neumático a eliminar: ");
        int numelim = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numelim >= 0 && numelim < lista.size()) {
            lista.remove(numelim);
            System.out.println("Neumático eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void mostrarSuspensiones(ArrayList<Suspension> lista) {
        System.out.println("\n=== Lista de Suspensiones ===");
        if (lista.isEmpty()) {
            System.out.println("No hay suspensiones disponibles.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Suspension s = lista.get(i);
                System.out.println((i + 1) + ". Nombre: " + s.nombre +
                        ", Cantidad: " + s.cantidad +
                        ", Precio: " + s.precio +
                        ", Altura: " + s.altura +
                        ", Diseño: " + s.diseño);
            }
        }
    }

    public static void agregarSuspension(ArrayList<Suspension> lista, Scanner scanner) {
        System.out.println("\n=== Agregar Suspensión ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Diseño: ");
        String diseño = scanner.nextLine();
        lista.add(new Suspension(nombre, cantidad, precio, altura, diseño));
        System.out.println("Suspensión agregada.");
    }

    public static void eliminarSuspension(ArrayList<Suspension> lista, Scanner scanner) {
        mostrarSuspensiones(lista);
        System.out.print("Selecciona el número de la suspensión a eliminar: ");
        int numelim = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numelim >= 0 && numelim < lista.size()) {
            lista.remove(numelim);
            System.out.println("Suspensión eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void mostrarProtecciones(ArrayList<Proteccion> lista) {
        System.out.println("\n=== Lista de Protecciones ===");
        if (lista.isEmpty()) {
            System.out.println("No hay protecciones disponibles.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Proteccion p = lista.get(i);
                System.out.println((i + 1) + ". Nombre: " + p.nombre +
                        ", Cantidad: " + p.cantidad +
                        ", Precio: " + p.precio +
                        ", Peso: " + p.peso +
                        ", Lugar de accesorio: " + p.lugarDeAcc);
            }
        }
    }

    public static void agregarProteccion(ArrayList<Proteccion> lista, Scanner scanner) {
        System.out.println("\n=== Agregar Protección ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Lugar de accesorio: ");
        String lugarDeAcc = scanner.nextLine();
        lista.add(new Proteccion(nombre, cantidad, precio, peso, lugarDeAcc));
        System.out.println("Protección agregada.");
    }

    public static void eliminarProteccion(ArrayList<Proteccion> lista, Scanner scanner) {
        mostrarProtecciones(lista);
        System.out.print("Selecciona el número de la protección a eliminar: ");
        int numelim = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numelim >= 0 && numelim < lista.size()) {
            lista.remove(numelim);
            System.out.println("Protección eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
