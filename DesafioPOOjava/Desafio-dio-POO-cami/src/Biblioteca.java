package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, String matricula) {
        Livro livro = encontrarLivroPorIsbn(isbn);
        Usuario usuario = encontrarUsuarioPorMatricula(matricula);

        if (livro != null && usuario != null && livro.isDisponivel() && contarEmprestimos(usuario) < usuario.getLimiteEmprestimos()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(emprestimo);
            livro.setDisponivel(false);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }

    private Livro encontrarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario encontrarUsuarioPorMatricula(String matricula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getMatricula().equals(matricula)) {
                return usuario;
            }
        }
        return null;
    }

    private int contarEmprestimos(Usuario usuario) {
        int count = 0;
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().equals(usuario) && emprestimo.getDataDevolucao() == null) {
                count++;
            }
        }
        return count;
    }

    public void exibirLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}
