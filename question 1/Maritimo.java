public class Maritimo implements iTransporte{
    public double distancia;

    public Maritimo(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        //regra propria para determinar o valor da entrega do veiculo maritimo
        return distancia * 50.0;
    }
}
