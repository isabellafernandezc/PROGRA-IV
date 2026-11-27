package tiendaCosmeticos;

public interface CosmeticosFactory {
    MaquillajeRostro crearMaquillajeRostro(String nombre, double precio, int stock, String tono);
    MaquillajeOjos crearMaquillajeOjos(String nombre, double precio, int stock, boolean resistenteAgua);
    MaquillajeLabios crearMaquillajeLabios(String nombre, double precio, int stock, String acabado);
    CuidadoPiel crearCuidadoPiel(String nombre, double precio, int stock, String tipoPiel);
}
