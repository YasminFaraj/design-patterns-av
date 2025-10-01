public class Pix implements iPagamento{

    @Override
    public void pagar(double valor){
        System.out.println("Você está pagando um valor de R$" + valor + " no pix.");
    }
}
