import java.util.ArrayList;

public interface PipocaPedente {
    ArrayList<Filme> filmes();
    void cadastrarFilme(Filme filme);
    void deletarFilme(Filme filme);
}
