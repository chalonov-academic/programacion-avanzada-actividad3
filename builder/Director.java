package builder;

public class Director {

    public void buildBike(Builder builder) {
        builder.marca("Trek")
                .color("Azul")
                .modelo("Madone")
                .tipo("Ruta");
    }
}
