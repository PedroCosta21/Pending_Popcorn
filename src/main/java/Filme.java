import java.util.Objects;

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
        return "\nFilme: " + titulo +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nDuração: " + duracao + " min\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme)) return false;
        Filme filme = (Filme) o;
        return titulo.equalsIgnoreCase(filme.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase());
    }

    // getters e setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
}