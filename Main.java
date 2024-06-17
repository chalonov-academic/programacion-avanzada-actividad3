import builder.*;

import java.io.*;

import static funciones.Funciones.calcularValorCuota;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------");
        System.out.println("Ejemplo 1 - Calcular el número de cuotas a pagar por un pedido");
        System.out.println();

        Director pedido1 = new Director();
        BikeBuilder builder = new BikeBuilder();

        pedido1.buildBike(builder);
        builder.tipo("Ruta");
        builder.color("Blanco");
        builder.modelo("Domane");
        builder.precio(15000);
        builder.cuotas(0);
        System.out.println(builder.build().toString().replace("*", "\n"));

        try {
            double valorCuota = calcularValorCuota(builder.getPrecio(), builder.getCuotas());
            System.out.println("El valor de su cuota es: $" + valorCuota);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Ejemplo 2 - Guardar y leer un archivo con los datos del pedido");
        System.out.println("- Fixed: Número de cuotas mayor a cero -> OK");
        System.out.println();

        Director pedido2 = new Director();
        pedido2.buildBike(builder);
        builder.cuotas(5);
        System.out.println(builder.build().toString().replace("*", "\n"));
        System.out.println();

        try {
            double valorCuota = calcularValorCuota(builder.getPrecio(), builder.getCuotas());
            System.out.println("El valor de su cuota es: $" + valorCuota);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        String pedidoAGuardar = builder.build().toString().replace("*", "\n");

        try {
            // Crear un objeto FileWriter para escribir en un archivo
            FileWriter fileWriter = new FileWriter("pedido.txt");

            // Crear un objeto BufferedWriter para escribir de forma más eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir el texto en el archivo
            bufferedWriter.write(pedidoAGuardar);

            // Cerrar el BufferedWriter y el FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Factura guardada -> pedido.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader("archivo.txt"); // FileNotFoundException (subclase de IOException)
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Ejemplo 3 - Leer la primera linea y convertirla en una variable int");
        System.out.println("- Fixed: Se indica el archivo correcto (pedido.txt) -> OK");
        System.out.println();

        try {
            // Crear un objeto FileReader para leer el archivo
            FileReader fileReader = new FileReader("pedido.txt");

            // Crear un objeto BufferedReader para leer de forma más eficiente
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;

            // Leer el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar el BufferedReader y el FileReader
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println();
        
        try {
            // Crear un objeto FileReader para leer el archivo
            FileReader fileReader = new FileReader("pedido.txt");

            // Crear un objeto BufferedReader para leer de forma más eficiente
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String primeraLinea = bufferedReader.readLine();

            // Imprimir la primera línea
            if (primeraLinea != null) {
                System.out.println("Primera línea: " + primeraLinea);
            } else {
                System.out.println("El archivo está vacío.");
            }

            int valor;

            try {
                valor = Integer.parseInt(primeraLinea);
                System.out.println("El valor es: " + valor);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Cerrar el BufferedReader y el FileReader
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }



    }
}
