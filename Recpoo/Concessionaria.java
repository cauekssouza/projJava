
import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements veiculooperações {
    private final List<Veiculo> veiculos;

    public Concessionaria(){
        this.veiculos = new ArrayList<>();
    }
    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
        System.out.println("Veículo removido: " + veiculo.getMarca() + " " + veiculo.getModelo());
    }

    @Override
    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
        }
    }

    @Override
    public List<Veiculo> buscarVeiculoPorMarca(String marca) {
        List<Veiculo> resultado = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(veiculo);
            }
        }
        return resultado;
    }
}
