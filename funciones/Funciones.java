package funciones;

public class Funciones {

    public static double calcularValorCuota(double precio, int numeroCuotas) {
        if (numeroCuotas <= 0) {
            throw new ArithmeticException("El número de cuotas debe ser mayor que cero.");
        }

        return precio / numeroCuotas;
    }
}
