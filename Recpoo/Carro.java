public class Carro extends Veiculo {
    private String cor;
    
    public Carro(String marca, String modelo, String cor, int ano, double preco){
        super(marca,modelo,ano,preco);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Carro:" + getMarca() + "" + getModelo() + ", Ano" + getAno() + ", Preço: " + getPreco() + ", Cor: " + cor);
    }

}