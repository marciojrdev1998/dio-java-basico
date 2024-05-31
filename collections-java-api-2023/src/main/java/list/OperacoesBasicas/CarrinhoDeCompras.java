package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

class Compras {
    private String descricao;

    public Compras(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

public class CarrinhoDeCompras {
    private List<Compras> comprasList;

    public CarrinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarCompras(String descricao) {
        comprasList.add(new Compras(descricao));
    }

    public void removerCompras(String descricao) {
        List<Compras> comprasParaRemover = new ArrayList<>();
        for (Compras c : comprasList) {
            if (c.getDescricao().equalsIgnoreCase(descricao)) {
                comprasParaRemover.add(c);
            }
        }
        comprasList.removeAll(comprasParaRemover);
    }

    public int obterNumeroTotalCompras() {
        return comprasList.size();
    }

    public void obterDescricaoCompras() {
        for (Compras c : comprasList) {
            System.out.println(c.getDescricao());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalCompras());

        carrinhoDeCompras.adicionarCompras("Compra 1");
        carrinhoDeCompras.adicionarCompras("Compra 1");
        carrinhoDeCompras.adicionarCompras("Compra 2");
        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalCompras());

        carrinhoDeCompras.removerCompras("Compra 1");
        System.out.println("O número total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalCompras());

        carrinhoDeCompras.obterDescricaoCompras();
    }
}
