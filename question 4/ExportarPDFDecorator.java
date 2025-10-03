public class ExportarPDFDecorator extends RelatorioDecorator {
    public ExportarPDFDecorator(Relatorio wrappee) {
        super(wrappee);
    }

    @Override
    public String gerar() {
        String base = super.gerar();
        return base + "\nExportação: \nRelatorio exportado para PDF.\n";
    }
}