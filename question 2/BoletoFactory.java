class BoletoFactory extends PagamentoFactory {
    //cria um objeto para fazer o pagamento no boleto
    public iPagamento criarPagamento() {
        return new Boleto();
    }
}