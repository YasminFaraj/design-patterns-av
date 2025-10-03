import java.util.*;

public class Main {
// Decorator pattern
// Component = Relatorio (interface)
// ConcreteComponent = RelatorioBasico (lista de pedidos)
// Decorator = RelatorioDecorator (encapsula um Relatorio e adiciona comportamento)
// ConcreteDecorators = EstatisticasDecorator, GraficoDecorator, ExportarPDFDecorator
// utilizei Decorator pois permite adicionar funcionalidades adicionais ao relaoório
// de forma dinamica e combinavel, sem alterar a implementacao do relatorio basico.
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
            new Pedido(1, 100.0),
            new Pedido(2, 250.5),
            new Pedido(3, 50.0)
        );

        Relatorio basico = new RelatorioBasico(pedidos);

        System.out.println(basico.gerar());

        Relatorio comEstatisticas = new EstatisticasDecorator(basico);
        System.out.println(comEstatisticas.gerar());

        Relatorio comGrafico = new GraficoDecorator(comEstatisticas);
        System.out.println(comGrafico.gerar());

        Relatorio completoPDF = new ExportarPDFDecorator(comGrafico);
        System.out.println(completoPDF.gerar());
    }
}