public class Main {
    //utilizei interface, heranca e polimorfismo para fazer essa questao, pois todos os tipos de veiculos tinham algo em comum, 
    //e falicitou ter uma Interface que fizesse com que cada classe de veiculo herdasse essa regra para todas elas, 
    //alem do polimorfismo permitir que cada classe pudesse usar sua propria logica na funcao calcularTarifa()
    public static void main(String[] args) {
        iTransporte terrestre = new Terrestre(100);
        iTransporte aereo = new Aereo(100);
        iTransporte maritimo = new Maritimo(100);

        System.out.println("Valor da tarifa do transporte terrestre: " + terrestre.calcularTarifa());
        System.out.println("Valor da tarifa do transporte aéreo: " + aereo.calcularTarifa());
        System.out.println("Valor da tarifa do transporte marítimo: " + maritimo.calcularTarifa());
    }
}
