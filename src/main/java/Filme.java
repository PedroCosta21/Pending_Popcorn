public class Filme {
    private String titulo;
    private String genero;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String genero, String diretor, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nDuração: " + duracao + " min\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}