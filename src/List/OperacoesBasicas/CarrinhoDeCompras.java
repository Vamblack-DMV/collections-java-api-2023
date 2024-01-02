package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    //Atributos
    private List <Item> itemLista;

    //Construtor
    public CarrinhoDeCompras () {
        this.itemLista = new ArrayList<>();
    }

    //Adicionar Item
    public void adicionarItem (String nome, double preco, int quantidade) {
        itemLista.add(new Item(nome, preco, quantidade));
    }

    //Remover Item
    public void removerItem (String nome) {
        //Criando lista para remoção
        List <Item> itensParaRemover = new ArrayList<>();
        if (!itemLista.isEmpty()) {
            for (Item t : itemLista) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(t);
                }                    
            }
        } else {
            System.out.println("Seu carrinho de compras está vazio!" + "\n Por favor adicione itens primeiro!");
        }
        itemLista.removeAll(itensParaRemover);
    }
    
    //Calcular Valor Total
    public double calcularValorTotal () {
        //Variavel para calculo
        double valorTotal;
        valorTotal = 0;
        if (!itemLista.isEmpty()) {
            for (Item t : itemLista) {
                valorTotal += t.getPreco() * t.getQuantidade();
            }
        } else {
            System.out.println("Seu carrinho de compras está vazio!" + "\n Por favor adicione itens primeiro!");
        }
        return valorTotal;
    }

    //Exibir Itens
    public void exibirItens () {
        System.out.println(itemLista);
    }

    public static void main(String[] args) {
        //Criando o objeto
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();
        
        //Adicionando Item ao carrinho de compras
        carrinhoCompras.adicionarItem("Notebook", 1200.00, 2);
        carrinhoCompras.adicionarItem("Celular", 850.00, 4);
        carrinhoCompras.adicionarItem("Mouse", 12.50, 3);
        carrinhoCompras.adicionarItem("Teclado", 52.00, 5);
        carrinhoCompras.adicionarItem("Monitor", 2400.50, 7);
        
        //Exibindo itens da Lista
        carrinhoCompras.exibirItens();
        
        //Removendo item
        carrinhoCompras.removerItem("Monitor");
        
        //Exibindo itens da Lista
        carrinhoCompras.exibirItens();

        //Calculando o valor total do carrinho
        System.out.println("O valor total do seu carrinho de compras é: R$ " + carrinhoCompras.calcularValorTotal());
    }
}
