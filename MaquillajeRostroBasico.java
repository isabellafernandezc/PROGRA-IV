
public class MaquillajeRostroBasico extends MaquillajeRostro {

    public MaquillajeRostroBasico(
            String nombre,
            double precio,
            int stock,
            String tipoProducto) {

        super(nombre, precio, stock, tipoProducto);
    }

    @Override
    public String obtenerDetalle() {
        return """
                Maquillaje de rostro - Linea basica

                Nombre: %s
                Precio: $%s
                Stock: %s
                Tipo de producto: %s
                """.formatted(
                getNombre(), getPrecio(), getStock(), getTipoProducto());
    }
}
