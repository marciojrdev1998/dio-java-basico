package edu.marcio.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        // Corrigido: ponto e vírgula após chamada do método
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Corrigido: nomes dos parâmetros sem espaços e consistentes
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
