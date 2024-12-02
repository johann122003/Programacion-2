package udla.Jvasquez.accesorios;

import java.util.ArrayList;
import java.util.Scanner;

public class Suspensiones extends Accesorios {
    private double altura;
    private String diseño;

    private static ArrayList<Suspensiones> listaSuspensiones = new ArrayList<>();

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    // Métodos
    public static void mostrarSuspensiones() {
        if (listaSuspensiones.isEmpty()) {
            System.out.println("No hay suspensiones disponibles.");
        } else {
            for (int i = 0; i < listaSuspensiones.size(); i++) {
                Suspensiones s = listaSuspensiones.get(i);
                System.out.println((i + 1) + ". Nombre: " + s.getNombre() +
                        ", Cantidad: " + s.getCantidad() +
                        ", Precio: " + s.getPrecio() +
                        ", Altura: " + s.getAltura() +
                        ", Diseño: " + s.getDiseño());
            }
        }
    }


    public static void agregarSuspension(Scanner scanner) {
        Suspensiones nuevaSuspension = new Suspensiones();
        System.out.print("Nombre: ");
        nuevaSuspension.setNombre(scanner.nextLine());
        System.out.print("Cantidad: ");
        nuevaSuspension.setCantidad(scanner.nextInt());
        System.out.print("Precio: ");
        nuevaSuspension.setPrecio(scanner.nextDouble());
        System.out.print("Altura: ");
        nuevaSuspension.setAltura(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Diseño: ");
        nuevaSuspension.setDiseño(scanner.nextLine());
        listaSuspensiones.add(nuevaSuspension);
    }

    public static void eliminarSuspension(Scanner scanner) {
        mostrarSuspensiones();
        System.out.print("Selecciona el número de la suspensión a eliminar: ");
        int numrem = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numrem >= 0 && numrem < listaSuspensiones.size()) {
            listaSuspensiones.remove(numrem);
            System.out.println("Suspensión eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
