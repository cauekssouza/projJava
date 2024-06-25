public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas){
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Moto: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Preço: " + getPreco() + ", Cilindradas: " + cilindradas);
    }
}
