package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    //Atributo
    private Set<Convidado> convidadosSet;

    //Construtor
    public ConjuntoConvidados () {
        this.convidadosSet = new HashSet<>();
    }

    //Adicionar Convidado
    public void adicionarConvidado (String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    //Remover convidado por código do convite
    public void removerConvidadoPorCodigoConvite (int codigoConvite) {
        //Criando variável para manipulação
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else {
            System.out.println("O set está vazio.\n Por favor adicionar primeiro!");
        }
    }

    //Contar convidados
    public int contarConvidados () {
        return convidadosSet.size();
    }

    //Exibir convidados
    public void exibirConvidados () {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {

        //Instanciando o objeto para trabalho
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //Mostrando quantidade de convidados dentro do Set
        System.err.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados!");
        
        //Adicionando convidados
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        
        //Mostrando quantidade de convidados dentro do Set
        System.err.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados!");
        
        //Removendo convidado pelo número do convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        //Mostrando quantidade de convidados dentro do Set
        System.err.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados!");

        //Exibindo convidados
        conjuntoConvidados.exibirConvidados();
    }
}
