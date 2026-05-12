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
                        System.out.print("Titulo: "+f.getTitulo());
                        System.out.print("Deseja alterar o titulo: ");
                        System.out.print("[1] - SIM\n[2] - NÃO");
                        int alterartitulo = Integer.parseInt(leitor.nextLine());
                        if(alterartitulo == 1){
                            System.out.print("Digite o novo título: ");
                            String novotitulo = leitor.nextLine();
                            f.setTitulo(novotitulo);
                        }else {
                            System.out.print("Genero: "+f.getGenero());
                            System.out.print("Deseja alterar o gênero: ");
                            System.out.print("[1] - SIM\n[2] - NÃO");
                            int alterargenero = Integer.parseInt(leitor.nextLine());
                            if(alterargenero == 1){
                                System.out.print("Digite o novo gênero");
                                String novogenero = leitor.nextLine();
                                f.setGenero(novogenero);
                            }
                        }

                    }

                case 4:
                    System.out.print("Digite o nome do filme que deseja remover: ");
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