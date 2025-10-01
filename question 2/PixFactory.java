class PixFactory extends PagamentoFactory {
    //cria um objeto para fazer o pagamento no pix
    public iPagamento criarPagamento() {
        return new Pix();
    }
}