package udla.Jvasquez.HerenciaPlantas;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
    //Plantas plantas = new Plantas();
    Flores flores = new Flores();
    flores.setNombre("Rosa");
    flores.setClima("Templado y Tropical");
    flores.setAltura(0.5);
    flores.setColor("De todo color");
    flores.setAroma("Fuerte");

        System.out.println("Informacion de la Planta:");
        System.out.println("Nombre= " + flores.getNombre());
        System.out.println("Clima = " + flores.getClima());
        System.out.println("Altura(m)= " + flores.getAltura());
        System.out.println("Color = " + flores.getColor());
        System.out.println("Aroma = " + flores.getAroma()+"\n");

    Arboles arboles = new Arboles();
    arboles.setNombre("Roble");
    arboles.setClima("Templados y Humedos");
    arboles.setAltura(20.0);
    arboles.setTipotronco("Duro");
    arboles.setDiametrotroncol(2.0);

        System.out.println("Informacion del Arbol");
        System.out.println("Nombre= " + arboles.getNombre());
        System.out.println("Clima = " + arboles.getClima());
        System.out.println("Altura(m)= " + arboles.getAltura());
        System.out.println("Tronco = " + arboles.getTipotronco());
        System.out.println("Diametro(m) = " + arboles.getDiametrotroncol());


    }
}
