public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no iPhone.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " no iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do iPhone.");
    }
}

