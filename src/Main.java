package list.operacoesbasicas;

public class Main {

    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Treinar List");
        lista.adicionarTarefa("Subir projeto no Git");

        System.out.println("Total de tarefas: " +
                lista.obterNumeroTotalTarefas());

        for (String desc : lista.obterDescricoesTarefas()) {
            System.out.println("- " + desc);
        }
    }
}
