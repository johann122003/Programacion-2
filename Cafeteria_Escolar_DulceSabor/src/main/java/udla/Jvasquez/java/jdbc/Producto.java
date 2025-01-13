package udla.Jvasquez.java.jdbc;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private String fechaVencimiento;

    //Constructor
    public Producto(int id, String nombre, int cantidad, String fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    // Este metodo transforma toda la info del producto en un string para imprimir.
    @Override
    public String toString() {
        return "\n" +
                "nombre = " + nombre  +
                ", cantidad = " + cantidad +
                ", fechaVencimiento = " + fechaVencimiento ;
    }
}
