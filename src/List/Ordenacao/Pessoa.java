package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa>{
    //Atributo
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa (String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Método de comparação Comparable <T> (generics)
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
    
    //Recebendo as informações das variáveis
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }

    //Formatando a impresão
    @Override
    public String toString() {
        return "\nNome: " + nome + ", Idade: " + idade + ", Altura: " + altura + " cm";
    }
}

class ComparatorPorAltura implements Comparator <Pessoa> {

    //Implementando o método de comparação pelo comparator
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}