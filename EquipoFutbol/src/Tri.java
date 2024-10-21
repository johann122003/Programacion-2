public class Tri {
    private String nombre;
    private String edad;
    private String nacionalidad;
    private String posicion;
    private String valormerc;
    private String club;

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getValormerc() {
        return valormerc;
    }

    public void setValormerc(String valormerc) {
        this.valormerc = valormerc;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    // Metodos
    public String verDetalle(){
        String dv = "\n"+
                    "El nombre del Jugador es: "+ this.nombre + "\n" +
                    "La edad es: "+ this.edad + "\n" +
                    "La nacionalidad es: "+ this.nacionalidad + "\n" +
                    "Su posicion es: " + this.posicion + "\n" +
                    "Se club es: "+ this.club + "\n" +
                    "Su valor de mercado: " + this.valormerc+ "\n";


        return dv;
    }
}



