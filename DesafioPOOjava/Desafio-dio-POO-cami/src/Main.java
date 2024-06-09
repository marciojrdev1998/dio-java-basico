package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro(new Livro("Java: Como Programar", "Deitel", "123456"));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert Martin", "654321"));

        // Cadastrando usuários
        Usuario aluno = new Aluno("João", "A123");
        Usuario professor = new Professor("Maria", "P456");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        // Realizando empréstimos
        biblioteca.realizarEmprestimo("123456", "A123");
        biblioteca.realizarEmprestimo("654321", "P456");

        // Exibindo livros disponíveis
        System.out.println("Livros disponíveis:");
        biblioteca.exibirLivrosDisponiveis();

        // Exibindo empréstimos
        System.out.println("Empréstimos realizados:");
        biblioteca.exibirEmprestimos();
    }
}
