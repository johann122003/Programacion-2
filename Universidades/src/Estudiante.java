public class Estudiante {
    private String nombreE;
    private String codigoE;
    private String carreraE;
    private String semstreE;
    // Constructor
    public Estudiante(String nombreE) {
        this.nombreE = nombreE;
    }

    public Estudiante(String nombreE, String codigoE) {
        this(nombreE);
        this.codigoE = codigoE;
    }

    public Estudiante(String nombreE, String codigoE, String carreraE) {
        this(nombreE, codigoE);
        this.carreraE = carreraE;
    }

    public Estudiante(String nombreE, String codigoE, String carreraE, String semstreE) {
        this(nombreE, codigoE, carreraE);
        this.semstreE = semstreE;
    }
    // Getter and Setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getCarreraE() {
        return carreraE;
    }

    public void setCarreraE(String carreraE) {
        this.carreraE = carreraE;
    }

    public String getSemstreE() {
        return semstreE;
    }

    public void setSemstreE(String semstreE) {
        this.semstreE = semstreE;
    }
}
