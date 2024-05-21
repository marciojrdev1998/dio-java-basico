public class AppleMusic implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música no AppleMusic.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no AppleMusic.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + " no AppleMusic.");
    }
}

