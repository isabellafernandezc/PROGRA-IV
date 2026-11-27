package tiendaCosmeticos;

public abstract class ProductoCosmetico implements Descuento {
    private String nombre;
    private double precio;
    private int stock;

    public ProductoCosmetico(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters (Encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Implementación de la interfaz Descontable
    @Override
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            return this.precio;
        }
        return this.precio - (this.precio * (porcentaje / 100.0));
    }

    // Método abstracto que obligatoriamente sobrescribirán las clases concretas
    public abstract void mostrarInfo();
}
