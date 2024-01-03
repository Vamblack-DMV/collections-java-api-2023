package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    //Atributos
    private List <Integer> numerosList;

    //Construtor
    public OrdenacaoNumeros () {
        this.numerosList = new ArrayList<>();
    }

    //Adicionar números a lista
    public void adicionarNumeros (int numero) {
        this.numerosList.add(numero);
    }

    //Ordenar de modo Crescente
    public List <Integer> ordenarAscendente () {
        //Instanciando objeto para manipulação
        List <Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    //Ordenar de modo decrescente
    public List <Integer> ordenarDescendentes () {
        //Instanciando objeto para manipulação
        List <Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Exibindo Números
    public void exibirNumeros () {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        
        //Construindo a instância
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //Adicionando números à lista
        numeros.adicionarNumeros(2);
        numeros.adicionarNumeros(5);
        numeros.adicionarNumeros(4);
        numeros.adicionarNumeros(1);
        numeros.adicionarNumeros(99);

        //Exibindo a lista de números
        numeros.exibirNumeros();
        
        //Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
        
        //Exibindo a lista
        numeros.exibirNumeros();
        
        //Ordenando e exibindo em ordem decrescente
        System.out.println(numeros.ordenarDescendentes());
        
        //Exibindo a lista
        numeros.exibirNumeros();
    }
}
