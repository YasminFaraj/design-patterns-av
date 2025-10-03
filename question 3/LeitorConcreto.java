class LeitorConcreto implements Leitor {
    private final String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String nomeTopico, Noticia noticia) {
        System.out.println("  -> " + nome + " recebeu notificacao do topico '" + nomeTopico +
                           "': " + noticia.getTitulo());
    }

    @Override
    public String getNome() { return nome; }
}