package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private int numero;

    //Construtor
    public Contato (String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Recebendo os valores das variáveis
    public String getNome() { return nome; }
    public int getNumero() { return numero; }

    //Atulizando o valor da variável
    public void setNumero(int numero) { this.numero = numero; }

    //Método para o contato ser único pelo nome
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    public int hashCode () {
        return Objects.hash(getNome());
    }

    //Formatando para impressão
    @Override
    public String toString() {
        return "\nNome: " + nome + ", Número: " + numero;
    }
}
