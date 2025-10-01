public class Aereo implements iTransporte{
    public double pesoCarga;

    public Aereo(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularTarifa() {
        //regra propria para determinar o valor da entrega do veiculo aereo
        return pesoCarga * 100.0;
    }
}
