public class Main {
// Observer pattern
// Subject = Topic (cada topico de noticias e um subject que notifica seus observers/Readers).
// Observer = Reader (leitor inscrito em um ou mais topicos).
// utilizei Observer pois permite que o site publique notícias em um topico e todos os leitores
// inscritos recebam notificações automaticamente, sem que precise notificar manualmente.
    public static void main(String[] args) {
        Topico politica = new TopicoNoticia("Politica");
        Topico esportes = new TopicoNoticia("Esportes");
        Topico tecnologia = new TopicoNoticia("Tecnologia");

        Leitor leitorA = new LeitorConcreto("Ana");
        Leitor leitorB = new LeitorConcreto("Bruno");
        Leitor leitorC = new LeitorConcreto("Carlos");

        // inscricoes
        politica.inscrever(leitorA);
        politica.inscrever(leitorB);

        esportes.inscrever(leitorB);
        esportes.inscrever(leitorC);

        tecnologia.inscrever(leitorA);
        tecnologia.inscrever(leitorC);

        // publicacoes
        politica.publicar(new Noticia("Reforma aprovada", "Detalhes sobre a reforma..."));
        tecnologia.publicar(new Noticia("Novo smartphone lançado", "Especificacoes e preco..."));
        esportes.publicar(new Noticia("Time X vence campeonato", "Resumo da final..."));

        // desinscrever exemplo
        politica.desinscrever(leitorB);
        politica.publicar(new Noticia("Entrevista com o ministro", "Conteudo da entrevista..."));
    }
}
