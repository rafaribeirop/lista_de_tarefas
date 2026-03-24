package viii_desafios.lista_de_tarefas.lista_de_tarefas;

import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefas t = new ListaTarefas();
        int resp;

        do{
            //Menu inicial
            System.out.println("----- Lista de tarefas -----");
            System.out.println("[1] Adicionar");
            System.out.println("[2] Listar");
            System.out.println("[3] Remover");
            System.out.println("[4] Marcar tarefa como concluida");
            System.out.println("[5] Desmarcar tarefa");
            System.out.println("[0] Sair");
            resp = sc.nextInt();
            sc.nextLine();

            if (resp < 0 || resp > 5) {
                System.out.println("Dígito inválido");
            } else {
                switch (resp) {
                    case 1:
                        String descricao;
                        do {
                            System.out.println("Nova tarefa: (Digite 0 para parar de adicionar)");
                            descricao = sc.nextLine();
                            if (!descricao.equals("0")) {
                                t.adicionar(descricao);
                            }
                        } while (!descricao.equals("0"));
                        t.listar();
                        break;
                    case 2:
                        t.listar();
                        break;
                    case 3:
                        System.out.println("Digite o NÚMERO da tarefa que deseja remover: ");
                        t.listar();
                        int indice = sc.nextInt();
                        sc.nextLine();
                        t.remover(indice);
                        t.listar();
                        break;
                    case 4:
                        System.out.println("Digite o número da tarefa: ");
                        t.listar();
                        int concluida = sc.nextInt();
                        sc.nextLine();
                        t.marcarConcluida(concluida);
                        t.listar();
                        break;
                    case 5:
                        System.out.println("Digite o número da tarefa: ");
                        t.listar();
                        int pendente = sc.nextInt();
                        sc.nextLine();
                        t.desmarcarConcluida(pendente);
                        t.listar();
                        break;
                    case 0:
                        System.out.println("..Saindo..");
                }
            }
        } while (resp != 0);
    }
}
