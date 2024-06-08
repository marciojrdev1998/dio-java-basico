package main.java.banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento / 100;
        depositar(rendimento);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero='" + getNumero() + '\'' +
                ", saldo=" + getSaldo() +
                ", taxaRendimento=" + taxaRendimento +
                '}';
    }
}
