package udla.Jvasquez.excepciones;

public class Calculadora {

    public double dividir(int dividendo, int divisor) throws DivisionPorCeroExepcion {
        if (divisor == 0) {
            throw new DivisionPorCeroExepcion("No es posible dividir por cero.");
        }
        return dividendo / (double) divisor;
    }


    public double dividir(String dividendo, String divisor) throws DivisionPorCeroExepcion, FormatoNumeroExcepcion {
        try {
            int divid = Integer.parseInt(dividendo);
            int divos = Integer.parseInt(divisor);
            return this.dividir(divid, divos);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroExcepcion("Debe ingresar un número entero.");
        }
    }
}
