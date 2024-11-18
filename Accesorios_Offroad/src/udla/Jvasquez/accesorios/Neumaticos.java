package udla.Jvasquez.accesorios;

import java.util.ArrayList;
import java.util.Scanner;

public class Neumaticos extends Accesorios {
    private String tipo;
    private String codigo;

    private static ArrayList<Neumaticos> listaNeumaticos = new ArrayList<>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Métodos
    public static void mostrarNeumaticos() {
        if (listaNeumaticos.isEmpty()) {
            System.out.println("No hay neumáticos disponibles.");
        } else {
            for (int i = 0; i < listaNeumaticos.size(); i++) {
                Neumaticos n = listaNeumaticos.get(i);
                System.out.println((i + 1) + ". Nombre: " + n.getNombre() +
                        ", Cantidad: " + n.getCantidad() +
                        ", Precio: " + n.getPrecio() +
                        ", Tipo: " + n.getTipo() +
                        ", Código: " + n.getCodigo());
            }
        }
    }


    public static void agregarNeumatico(Scanner scanner) {
        Neumaticos nuevoNeumatico = new Neumaticos();

        System.out.print("Nombre: ");
        nuevoNeumatico.setNombre(scanner.nextLine());

        System.out.print("Cantidad: ");
        nuevoNeumatico.setCantidad(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Precio: ");
        nuevoNeumatico.setPrecio(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Tipo: ");
        nuevoNeumatico.setTipo(scanner.nextLine());

        System.out.print("Código: ");
        nuevoNeumatico.setCodigo(scanner.nextLine());

        listaNeumaticos.add(nuevoNeumatico);
    }

    public static void eliminarNeumatico(Scanner scanner) {
        mostrarNeumaticos();
        System.out.print("Selecciona el número del neumático a eliminar: ");
        int numrem = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numrem >= 0 && numrem < listaNeumaticos.size()) {
            listaNeumaticos.remove(numrem);
            System.out.println("Neumático eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
