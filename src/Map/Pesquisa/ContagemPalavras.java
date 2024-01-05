package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributos
    private Map <String, Integer> contagemPalavrasMap;

    //Construtor
    public ContagemPalavras () {
        this.contagemPalavrasMap = new HashMap<>();
    }

    //Adicionar palavra
    public void adicionarPalavra (String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    //Remover palavra
    public void removerPalavra (String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Sua lista de contagem está vazia!");
        }
    }
    
    //Exibir contagem de palavras
    public void exibirContagemPalavras () {
        System.out.println(contagemPalavrasMap);
    }
    
    //Exibir contagem total de palavras
    public int exibirTotalDePalavras () {
        //Criando variável para manipulação
        int contagemTotal = 0;
        
        //Criando a lógica
        if (!contagemPalavrasMap.isEmpty()) {
            for (int contagem : contagemPalavrasMap.values()) {
                contagemTotal += contagem;
            }
        } else {
            System.out.println("Sua lista de contagem está vazia!");
        }
        return contagemTotal;
    }

    //Exibir palavra mais frequente
    public String encontrarPalavraMaisFrequente () {
        //Instanciando objeto a ser retornado
        String palavraMaisFrequente = null;

        //Criando variável para manipulação
        int maiorContagem = 0;

        //Criando lógica de análise
        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry <String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        //Instanciando objeto para manipulação
        ContagemPalavras linguagens = new ContagemPalavras();

        //Adicionando palavras ao map
        linguagens.adicionarPalavra("Java", 2);
        linguagens.adicionarPalavra("Python", 8);
        linguagens.adicionarPalavra("JavaScript", 1);
        linguagens.adicionarPalavra("C#", 6);

        //Exibindo contagem de palavras
        linguagens.exibirContagemPalavras();
        
        //Exibindo contagem total de palavras
        System.out.println("No texto existem " + linguagens.exibirTotalDePalavras() + " palavras cadastradas.");
        
        //Removendo palava do conjunto
        linguagens.removerPalavra("JavaScript");
        
        //Exibindo contagem de palavras
        linguagens.exibirContagemPalavras();

        //Exibindo a Linguagem mais frequente
        String linguagemMaisFrequente = linguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
