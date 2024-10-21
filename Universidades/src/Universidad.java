public class Universidad {
    private String nombreU;
    private String codigoU;
    private String direccionU;
    //Constructor

    public Universidad(String nommbreU) {
        this.nombreU = nommbreU;
    }

    public Universidad(String nombreU, String codigoU) {
        this(nombreU);
        this.codigoU = codigoU;
    }

    public Universidad(String nombreU, String codigoU, String direccionU) {
        this(nombreU, codigoU);
        this.direccionU = direccionU;
    }

    //Getter and Setter


    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getCodigoU() {
        return codigoU;
    }

    public void setCodigoU(String codigoU) {
        this.codigoU = codigoU;
    }

    public String getDireccionU() {
        return direccionU;
    }

    public void setDireccionU(String direccionU) {
        this.direccionU = direccionU;
    }

    //Metodos

}
