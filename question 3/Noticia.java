public class Noticia {
    private final String titulo;
    private final String conteudo;

    public Noticia(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() { return titulo; }
    public String getConteudo() { return conteudo; }

    @Override
    public String toString() {
        return "Noticia{titulo='" + titulo + "'}";
    }
}
