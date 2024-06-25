import java.util.List;

public interface veiculooperações {
    void adicionarVeiculo(Veiculo veiculo);
    void removerVeiculo(Veiculo veiculo);
    void listarVeiculos();
    List<Veiculo> buscarVeiculoPorMarca(String marca);
}
