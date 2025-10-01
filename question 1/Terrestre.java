public class Terrestre implements iTransporte{
    public double distanciaKm;

    public Terrestre(double distanciaKm){
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularTarifa(){
        //regra propria para determinar o valor da entrega do veiculo terrestre
        return distanciaKm * 30.0;
    }
}