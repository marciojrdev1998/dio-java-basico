import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá" + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta" + numero + "e seu saldo R$" + saldo + "já está disponivel para saque.");
        
        
    }
}
