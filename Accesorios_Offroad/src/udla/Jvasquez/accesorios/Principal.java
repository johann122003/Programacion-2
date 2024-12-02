package udla.Jvasquez.accesorios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Ver Neumáticos");
            System.out.println("2. Ver Suspensiones");
            System.out.println("3. Ver Protecciones");
            System.out.println("4. Agregar neumáticos");
            System.out.println("5. Agregar Suspensión");
            System.out.println("6. Agregar Protección");
            System.out.println("7. Eliminar neumáticos");
            System.out.println("8. Eliminar Suspensión");
            System.out.println("9. Eliminar Protección");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    Neumaticos.mostrarNeumaticos();
                    break;
                case 2:
                    Suspensiones.mostrarSuspensiones();
                    break;
                case 3:
                    Protecciones.mostrarProtecciones();
                    break;
                case 4:
                    do {
                        Neumaticos.agregarNeumatico(scanner);
                        System.out.print("¿Deseas ingresar más? 1 si 0 no: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine(); // Consumir salto de línea
                    } while (opcion == 1);
                    break;
                case 5:
                    do {
                        Suspensiones.agregarSuspension(scanner);
                        System.out.print("¿Deseas ingresar más? 1 si 0 no: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine(); 
                    } while (opcion == 1);
                    break;
                case 6:
                    do {
                        Protecciones.agregarProteccion(scanner);
                        System.out.print("¿Deseas ingresar más? 1 si 0 no: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion == 1);
                    break;
                case 7:
                    Neumaticos.eliminarNeumatico(scanner);
                    break;
                case 8:
                    Suspensiones.eliminarSuspension(scanner);
                    break;
                case 9:
                    Protecciones.eliminarProteccion(scanner);
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
}