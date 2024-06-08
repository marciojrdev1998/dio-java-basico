package main.java.list.OperacoesBasicas.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        estoque.put(cod, produto);
    }

    // Método para exibir todos os produtos no estoque
    public void exibirProdutos() {
        for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
            Long cod = entry.getKey();
            Produto produto = entry.getValue();
            System.out.println("Código: " + cod + ", " + produto);
        }
    }

    // Método para calcular o valor total do estoque
    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        for (Produto produto : estoque.values()) {
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotal;
    }

    // Método para obter o produto mais caro
    public Produto obterProdutoMaisCaro() {
        return estoque.values().stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
    }

    // Método para obter o produto mais barato
    public Produto obterProdutoMaisBarato() {
        return estoque.values().stream()
                .min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
    }

    // Método para obter o produto com maior quantidade de valor total no estoque
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        return estoque.values().stream()
                .max((p1, p2) -> Double.compare(p1.getQuantidade() * p1.getPreco(), p2.getQuantidade() * p2.getPreco()))
                .orElse(null);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Adicionando produtos ao estoque
        estoqueProdutos.adicionarProduto(1, "Produto A", 10, 15.5);
        estoqueProdutos.adicionarProduto(2, "Produto B", 5, 25.0);
        estoqueProdutos.adicionarProduto(3, "Produto C", 20, 10.0);

        // Exibindo produtos no estoque
        estoqueProdutos.exibirProdutos();

        // Calculando e exibindo o valor total do estoque
        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        // Obtendo e exibindo o produto mais caro
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        // Obtendo e exibindo o produto mais barato
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        // Obtendo e exibindo o produto com maior quantidade de valor total no estoque
        System.out.println("Produto com maior quantidade de valor total no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
