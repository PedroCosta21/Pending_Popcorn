import java.util.ArrayList;
import java.util.List;

public class SistemaFilmes implements PipocaPendente {

    private List<Filme> filmes = new ArrayList<>();

    @Override
    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    @Override
    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            filmes.forEach(System.out::println);
        }
    }

    @Override
    public void editarFilme(String titulo) {
        for (Filme f : filmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo)) {
                f.setTitulo(titulo + " (Editado)");
                System.out.println("Filme editado!");
                return;
            }
        }
        System.out.println("Filme não encontrado!");
    }

    @Override
    public void deletarFilme(String titulo) {
        boolean removido = filmes.removeIf(f -> f.getTitulo().equalsIgnoreCase(titulo));
        if (removido) {
            System.out.println("Filme removido!");
        } else {
            System.out.println("Filme não encontrado!");
        }
    }
}