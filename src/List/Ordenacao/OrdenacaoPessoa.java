package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    
    //Atributo
    private List <Pessoa> pessoaList;

    //Construtor
    public OrdenacaoPessoa () {
        this.pessoaList = new ArrayList<>();
    }

    //Adicionar Pessoa
    public void adicionarPessoa (String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Ordenar por Idade
    public List <Pessoa> ordenarPorIdade () {
        //Construtor para manipulação
        List <Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //Ordenando a lista
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Ordenar por Altura
    public List <Pessoa> ordenarPorAltura () {
        //Construtor para manipulação
        List <Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //Ordenando a lista
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        
        //Construtor (instanciando) de objeto
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        //Adicinando pessoas a lista
        ordenacaoPessoa.adicionarPessoa("Nome 1 ", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2 ", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3 ", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4 ", 17, 1.56);

        //Ordenando por Idade
        System.out.println("Lista ordenada por Idade:\n" + ordenacaoPessoa.ordenarPorIdade());
        
        //Ordenando por Altura
        System.out.println("Lista ordenada por Altura:\n" + ordenacaoPessoa.ordenarPorAltura());
    }
}
