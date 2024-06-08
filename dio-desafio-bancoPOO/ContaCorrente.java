package main.java.banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limiteChequeEspecial >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente, incluindo o limite do cheque especial.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero='" + getNumero() + '\'' +
                ", saldo=" + getSaldo() +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }
}
