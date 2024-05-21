public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no Telefone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Telefone.");
    }
}