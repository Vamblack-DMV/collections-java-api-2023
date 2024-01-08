package Map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    //Atributos
    private Map <String, Livro> livrariaMap;

    //Construtor
    public LivrariaOnline () {
        this.livrariaMap = new HashMap<>();
    }

    //Adicionar livro a livraria
    public void adicionarLivro (String link, Livro livro) {
        livrariaMap.put(link, livro);
    }

    //Remover livro da livraria por titulo
    public void removerLivro (String titulo) {
        //Criando variavel para manipulação
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry <String, Livro> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livrariaMap.remove(chave);
        }
    }

    //Exibir livro ordenados por preço
    public Map <String, Livro> exibirLivrosOrdenadosPorPreco () {
        //Criando variável para manipulação
        List <Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        //Ordenando a coleção
        Collections.sort (livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        
        Map <String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry <String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }
    
    //Exibir livro ordenador por autor
    public  Map <String, Livro> exibirLivrosOrdenadosPorAutor () {
        //Criando variável para manipulação
        List <Map.Entry <String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());
        
        //Ordenando a coleção
        Collections.sort (livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        
        Map <String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry <String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }
    
    //Pesquisar livros por autor
    public Map <String, Livro> pesquisarLivrosPorAutor (String autor) {
        //Criando variável para manipulação
        Map <String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry <String, Livro> entry : livrariaMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }
    
    //Obter livro mais caro
    public List <Livro> obterLivroMaisCaro () {
        //Criando variável para manipulação
        List <Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está Vazia!");
        }

        for (Map.Entry <String, Livro> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    //Exibir livro mais barato
    public List <Livro> obterLivroMaisBarato () {
        //Criando variável para manipulação
        List <Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está Vazia!");
        }

        for (Map.Entry <String, Livro> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        //Instanciando objeto para manipulação
        LivrariaOnline livraria = new LivrariaOnline();

        //Adicionando livros à livraria
        livraria.adicionarLivro("https://amzn.to/3Ec1T8Z", new Livro("1984", "George Orwell", 50d));
        livraria.adicionarLivro("https://amzn.to/47Umium", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livraria.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livraria.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livraria.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livraria.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        //Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por Preço:\n" + livraria.exibirLivrosOrdenadosPorPreco());
        
        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por Autor:\n" + livraria.exibirLivrosOrdenadosPorAutor());
        
        //Pesquisar livros por autor
        String autorPesquisa = "Josh Malerman";
        livraria.pesquisarLivrosPorAutor(autorPesquisa);

        //Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livraria.obterLivroMaisCaro());

        //Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livraria.obterLivroMaisBarato());

        //Remove um livro pelo título
        livraria.removerLivro("1984");
        System.out.println(livraria.livrariaMap);
    }
}