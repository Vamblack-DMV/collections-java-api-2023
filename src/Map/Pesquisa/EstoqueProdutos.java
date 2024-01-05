package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributo
    private Map <Long, Produto> estoqueProdutosMap;

    //Construtor
    public EstoqueProdutos () {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //Adicionar produto ao estoque
    public void adicionarProduto (long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto (nome, preco, quantidade));
    }

    //Exibir produtos do estoque
    public void exibirProdutos () {
        System.out.println(estoqueProdutosMap);
    }

    //Calcular valor total do estoque
    public double calcularValorTotalEstoque () {
        //Criando variável para manipulação
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    //Obter produto mais caro do estoque
    public Produto obterProdutoMaisCaro () {
        //Instanciando produto para ser retornado
        Produto produtoMaisCaro = null;

        //Criando variável para manipulação
        double maiorPreco = Double.MIN_VALUE;

        //Criando a lógica de verificação
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    //Obter produto mais barato do estoque
    public Produto obterProdutoMaisBarato () {
        //Instanciando produto para ser retornado
        Produto produtoMaisBarato = null;

        //Criando variável para manipulação
        double menorPreco = Double.MAX_VALUE;

        //Criando a lógica de verificação
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    //Obter produto com maior valor total no estoque referente sua quantidade
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque () {
        //Instanciando produto para ser retornado
        Produto produtoMaiorQuantidade = null;

        //Criando variável para manipulação
        double maioValorTotal = 0d;

        //Criando a lógica de verificação
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry <Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                //criando variavel de comparação
                double valorProdutoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEstoque > maioValorTotal) {
                    maioValorTotal = valorProdutoEstoque;
                    produtoMaiorQuantidade = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        //Instanciando objeto para manipulação
        EstoqueProdutos estoque = new EstoqueProdutos();

        //Adicionando produtos ao estoque
        estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 4);
        estoque.adicionarProduto(4L, "Produto D", 20.0, 3);

        //Exibindo produtos do estoque
        estoque.exibirProdutos();

        //Exibindo o valor total do estoque
        System.out.println("O valor total do estoque é R$ " + estoque.calcularValorTotalEstoque());

        //Exibindo o produto mais caro
        System.err.println("O produto mais caro do estoque é:\n" + estoque.obterProdutoMaisCaro());
        
        //Exibindo o produto mais Barato
        System.err.println("O produto mais barato do estoque é:\n" + estoque.obterProdutoMaisBarato());

        //Exibindo o produto com maior valor de estoque
        System.out.println("O produto com maior valor em estoque é:\n" + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}