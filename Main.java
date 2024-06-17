import builder.*;

import static funciones.Funciones.calcularValorCuota;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejemplo - Pedido fallido");

        Director pedido1 = new Director();
        BikeBuilder builder = new BikeBuilder();

        pedido1.buildBike(builder);
        builder.tipo("Ruta");
        builder.color("Blanco");
        builder.modelo("Domane");
        builder.precio(15000);
        builder.id(0);
        System.out.println(builder.build());

        try {
            double valorCuota = calcularValorCuota(builder.getPrecio(), builder.getId());
            System.out.println("El valor de su cuota es: $" + valorCuota);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        System.out.println();

        System.out.println("Ejemplo - Pedido exitoso");

        Director pedido2 = new Director();
        pedido2.buildBike(builder);
        builder.tipo("Ruta");
        builder.color("Blanco");
        builder.modelo("Domane");
        builder.precio(15000);
        builder.id(5);
        System.out.println(builder.build());

        try {
            double valorCuota = calcularValorCuota(builder.getPrecio(), builder.getId());
            System.out.println("El valor de su cuota es: $" + valorCuota);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

    }
}
