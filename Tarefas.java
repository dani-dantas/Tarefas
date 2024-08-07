package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Você não tem nenhuma tarefa.");
                    } else {
                        System.out.println("Suas tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Você não tem nenhuma tarefa para marcar como concluída.");
                    } else {
                        System.out.print("Digite o número da tarefa a ser marcada: ");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < tarefas.size()) {
                            String tarefaConcluida = tarefas.remove(indice);
                            System.out.println("Tarefa '" + tarefaConcluida + "' marcada como concluída!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
