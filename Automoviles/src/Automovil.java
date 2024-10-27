public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;

    // contructores

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }
    // getter and setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    //Metodos

    public String verDeatallevehiculos() {
        String dv = "\n"+
                "La marca del vehiculo es: " + this.marca + "\n" +
                "El modelo del vehiculo es: " + this.modelo + "\n" +
                "La color del vehiculo es: " + this.color + "\n" +
                "El cilindraje del vehiculo es: " + this.cilindraje;
        return dv;
    }
}

