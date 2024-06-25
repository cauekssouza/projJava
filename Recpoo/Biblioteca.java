import java.util.ArrayList;
import java.util.List;

public  class Biblioteca{
    private final List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro){
        this.livros.remove(livro);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.getDisponivel()) {
                System.out.println(livro.getTitulo() + " está disponível");
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }


    public void emprestarLivro(Livro livro){
        if(livro.getDisponivel()){
            livro.setDisponivel(false);
            System.out.println("O Livro" + livro.getTitulo() + "foi emprestado");
        } else {
            System.out.println("O Livro" + livro.getTitulo() + "Não está disponível para empréstimo.");
        }
    } 

    public void devolverLivro(Livro livro){
        for (Livro i : livros){
            if(i.getDisponivel()){
                i.setDisponivel(true);
                System.out.println("O Livro" + livro.getTitulo() + "Foi devolvido");
            }
        }
    }
}