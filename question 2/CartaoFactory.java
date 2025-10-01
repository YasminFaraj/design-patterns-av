class CartaoFactory extends PagamentoFactory {
    //cria um objeto para fazer o pagamento no cartao
    public iPagamento criarPagamento() {
        return new CartaoCredito();
    }
}