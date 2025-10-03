public abstract class RelatorioDecorator implements Relatorio {
    protected final Relatorio wrappee;

    public RelatorioDecorator(Relatorio wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String gerar() {
        return wrappee.gerar();
    }
}