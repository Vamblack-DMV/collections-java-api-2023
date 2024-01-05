package Map.OpearacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map <String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos () {
        this.agendaContatoMap = new HashMap<>();
    }

    //Adicionar contatos
    public void adicionarContato (String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    //Remover contatos
    public void removerContato (String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    //Exibir contatos
    public void exibirContatos () {
        System.out.println(agendaContatoMap);
    }

    //Pesquisar contatos por nome
    public Integer pesquisarPorNome (String nome) {
        //Criando variável para manipulação
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        AgendaContatos agendaContatos = new AgendaContatos();

        //Adicionando contatos a agenda
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Camila", 44444);

        //Exibindo contatos da agenda
        agendaContatos.exibirContatos();
        
        //Removendo contatos da agenda
        agendaContatos.removerContato("Maria Silva");
        
        //Exibindo contatos da agenda
        agendaContatos.exibirContatos();

        //Pesquisando contato por nome
        agendaContatos.pesquisarPorNome("Camila DIO");
    }
}
