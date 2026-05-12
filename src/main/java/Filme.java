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

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nDuração: " + duracao + " min\n";
    }
}