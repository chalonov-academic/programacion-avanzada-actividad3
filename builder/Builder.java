package builder;

public interface Builder {
    Builder id (int id);
    Builder tipo (String tipo);
    Builder marca (String marca);
    Builder modelo (String modelo);
    Builder color (String color);
    Builder precio (double precio);
}
