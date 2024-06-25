// Classe principal para testar
public class Main {
   
    public static void main(String[] args) {
        // Criação da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criação de alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando livros disponíveis
        System.out.println("Livros disponíveis na biblioteca:");
        biblioteca.listarLivrosDisponiveis();

        // Buscando um livro pelo título
        System.out.println("\nBuscando o livro '1984':");
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("1984");
        if (livroEncontrado != null) {
            System.out.println("Livro encontrado: " + livroEncontrado.getTitulo() + " de " + livroEncontrado.getAutor());
        } else {
            System.out.println("Livro não encontrado.");
        }

        // Emprestando um livro
        System.out.println("\nEmprestando o livro '1984':");
        biblioteca.emprestarLivro(livroEncontrado);

        // Tentando emprestar novamente o mesmo livro
        System.out.println("\nTentando emprestar o livro '1984' novamente:");
        biblioteca.emprestarLivro(livroEncontrado);

        // Devolvendo o livro
        System.out.println("\nDevolvendo o livro '1984':");
        biblioteca.devolverLivro(livroEncontrado);

        // Listando livros disponíveis novamente
        System.out.println("\nLivros disponíveis na biblioteca após devolução:");
        biblioteca.listarLivrosDisponiveis();
    }
}