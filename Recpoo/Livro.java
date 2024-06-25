public class Livro{
    private String titulo;
    private  String autor;
    private  int anoPublicao;
    private  boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicao){
        extracted().titulo = titulo;
        extracted().autor = autor;
        extracted().anoPublicao = anoPublicao;
        extracted().disponivel = disponivel;
    }


    private Livro extracted() {
        return this;
    }


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        extracted().titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public  void setAutor(String autor){
        extracted().autor = autor;
    }

    public  int getAnoPublicao(){
        return anoPublicao;
    }
    public void setAnoPublicao(int anoPublicao){
        extracted().anoPublicao = anoPublicao;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        extracted().disponivel = disponivel;
    }
}