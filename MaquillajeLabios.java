package tiendaCosmeticos;

public abstract class MaquillajeLabios extends ProductoCosmetico {
    private String acabado; // Ej: Mate, Gloss, Satinado

    public MaquillajeLabios(String nombre, double precio, int stock, String acabado) {
        super(nombre, precio, stock);
        this.acabado = acabado;
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }
}
