package viii_desafios.lista_de_tarefas.lista_de_tarefas;

import java.util.ArrayList;
public class ListaTarefas {

    // Lista que vai armazenar várias tarefas
    private ArrayList<Tarefa> tarefas;

    //Construtor
    public ListaTarefas() {
        tarefas = new ArrayList<>();
    }

    //Cria uma nova tarefa e adiciona a lista
    public void adicionar(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    //Remove a tarefa com base no indice digitado
    public void remover(int indice) {
        //Verifica se o indice é válido
        if (indice >= 0 && indice < this.tarefas.size()) {
            this.tarefas.remove(indice);
        } else {
            System.out.println("Indice inválido");
        }
    }

    //Mostra todas as tarefas
    public void listar() {
        for (int i = 0; i < this.tarefas.size(); i++) {
            System.out.println(i + " - " + this.tarefas.get(i));
        }
    }
    //Marcar tarefa como concluida
    public void marcarConcluida(int indice){
        if (indice >= 0 && indice < this.tarefas.size()) {
            Tarefa t = tarefas.get(indice);

            if (t.isConcluida()){
                System.out.println("Essa tarefa já está concluida");
            } else {
                t.marcarConcluida();
                System.out.println("Tarefa marcada como concluida!");
            }
        } else {
            System.out.println("Indice inválido");
        }
    }

    //Marcar tarefa como pendente
    public void desmarcarConcluida(int indice){
        if (indice >= 0 && indice < this.tarefas.size()) {
            Tarefa t = tarefas.get(indice);

            if (t.isConcluida()){
                t.desmarcarConcluida();
                System.out.println("Tarefa marcada como pendente");
            } else {
                System.out.println("Essa tarefa já está pendente");
            }
        } else {
            System.out.println("Indice inválido");
        }
    }

    //Getter
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

}
