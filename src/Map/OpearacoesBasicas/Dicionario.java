package Map.OpearacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    private Map <String, String> dicionarioMap;

    //Construtor
    public Dicionario () {
        this.dicionarioMap = new HashMap<>();
    }

    //Adicionar palavra ao dicionario
    public void adicionarPalavra (String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    //Remover palavra do dicionario
    public void removerPalavra (String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Seu dicionario está vazio");
        }
    }
    
    //Exibir palavras do dicionario
    public void exibirPalavras () {
        System.out.println(dicionarioMap);
    }
    
    //Pesquisar palavras no dicionario
    public String pesquisarPorPalavra (String palavra) {
        //Criando variável para manipulação
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }


    public static void main(String[] args) {
        //Instanciando objeto para manipulação
        Dicionario dicionario = new Dicionario();

        //Adicionando palavras ao dicionario
        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a ojetos");
        dicionario.adicionarPalavra("TypeScript", "Superset de linguagem JavaScript que adicionar tipagem estática");
        dicionario.adicionarPalavra("Kotlin", "Linguagem modern de programação para a JVM");

        //Exibindo dicionário
        dicionario.exibirPalavras();
        
        //Pesquisando palavras do dicionário sendo nula ou verdadeira
        String definicaoJava = dicionario.pesquisarPorPalavra("Java");
        System.out.println("Definição da Linguagem 'JAVA': " + definicaoJava);
        
        String definicaoCSharp = dicionario.pesquisarPorPalavra("CSharp");
        System.out.println(definicaoCSharp);
        
        //Removendo palavra do dicionario
        dicionario.removerPalavra("TypeScript");
        
        //Exibindo dicionário
        dicionario.exibirPalavras();
    }
}
