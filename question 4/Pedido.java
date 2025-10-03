public class Pedido {
    private final int id;
    private final double valor;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() { return id; }
    public double getValor() { return valor; }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", valor=" + valor + "}";
    }
}