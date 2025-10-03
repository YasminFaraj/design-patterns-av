public class EstatisticasDecorator extends RelatorioDecorator {
    public EstatisticasDecorator(Relatorio wrappee) {
        super(wrappee);
    }

    @Override
    public String gerar() {
        String base = super.gerar();
        double total = 0;
        int count = 0;
        if (wrappee instanceof RelatorioBasico) {
            for (Pedido p : ((RelatorioBasico) wrappee).getPedidos()) {
                total += p.getValor();
                count++;
            }
        }
        double media = (count == 0) ? 0 : total / count;
        return base + "\n=== Estatisticas ===\nTotal faturado: R$ " + total + "\nMedia por pedido: R$ " + media + "\n";
    }
}