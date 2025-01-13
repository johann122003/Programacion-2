package udla.Jvasquez.excepciones;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Ingrese un número:");
        try {
            int denominador = Integer.parseInt(valor);
            int numerador = 10;

            int resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);

        } catch (NumberFormatException nfe) {
            System.out.println("Error de formato: " + nfe.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Error aritmético: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        } finally {
            System.out.println("es opcional y se ejecuta siempre");
        }
        System.out.println("Continuamos con el flujo de la aplicación.");
    }
}
