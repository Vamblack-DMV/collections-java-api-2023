package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    //atributo
    private Set<String> palavrasUnicasSet;

    //Construtor
    public ConjuntoPalavrasUnicas () {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //Adicionar palavras ao Set
    public void adicionarPalavra (String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    //Remover palavra do set
    public void removerPalavra (String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("A palavra não pertence ao seu conjunto de palavras!");
            }
        } else {
            System.out.println("Seu conjunto de palvras está vazio!\nPor favor adicionar palavras primeiro!");
        }
    }

    //Verificar se a Palavra está no Set
    public boolean verificarPalavra (String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    //Exibir palavras do conjunto
    public void exibirPalavrasUnicas () {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println("Seu conjunto de palavras é \n" + palavrasUnicasSet + "\n");
        } else {
            System.out.println("Seu conjunto de palvras está vazio!\nPor favor adicionar palavras primeiro!");
        }
    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        //Adicionando as linguagens ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        //Exibindo as linguagens do conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
        
        //Removendo uma linguagem do cunjunto
        conjuntoLinguagens.removerPalavra("Python");
        
        //Exibindo as linguagens do conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
        
        //Removendo uma linguagem inesistentes
        conjuntoLinguagens.removerPalavra("Swift");
        
        //Verificando linguagens presentes no conjunto
        System.out.println("A linguagem 'Java' está no conjunto?\n" + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto?\n" + conjuntoLinguagens.verificarPalavra("Python"));
        
        //Exibindo as linguagens do conjunto atualizado
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
