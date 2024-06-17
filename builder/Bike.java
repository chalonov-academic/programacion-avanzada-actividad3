package builder;

public class Bike {
    private final int id;
    private final String tipo;
    private final String marca;
    private final String modelo;
    private final String color;
    private final double precio;

    Bike(int id, String tipo, String marca, String modelo, String color, double precio){
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String toString(){
        return """
               Factura de venta
               ---------------------
               Producto: Bicicleta
               Tipo: %s
               Marca: %s
               Modelo: %s
               Color: %s
               ---------------------
               Precio: $%s
               Cuotas: %s
               """.formatted(tipo, marca, modelo, color, precio, id);
    }
}
