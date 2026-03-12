package proyecto1.models;

public class ProductoModels {

    public String id;
    public String nombre;
    public String categoria;
    public double precio;
    public int stock;

    // Constructor
    public ProductoModels(String id, String nombre, String categoria, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
}

