public class Principal {
    public static void main(String[] args) {
        Plantas rosas = new Plantas();
        rosas.setNombre("Rosas");
        rosas.setTamaño("Medianas");
        rosas.setRegion("Sierra");
        rosas.setColor("Rojas");

        System.out.println(rosas.detallePlantas());

        Plantas claveles = new Plantas();
        claveles.setNombre("Claveles");
        claveles.setTamaño("Pequeña");
        claveles.setRegion("Sierra - Amazonia");
        claveles.setColor("Blancas");

        System.out.println(claveles.detallePlantas());

        Plantas girasoles = new Plantas();
        girasoles.setNombre("Girasoles");
        girasoles.setTamaño("Grandes");
        girasoles.setRegion("Sierra - Costa");
        girasoles.setColor("Amarillo");

        System.out.println(girasoles.detallePlantas());

        Plantas orquidea = new Plantas();
        orquidea.setNombre("Orquidea");
        orquidea.setTamaño("Grandes");
        orquidea.setRegion("Sierra - Amazonia");
        orquidea.setColor("Muchos colores");

        System.out.println(girasoles.detallePlantas());

    }
}
