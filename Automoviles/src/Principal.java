import javax.swing.*;
import java.io.BufferedReader;
import java.nio.Buffer;

public class Principal {
    public static void main(String[] args) {
        Automovil bmw = new Automovil("Bmw","i320");
        bmw.setColor("plata");
        bmw.setCilindraje("2.5");

        System.out.println(bmw.verDeatallevehiculos());

        Automovil mercedes = new Automovil("Mercedes Benz",null);
        String vr1 =JOptionPane.showInputDialog(null,"Ingrese modelo:");
        mercedes.setModelo(vr1);
        mercedes.setColor("negro");
        mercedes.setCilindraje("2.0");

        System.out.println(mercedes.verDeatallevehiculos());

    }
}
