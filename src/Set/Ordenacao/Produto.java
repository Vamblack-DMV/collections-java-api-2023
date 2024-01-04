package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto> {
    //Atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto (long codigo, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Método para comparação utilizando o Comparable <Produto> para deixar como ordem natural de classificação
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Método evitar duplicatas
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    public int hashCode () {
        return Objects.hash(getCodigo());
    }
    
    //Recebendo os valores das variáveis
    public long getCodigo() {return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    //Formatando a impressão
    @Override
    public String toString() {
        return "\n" + codigo + " - " + nome + " - R$ " + preco + " - " + quantidade;
    }

}

//Criando o comparator para utilização e ordenação
class ComparatorPorPreco implements Comparator <Produto> {

    //Método de comparação por Preço utilizando o Comparator
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),    p2.getPreco());
    }
    
}