package edu.marcio.primeirasemana;
public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 5;

        // Removido o ponto e vírgula após a condição
        if (mediaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}
