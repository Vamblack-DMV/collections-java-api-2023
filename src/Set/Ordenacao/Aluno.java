package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable <Aluno> {
    //Atributos
    private String nome;
    private long matricula;
    private double nota;

    //Construtor
    public Aluno (long matricula, String nome, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Criando variável única
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    public int hashCode () {
        return Objects.hash(getMatricula());
    }
    
    //Método para comparação por nome utilizando o Comparable
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    //Recebendo o valor das variaveis
    public long getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public double getNota() { return nota; }

    //Formatando a impressão
    @Override
    public String toString() {
        return "\nMatrícula: " + matricula + " - Aluno: " + nome + " - Nota: " + nota;
    }
}

class ComparatorPorNota implements Comparator <Aluno> {
    
    //Método de comparação por nota utilizando o Comparator <Aluno>
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
