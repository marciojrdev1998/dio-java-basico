public class Comentarios {

    public static void main(String[] args) {
        // Exemplos de uso do método somaMultiplica
        System.out.println(somaMultiplica(2, 3, "M")); // Deve retornar 6 (multiplicação)
        System.out.println(somaMultiplica(2, 3, "S")); // Deve retornar 5 (soma)
    }

    public static int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado

        // Usando equals para comparação de Strings
        if (m.equals("M")) { // "M" para multiplicação
            r = n * x; // Multiplicação
        } else {
            // Se não for "M", então soma
            r = n + x; // Corrigido o erro de sintaxe (adicionada a vírgula)
        }

        return r; // Retorna o resultado
    }
}


    
