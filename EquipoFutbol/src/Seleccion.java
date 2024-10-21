public class Seleccion {
    public static void main(String[] args) {
        System.out.println("El 11 ideal:");
        Tri galindez = new Tri();
        galindez.setNombre("Hernan Galindez");
        galindez.setEdad("37");
        galindez.setNacionalidad("Ecuatoriano");
        galindez.setPosicion("Portero");
        galindez.setClub("CA Huracan");
        galindez.setValormerc("$350 mil");

        System.out.println(galindez.verDetalle());

        Tri hincapie = new Tri();
        hincapie.setNombre("Hincapie");
        hincapie.setEdad("22");
        hincapie.setNacionalidad("Ecuatoriano");
        hincapie.setPosicion("Defensa central");
        hincapie.setClub("Bayer Leverkusen");
        hincapie.setValormerc("$40 mill");

        System.out.println(hincapie.verDetalle());

        Tri pacho = new Tri();
        pacho.setNombre("W.Pacho");
        pacho.setEdad("22");
        pacho.setNacionalidad("Ecuatoriano");
        pacho.setPosicion("Defensa central");
        pacho.setClub("PSG");
        pacho.setValormerc("$40 mill");

        System.out.println(pacho.verDetalle());

        Tri preciado = new Tri();
        preciado.setNombre("A.Preciado");
        preciado.setEdad("26");
        preciado.setNacionalidad("Ecuatoriano");
        preciado.setPosicion("Lateral derecho");
        preciado.setClub("Sparta Praga");
        preciado.setValormerc("$5 mill");

        System.out.println(preciado.verDetalle());

        Tri estupinan = new Tri();
        estupinan.setNombre("P.Estupiñan");
        estupinan.setEdad("26");
        estupinan.setNacionalidad("Ecuatoriano");
        estupinan.setPosicion("Lateral izquierdo");
        estupinan.setClub("Brighton");
        estupinan.setValormerc("$5 mill");

        System.out.println(preciado.verDetalle());

        Tri franco = new Tri();
        franco.setNombre("A.Franco");
        franco.setEdad("26");
        franco.setNacionalidad("Ecuatoriano");
        franco.setPosicion("Medio centro");
        franco.setClub("Atletico Mineiro");
        franco.setValormerc("$3,5 mill");

        System.out.println(franco.verDetalle());

        Tri caicedo = new Tri();
        caicedo.setNombre("M.Caicedo");
        caicedo.setEdad("22");
        caicedo.setNacionalidad("Ecuatoriano");
        caicedo.setPosicion("Pivote");
        caicedo.setClub("Chelsea");
        caicedo.setValormerc("$75 mill");

        System.out.println(caicedo.verDetalle());


        Tri zambrano = new Tri();
        zambrano.setNombre("O.Zambrano");
        zambrano.setEdad("20");
        zambrano.setNacionalidad("Ecuatoriano");
        zambrano.setPosicion("Pivote");
        zambrano.setClub("Hull City");
        zambrano.setValormerc("$2,8 mill");

        System.out.println(zambrano.verDetalle());

        Tri yeboah = new Tri();
        yeboah.setNombre("J.Yeboah");
        yeboah.setEdad("24");
        yeboah.setNacionalidad("Ecuatoriano");
        yeboah.setPosicion("Medio centro");
        yeboah.setClub("Venezia");
        yeboah.setValormerc("$2,5 mill");

        System.out.println(yeboah.verDetalle());


        Tri minda = new Tri();
        minda.setNombre("A.Minda");
        minda.setEdad("21");
        minda.setNacionalidad("Ecuatoriano");
        minda.setPosicion("Extremo derecho");
        minda.setClub("Circulo de Brujas");
        minda.setValormerc("$6 mill");

        System.out.println(minda.verDetalle());

        Tri rodrigues = new Tri();
        rodrigues.setNombre("K.Rodriguez");
        rodrigues.setEdad("24");
        rodrigues.setNacionalidad("Ecuatoriano");
        rodrigues.setPosicion("Delantero Centro");
        rodrigues.setClub("Union Saint Gilloise");
        rodrigues.setValormerc("$3 mill");

        System.out.println(rodrigues.verDetalle());

    }
}
