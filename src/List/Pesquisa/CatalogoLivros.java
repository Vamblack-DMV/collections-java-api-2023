package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    //Atributo
    private List <Livro> livroList;

    //Construtor
    public CatalogoLivros () {
        this.livroList = new ArrayList<>();
    }

    //Adicionar Livros
    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar por Autor
    public List <Livro> pesquisarPorAutor (String autor) {
        //Criando a lista de mesmo autor
        List <Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Pesquisar por Intervalo de Anos
    public List <Livro> pesquisaPorIntervaloAnos (int anoInicial, int anoFinal) {
        //criando a lista por intervalo de anos
        List <Livro> livrosPorIntevaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntevaloAnos.add(l);
                }
            }
        }
        return livrosPorIntevaloAnos;
    }

    //Pesquisar por Titulo
    public Livro pesquisarPorTitulo (String titulo) {
        //Criando objeto para retorno
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        //Criando objeto
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //Adicionando livros no catalogo
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        //Pesquisando por Autor
        System.out.println("Os livros do Autor 2 são:\n" + catalogoLivros.pesquisarPorAutor("Autor 2"));
        
        //Pesquisando por Autor
        System.out.println("Os livros dentro do intervalo de 2021 até 2023 são:\n" + catalogoLivros.pesquisaPorIntervaloAnos(2021, 2023));

        //Pesquisar por Titulo
        System.out.println("O livro com titulo Livro 1 que temos é o: " + catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}