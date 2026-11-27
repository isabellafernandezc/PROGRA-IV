package tiendaCosmeticos;

public abstract class CuidadoPiel extends ProductoCosmetico {
    private String tipoPiel; // Ej: Grasa, Seca, Mixta

    public CuidadoPiel(String nombre, double precio, int stock, String tipoPiel) {
        super(nombre, precio, stock);
        this.tipoPiel = tipoPiel;
    }

    public String getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(String tipoPiel) {
        this.tipoPiel = tipoPiel;
    }
}
