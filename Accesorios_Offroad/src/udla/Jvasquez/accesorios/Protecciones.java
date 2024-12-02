package udla.Jvasquez.accesorios;

import java.util.ArrayList;
import java.util.Scanner;

public class Protecciones extends Accesorios {
    private double peso;
    private String lugardeacc;

    private static ArrayList<Protecciones> listaProtecciones = new ArrayList<>();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getLugardeacc() {
        return lugardeacc;
    }

    public void setLugardeacc(String lugardeacc) {
        this.lugardeacc = lugardeacc;
    }

    // Métodos
    public static void mostrarProtecciones() {
        if (listaProtecciones.isEmpty()) {
            System.out.println("No hay protecciones disponibles.");
        } else {
            for (int i = 0; i < listaProtecciones.size(); i++) {
                Protecciones p = listaProtecciones.get(i);
                System.out.println((i + 1) + ". Nombre: " + p.getNombre() +
                        ", Cantidad: " + p.getCantidad() +
                        ", Precio: " + p.getPrecio() +
                        ", Peso: " + p.getPeso() +
                        ", Lugar de Accesorio: " + p.getLugardeacc());
            }
        }
    }

    public static void agregarProteccion(Scanner scanner) {
        Protecciones nuevaProteccion = new Protecciones();
        System.out.print("Nombre: ");
        nuevaProteccion.setNombre(scanner.nextLine());
        System.out.print("Cantidad: ");
        nuevaProteccion.setCantidad(scanner.nextInt());
        System.out.print("Precio: ");
        nuevaProteccion.setPrecio(scanner.nextDouble());
        System.out.print("Peso: ");
        nuevaProteccion.setPeso(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Lugar de accidente: ");
        nuevaProteccion.setLugardeacc(scanner.nextLine());
        listaProtecciones.add(nuevaProteccion);
    }

    public static void eliminarProteccion(Scanner scanner) {
        mostrarProtecciones();
        System.out.print("Selecciona el número de la protección a eliminar: ");
        int numrem = scanner.nextInt() - 1;
        scanner.nextLine();
        if (numrem >= 0 && numrem < listaProtecciones.size()) {
            listaProtecciones.remove(numrem);
            System.out.println("Protección eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

