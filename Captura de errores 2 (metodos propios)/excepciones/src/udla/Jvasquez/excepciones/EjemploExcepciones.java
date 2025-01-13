package udla.Jvasquez.excepciones;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un número:");
        int denominador;
        double division;

        try {
            denominador = Integer.parseInt(valor);
            division = cal.dividir(10, denominador);
            System.out.println("Resultado de la división: " + division);

        } catch (DivisionPorCeroExepcion dvp) {
            System.out.println("Captura el error matemático: " + dvp.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Captura el error de formato: " + nfe.getMessage());
        } finally {
            System.out.println("Finalizando intento de operación.");
        }

        System.out.println("Continuamos con el flujo de la aplicación");
    }
}
