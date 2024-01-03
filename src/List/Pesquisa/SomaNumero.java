package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    //Atributo
    private List <Integer> numeros;
    
    //Construtor
    public SomaNumero () {
        this.numeros = new ArrayList<>();
    }

    //Adicionar Números
    public void adicionarNumeros (int numero) {
        this.numeros.add(numero);
    }

    //Calcular Soma
    public int calcularSoma () {
        //Criando variável para realização da soma
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                soma += numero;
            }
        }
        return soma;
    }

    //Encontrar o Maior Número
    public int encontrarMaiorNumero () {
        //Criando variável para verificação
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A sua lista está vazia!");
        }
    }

    //Encontrar o Menor Número
    public int encontrarMenorNumero () {
        //Criando variável para verificação
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A sua lista está vazia");
        }
    }

    //Exibir Números
    public void exibirNumeros () {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("A sua lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //Criando (Instanciando) o objeto da classe
        SomaNumero somaNumero = new SomaNumero();

        //Adicionando números a lista
        somaNumero.adicionarNumeros(5);
        somaNumero.adicionarNumeros(0);
        somaNumero.adicionarNumeros(0);
        somaNumero.adicionarNumeros(-2);
        somaNumero.adicionarNumeros(10);

        //Exibindo a lista de números adicionados
        System.out.println("Números Adicionados");
        somaNumero.exibirNumeros();

        //Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumero.calcularSoma());

        //Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumero.encontrarMaiorNumero());

        //Encontrando e exibindo o maior número na lista
        System.out.println("Menor Número = " + somaNumero.encontrarMenorNumero());
    }

}
