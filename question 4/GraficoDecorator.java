public class GraficoDecorator extends RelatorioDecorator {
    public GraficoDecorator(Relatorio wrappee) {
        super(wrappee);
    }

    @Override
    public String gerar() {
        String base = super.gerar();
        String graficoSimulado = "\n Grafico: \n[#####-----] 50%\n";
        return base + graficoSimulado;
    }
}