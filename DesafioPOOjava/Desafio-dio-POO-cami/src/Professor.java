package biblioteca;

public class Professor extends Usuario {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5; // Professores podem pegar até 5 livros emprestados
    }
}
