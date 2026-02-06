package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    } 

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa ->
                tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }
}
