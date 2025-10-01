public class Main {
    //utilizei factory method para que codigo principal da aplicação nao precise conhecer detalhes da criacao de cada objeto(individualmente).
    public static void main(String[] args) {
        PagamentoFactory factory;

        factory = new PixFactory();
        iPagamento pix = factory.criarPagamento();
        pix.pagar(20);

        factory = new BoletoFactory();
        iPagamento boleto = factory.criarPagamento();
        boleto.pagar(40);

        factory = new CartaoFactory();
        iPagamento cartao = factory.criarPagamento();
        cartao.pagar(20);
    }
}
