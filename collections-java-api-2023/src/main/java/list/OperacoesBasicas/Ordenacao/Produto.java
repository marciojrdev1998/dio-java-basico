package main.java.list.OperacoesBasicas.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    // Atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Implementação do método compareTo para comparação baseada no nome
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // Getters
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

    // Sobrescrita do método equals para comparar objetos pelo código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    // Sobrescrita do método hashCode para gerar um hash baseado no código
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    // Sobrescrita do método toString para representar o objeto como uma string
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
