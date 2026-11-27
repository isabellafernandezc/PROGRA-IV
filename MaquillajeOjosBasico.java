
public class MaquillajeOjosBasico extends MaquillajeRostro {

    public MaquillajeOjosBasico(String nombre, double precio,int stock,String tipoProducto) {
        super(nombre, precio, stock, tipoProducto);
    }

    @Override
    public String obtenerDetalle() {
        System.out.print("Maquillaje de ojos - Linea basica \n" + "\nNombre: " + getNombre()
                + "\nPrecio: $" + getPrecio()
                + "\nStock: " + getStock()
                + "\nTipo de producto: " + getTipoProducto())
                ;
    }
}