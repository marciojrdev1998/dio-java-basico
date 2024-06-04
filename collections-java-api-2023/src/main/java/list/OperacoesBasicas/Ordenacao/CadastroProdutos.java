package main.java.list.OperacoesBasicas.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    // Atributos
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Método para adicionar um produto
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    // Método para exibir produtos ordenados por nome
    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    // Classe interna para comparar produtos por preço
    static class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

    // Método para exibir produtos ordenados por preço
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    // Classe Produto (pode ser movida para um arquivo separado)
    public static class Produto implements Comparable<Produto> {
        private long codigo;
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(long codigo, String nome, double preco, int quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        @Override
        public int compareTo(Produto p) {
            return nome.compareToIgnoreCase(p.getNome());
        }

        public long getCodigo() {
            return codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Produto produto = (Produto) o;
            return codigo == produto.codigo;
        }

        @Override
        public int hashCode() {
            return Objects.hash(codigo);
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "codigo=" + codigo +
                    ", nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", quantidade=" + quantidade +
                    '}';
        }
    }

    // Método principal para teste
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 20.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 15.0, 7);

        System.out.println("Produtos ordenados por nome:");
        for (Produto p : cadastro.exibirProdutosPorNome()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto p : cadastro.exibirProdutosPorPreco()) {
            System.out.println(p);
        }
    }
}




