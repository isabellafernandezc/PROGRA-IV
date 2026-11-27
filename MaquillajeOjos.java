package tiendaCosmeticos;

public abstract class MaquillajeOjos extends ProductoCosmetico {
    private boolean resistenteAgua;

    public MaquillajeOjos(String nombre, double precio, int stock, boolean resistenteAgua) {
        super(nombre, precio, stock);
        this.resistenteAgua = resistenteAgua;
    }

    public boolean isResistenteAgua() {
        return resistenteAgua;
    }

    public void setResistenteAgua(boolean resistenteAgua) {
        this.resistenteAgua = resistenteAgua;
    }
}
