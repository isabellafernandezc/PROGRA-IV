public class MaquillajeRostroProfesional extends MaquillajeRostro {

    public MaquillajeRostroProfesional(String nombre, double precio,int stock,String tipoProducto) {
        super(nombre, precio, stock, tipoProducto);
    }

    @Override
    public String obtenerDetalle() {
        System.out.print("Maquillaje de rostro - Linea Profesional \n" + "\nNombre: " + getNombre()
                + "\nPrecio: $" + getPrecio()
                + "\nStock: " + getStock()
                + "\nTipo de producto: " + getTipoProducto())
                ;
    }
}