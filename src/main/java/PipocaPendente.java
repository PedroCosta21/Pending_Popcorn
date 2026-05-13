public interface PipocaPendente {
    void cadastrarFilme(Filme filme);
    void listarFilmes();
    void editarFilme(String titulo);
    void deletarFilme(String titulo);
}