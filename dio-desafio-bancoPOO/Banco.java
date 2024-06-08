package main.java.banco;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345", 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", 2);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(2000);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaCorrente.sacar(1100);
        contaPoupanca.aplicarRendimento();

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        contaCorrente.transferir(contaPoupanca, 200);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
