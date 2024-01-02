package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //Atributo
    private List <Tarefa> tarefaList;
    
    //Construtor
    public ListaTarefa () {
        this.tarefaList = new ArrayList<>();
    }

    //Adicionar Tarefa
    public void adicionarTarefa (String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //Remover Tarefa
    public void removerTarefa (String descricao) {
        //Criando Lista para remoção
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Obter Número Total de Tarefas
    public int obterNumeroTotalTarefas () {
        return tarefaList.size();
    }

    //Obter Descrições de Tarefas
    public void obterDescricoesTarefas () {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        
        //Criando o objeto
        ListaTarefa listaTarefa = new ListaTarefa();

        //Verificando o número total de Tarefas
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        //Adicionando tarefas a lista
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        
        //Verificando o número total de Tarefas
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        //Removendo tarefas da lista
        listaTarefa.removerTarefa("Tarefa 1");

        //Verificando o número total de Tarefas
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //Obtendo as descrições das tarfas
        listaTarefa.obterDescricoesTarefas();
    }
}
