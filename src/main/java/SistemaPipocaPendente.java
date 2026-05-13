import java.util.Scanner;

public class SistemaPipocaPendente {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        SistemaFilmes sistema = new SistemaFilmes();

        while (true) {
            exibirMenu();

            try {
                int opcao = Integer.parseInt(leitor.nextLine());

                switch (opcao) {
                    case 1 -> sistema.listarFilmes();
                    case 2 -> cadastrar(leitor, sistema);
                    case 3 -> editar(leitor, sistema);
                    case 4 -> deletar(leitor, sistema);
                    case 5 -> {
                        System.out.println("Encerrando...");
                        return;
                    }
                    default -> System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Erro: digite um número válido!");
            }
        }
    }

    static void exibirMenu() {
        System.out.println("\n-----Pipoca Pendente-----");
        System.out.println("[1] - Listar Filmes");
        System.out.println("[2] - Cadastrar Filme");
        System.out.println("[3] - Editar Filme");
        System.out.println("[4] - Deletar Filme");
        System.out.println("[5] - Sair");
    }

    static void cadastrar(Scanner leitor, SistemaFilmes sistema) {
        System.out.print("Título: ");
        String titulo = leitor.nextLine();

        System.out.print("Gênero: ");
        String genero = leitor.nextLine();

        System.out.print("Diretor: ");
        String diretor = leitor.nextLine();

        System.out.print("Duração: ");
        int duracao = Integer.parseInt(leitor.nextLine());

        sistema.cadastrarFilme(new Filme(titulo, genero, diretor, duracao));
    }

    static void editar(Scanner leitor, SistemaFilmes sistema) {
        System.out.print("Digite o título do filme: ");
        String titulo = leitor.nextLine();
        sistema.editarFilme(titulo);
    }

    static void deletar(Scanner leitor, SistemaFilmes sistema) {
        System.out.print("Digite o título do filme: ");
        String titulo = leitor.nextLine();
        sistema.deletarFilme(titulo);
    }
}