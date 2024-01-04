package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos () {
        this.contatoSet = new HashSet<>();
    }

    //Adicionar contato ao set
    public void adicionarContato (String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //Exibir contatos do set
    public void exibirContatos () {
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            System.out.println("A sua agenda de contato está vazia!");
        }
    }
    
    //Pesquisar no set por nome
    public Set <Contato> pesquisarPorNome (String nome) {
        //Criação de variável para manipulação
        Set <Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("A sua agenda de contato está vazia!");
        }
    }

    //Atualizar número do contato
    public Contato atualizarNumeroContato (String nome, int novoNumero) {
        //Criação de variável para manipulação
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("A sua agenda de contato está vazia!");
        }

    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        AgendaContatos agendaContatos = new AgendaContatos();

        //Exibindo a agenda de contatos
        
        //Adicionando contatos na agenda
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        
        //Exibindo a agenda de contatos
        agendaContatos.exibirContatos();
        
        //Pesquisando contatos na agenda por nome
        System.out.println("Seus contatos com 'Camila' são:\n" + agendaContatos.pesquisarPorNome("Camila"));
        
        //Atualizando o contato
        System.out.println("Contato da Maria atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));
        
        //Exibindo a agenda de contatos
        agendaContatos.exibirContatos();
    }
}
