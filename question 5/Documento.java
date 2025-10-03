public class Documento {
    private String titulo;
    private String cor;
    private String fonte;
    private String logotipo;

    public Documento(String titulo, String cor, String fonte, String logotipo) {
        this.titulo = titulo;
        this.cor = cor;
        this.fonte = fonte;
        this.logotipo = logotipo;
    }

    // Prototype
    public Documento clonar() {
        return new Documento(this.titulo, this.cor, this.fonte, this.logotipo);
    }

    public void setCor(String cor) { this.cor = cor; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public void setLogotipo(String logotipo) { this.logotipo = logotipo; }

    public void exibir() {
        System.out.println("Documento: " + titulo);
        System.out.println("Cor: " + cor);
        System.out.println("Fonte: " + fonte);
        System.out.println("Logotipo: " + logotipo);
        System.out.println("-------------------------");
    }
}
