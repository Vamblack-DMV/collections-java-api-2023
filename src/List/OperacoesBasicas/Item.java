package List.OperacoesBasicas;

public class Item {
    
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Item (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Recebendo os valores das variáveis
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    //Formatando a impressão
    @Override
    public String toString() {
        return "\n Produto: " + nome + ", Quantidade: " + quantidade + ", Preço: R$ " + preco;
    }
}
