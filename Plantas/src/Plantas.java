public class Plantas {
    private String nombre;
    private String tamaño;
    private String region;
    private String color;

    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //metodos

    public String detallePlantas(){
        String dv = "\n" +
                "El nombres es: "+ this.nombre + "\n" +
                "El tamaño es: "+ this.tamaño + "\n" +
                "Se la encuentra en la region: "+ this.region + "\n" +
                "El color es: "+ this.color;

        return dv;
    }
}
