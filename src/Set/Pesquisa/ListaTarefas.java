package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributos
    private Set <Tarefa> tarefasSet;

    //Construtor
    public ListaTarefas () {
        this.tarefasSet = new HashSet<>();
    }

    //Adicionar tarefas a lista
    public void adicionarTarefa (String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    //Remover tarefa da lista
    public void removerTarefa (String descricao) {
        //Criando variável para manipulação
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Sua lista de tarefas está vazia!");
        }

    }

    //Exibir tarefas da lista
    public void exibirTarefas () {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Sua lista de tarefas está vazia!");
        }
    }

    //Contar tarefas da lista
    public int contarTarefas () {
        return tarefasSet.size();
    }

    //Obter tarefas concluidas
    public Set <Tarefa> obterTarefasConcluidas () {
        //Criando variável para manipulação
        Set <Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                } 
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("Sua lista de tarefas já está vazia!");
        }
    }   

    //Obter tarefas pendentes
    public Set <Tarefa> obterTarefasPendentes () {
        //Criando variável para manipulação
        Set <Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet) {
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                } 
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Sua lista de tarefas já está vazia!");
        }
    }

    //Marcar tarefa como concluída
    public Tarefa marcarTarefaConcluida (String descricao) {
        //Criando variável para manipulação
        Tarefa tarefaParaMarcarConcluida = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao() == descricao) {
                    t.setConcluida(true);
                    tarefaParaMarcarConcluida = t;
                    break;
                }
            }
            return tarefaParaMarcarConcluida;
        } else {
            throw new RuntimeException("Sua lista de tarefas já está vazia!");
        }
    }
        
        //Marcar tarefa como pendente
    public Tarefa marcarTarefaPendente (String descricao) {
        //Criando variável para manipulação
        Tarefa tarefaParaMarcarConcluida = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao() == descricao) {
                    t.setConcluida(false);
                    tarefaParaMarcarConcluida = t;
                    break;
                }
            }
            return tarefaParaMarcarConcluida;
        } else {
            throw new RuntimeException("Sua lista de tarefas já está vazia!");
        }
    }
        
        //Limpar a lista de tarefas
    public void limparListaTarefas () {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
        } else {
            System.out.println("Sua lista de tarefas já está vazia!");
        }
    }

    public static void main(String[] args) {
        //Instanciando objeto para manipulação
        ListaTarefas listaTarefas = new ListaTarefas();

        //Exibir lista Tarefas
        listaTarefas.exibirTarefas();

        //Contanto número de tarefas na lista
        System.out.println("O número de tarefas na lista é: " + listaTarefas.contarTarefas());
        
        //Adicionando tarefas a lista
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");
        
        //Exibir lista Tarefas
        listaTarefas.exibirTarefas();
        
        //Contanto número de tarefas na lista
        System.out.println("O número de tarefas na lista é: " + listaTarefas.contarTarefas());
        
        //Removendo tarefa da lista
        listaTarefas.removerTarefa("Tarefa 3");
        
        //Exibir lista Tarefas
        listaTarefas.exibirTarefas();
        
        //Marcando as tarefas pares como concluidas
        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 4");
        listaTarefas.marcarTarefaConcluida("Tarefa 6");
        
        //Exibir lista Tarefas
        listaTarefas.exibirTarefas();
        
        //Obtendo tarefas concluidas
        System.out.println("\nSuas tarefas concluídas são:");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        
        //Obtendo tarefas pendentes
        System.out.println("\nSuas tarefas pendentes são:");
        System.out.println(listaTarefas.obterTarefasPendentes());
        
        //Marcando as tarefas pares como pendente
        listaTarefas.marcarTarefaPendente("Tarefa 4");
        
        //Exibir lista Tarefas
        listaTarefas.exibirTarefas();
        
        //Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        
        //Contanto número de tarefas na lista
        System.out.println("O número de tarefas na lista é: " + listaTarefas.contarTarefas());
    }
}
