import java.util.List;

public class RelatorioBasico implements Relatorio {
    private final List<Pedido> pedidos;

    public RelatorioBasico(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String gerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relatorio Basico \n");
        sb.append("Pedidos:\n");
        for (Pedido p : pedidos) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

