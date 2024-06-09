package biblioteca;

public class Aluno extends Usuario {
    public Aluno(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 3; // Alunos podem pegar até 3 livros emprestados
    }
}
