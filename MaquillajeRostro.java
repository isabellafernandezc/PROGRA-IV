package tiendaCosmeticos;

public abstract class MaquillajeRostro extends ProductoCosmetico {
    private String tono;

    public MaquillajeRostro(String nombre, double precio, int stock, String tono) {
        super(nombre, precio, stock);
        this.tono = tono;
    }

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }
}
