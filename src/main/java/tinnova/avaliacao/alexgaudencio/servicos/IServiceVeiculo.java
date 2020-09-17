package tinnova.avaliacao.alexgaudencio.servicos;

import tinnova.avaliacao.alexgaudencio.dtos.in.VeiculoDto;
import tinnova.avaliacao.alexgaudencio.entidades.Veiculo;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import java.util.List;
import java.util.Map;

public interface IServiceVeiculo {
    List<VeiculoDto> findVeidulos();

    String createVeiculos(VeiculoDto veiculoDto);

    VeiculoDto findByIdVeiculo(long id);

    List<VeiculoDto> findVeiculo(String parametro);

    String updateVeiculo(long id, VeiculoDto veiculoDto);

    String updateVeiculoDescricao(long id, String descricao);

    String deleteVeiculo(long id);

    String totalVendidos();

    List<Map<Fabricante, Integer>> totalVendidosFabricante();

    List<Veiculo> veiculosRecentes();

}
