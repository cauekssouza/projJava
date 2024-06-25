import java.util.List;

public class Main2 {
    public static void main(String[] args) {
         Concessionaria concessionaria = new Concessionaria();

        Veiculo carro = new Carro("Toyota", "Corolla", "Preto", 90000, 2020);
        Veiculo moto = new Moto("Honda", "CB500", 2019, 30000, 500);

        concessionaria.adicionarVeiculo(carro);
        concessionaria.adicionarVeiculo(moto);

        System.out.println("\nListando todos os veículos:");
        concessionaria.listarVeiculos();

        System.out.println("\nBuscando veículos da marca 'Toyota':");
        List<Veiculo> toyotaVeiculos = concessionaria.buscarVeiculoPorMarca("Toyota");
        for (Veiculo veiculo : toyotaVeiculos) {
            veiculo.exibirDetalhes();
        }
    }
}

