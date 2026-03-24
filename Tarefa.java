package viii_desafios.lista_de_tarefas;

public class Tarefa {
    //Atributos
    private String descricao;
    private boolean concluida;
    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }
    // Concluida
    public void marcarConcluida(){
        this.concluida = true;
    }
    // Não concluida
    public void desmarcarConcluida(){
        this.concluida = false;
    }

    @Override
    public String toString() {
        return descricao+  " " + (concluida? "[Concluida]" : "[Pendente]");
    }

    // Getters e setters
    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

