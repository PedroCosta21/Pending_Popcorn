import java.util.Scanner;
import java.util.ArrayList;

public class SistemaPipocaPendente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList<>();

        while (true) {
            System.out.println("\n-----Pipoca Pendente-----");
            System.out.println("[1] - Listar Filmes");
            System.out.println("[2] - Cadastrar Filme");
            System.out.println("[3] - Editar Filme");
            System.out.println("[4] - Deletar Filme");
            System.out.println("[5] - Sair");

            int opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        for (Filme f : filmes) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Título: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Gênero: ");
                    String genero = leitor.nextLine();

                    System.out.print("Diretor: ");
                    String diretor = leitor.nextLine();

                    System.out.print("Duração: ");
                    int duracao = Integer.parseInt(leitor.nextLine());

                    filmes.add(new Filme(titulo, genero, diretor, duracao));
                    System.out.println("Filme adicionado!");
                    break;

                case 3:
                    for(Filme f : filmes){
                        System.out.println("Titulo: "+f.getTitulo());
                        System.out.print("Deseja alterar o titulo: ");
                        String alteraTitulo = leitor.nextLine();
                        if(alteraTitulo.equalsIgnoreCase("sim")){
                            f.setTitulo()
                        }

                    }

                case 4:
                    System.out.print("Título para remover: ");
                    String remover = leitor.nextLine();

                    filmes.removeIf(f -> f.getTitulo().equalsIgnoreCase(remover));
                    System.out.println("Remoção concluída!");
                    break;

                case 5:
                    leitor.close();
                    System.out.println("Encerrando...");
                    return;
            }
        }
    }
}