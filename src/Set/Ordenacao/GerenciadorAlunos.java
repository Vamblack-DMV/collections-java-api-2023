package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributos
    private Set <Aluno> alunosSet;

    //Construtor
    public GerenciadorAlunos () {
        this.alunosSet = new HashSet<>();
    }

    //Adicionar os alunos no Set
    public void adicionarAluno (String nome, long matricula, double nota) {
        alunosSet.add(new Aluno(matricula, nome, nota));
    }

    //Remover alunos do Set
    public void removerAluno (long matricula) {
        //Criando variável para manipulação
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("Sua lista de gerenciamento está vazia!");
        }

        if (alunoParaRemover == null) {
            System.out.println("A matrícula informada não foi registrada anteriormente!");
        }
    }

    //Exibir alunos por nome
    public void exibirAlunosPorNome () {
        //Criando variável para manipulação
        Set <Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Sua lista de gerenciamento está vazia!");
        }
    }
    
    //Exibir aluno por nota
    public void exibirAlunosPorNota () {
        //Criando variável para manipulação
        Set <Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Sua lista de gerenciamento está vazia!");
        }
    }

    //Exibir alunos do set
    public void exibirAlunos () {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        //Adicionando alunos a lista com suas notas
        listaAlunos.adicionarAluno("João", 123456L, 7.5);
        listaAlunos.adicionarAluno("Maria", 123457L, 9.0);
        listaAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        listaAlunos.adicionarAluno("Ana", 123459L, 6.8);

        //Exibindo a lista com os alunos
        System.out.println("Alunos cadastrados no Gerenciador:");
        listaAlunos.exibirAlunos();
        
        //Removendo alunos com matrícula inválida e pela matrícula
        listaAlunos.removerAluno(000L);
        listaAlunos.removerAluno(123457L);
        
        //Exibindo a lista com os alunos após remoção
        System.out.println("Alunos cadastrados no Gerenciador:");
        listaAlunos.exibirAlunos();

        //Exibindo alunos por nome
        System.out.println("Lista de Alunos por Nome:");
        listaAlunos.exibirAlunosPorNome();

        //Exibindo alunos por nota
        System.out.println("Lista de Alunos por Nota:");
        listaAlunos.exibirAlunosPorNota();
    }
}
