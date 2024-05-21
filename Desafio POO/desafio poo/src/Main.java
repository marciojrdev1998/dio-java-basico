public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando funções do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Let It Be");
        
        // Testando funções do aparelho telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando funções do navegador na internet
        meuIphone.exibirPagina("https://www.instagram.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

