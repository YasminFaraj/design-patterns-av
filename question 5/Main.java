public class Main {
// Prototype pattern
// Prototype = Documento que implementa clone() para criar cópias rápidas.
// escolhi o Prototype pois permite clonar um template existente e personalizá-lo sem recriar a estrutura.
    public static void main(String[] args) {
        Documento modeloCurriculo = new Documento("Currículo", "Preto", "Arial", "LogoEmpresa");

        Documento curriculoYasmin = modeloCurriculo.clonar();
        curriculoYasmin.setCor("Azul");
        curriculoYasmin.setLogotipo("LogoYasmin");

        Documento curriculoLaura = modeloCurriculo.clonar();
        curriculoLaura.setFonte("Times New Roman");
        curriculoLaura.setLogotipo("LogoLaura");

        modeloCurriculo.exibir();
        curriculoYasmin.exibir();
        curriculoLaura.exibir();
    }
}
