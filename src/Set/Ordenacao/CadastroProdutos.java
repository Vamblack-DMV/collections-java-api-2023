package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    private Set <Produto> produtoSet;

    //Construtor
    public CadastroProdutos () {
        this.produtoSet = new HashSet<>();
    }

    //Adicionar Produto
    public void adicionarProduto (long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    //Exibir produto por nome
    public Set <Produto> exibirProdutosPorNome () {
        //Criando variável para manipulação
        Set <Produto> produtorPorNome = new TreeSet<>(produtoSet);
        return produtorPorNome;
    }

    //Exibir produto por preco
    public Set <Produto> exibirProdutosPorPreco () {
        //Criando variável para manipulação
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        //Exibindo produtos Cadastrados
        System.out.println(cadastroProdutos.produtoSet);

        //Exibindo produtos por Nome
        System.out.println("\nProdutos Cadastrados por Nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
        //Exibindo produtos por preco
        System.out.println("\nProdutos Cadastrados por Preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
