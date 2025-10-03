import java.util.ArrayList;
import java.util.List;

class TopicoNoticia implements Topico {
    private final String nome;
    private final List<Leitor> inscritos = new ArrayList<>();

    public TopicoNoticia(String nome) {
        this.nome = nome;
    }

    @Override
    public void inscrever(Leitor leitor) {
        if (!inscritos.contains(leitor)) {
            inscritos.add(leitor);
        }
    }

    @Override
    public void desinscrever(Leitor leitor) {
        inscritos.remove(leitor);
    }

    @Override
    public void publicar(Noticia noticia) {
        System.out.println("[" + nome + "] Publicando: " + noticia.getTitulo());
        for (Leitor l : new ArrayList<>(inscritos)) {
            l.notificar(nome, noticia);
        }
    }

    @Override
    public String getNome() { return nome; }
}