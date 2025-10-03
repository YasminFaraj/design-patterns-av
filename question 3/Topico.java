public interface Topico {
    void inscrever(Leitor leitor);
    void desinscrever(Leitor leitor);
    void publicar(Noticia noticia);
    String getNome();
}