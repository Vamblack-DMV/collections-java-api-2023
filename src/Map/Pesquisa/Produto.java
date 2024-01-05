package Map.Pesquisa;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Recebendo o valor das variáveis
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    //Formatando para impressão
    @Override
    public String toString() {
        return "Produto: " + nome + " - Preço: R$ " + preco + " / Quantidade: " + quantidade + "\n";
    }
}