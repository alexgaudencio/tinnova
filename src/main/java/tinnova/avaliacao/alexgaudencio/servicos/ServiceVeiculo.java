package tinnova.avaliacao.alexgaudencio.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tinnova.avaliacao.alexgaudencio.dtos.in.VeiculoDto;
import tinnova.avaliacao.alexgaudencio.entidades.Veiculo;
import tinnova.avaliacao.alexgaudencio.repositorio.IRepositoryVeiculo;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ServiceVeiculo implements IServiceVeiculo {

    @Autowired
    IRepositoryVeiculo repositoryVeiculo;

    public List<VeiculoDto> findVeidulos() {
        List<Veiculo> veiculos = repositoryVeiculo.findAll();
        List<VeiculoDto> listaVeiculos = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            listaVeiculos.add(new VeiculoDto(veiculo));
        }
        return listaVeiculos;
    }

    public String createVeiculos(VeiculoDto veiculoDto) {
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.setMarca(veiculoDto.getMarca());
        novoVeiculo.setAno(veiculoDto.getAno());
        novoVeiculo.setCreated(LocalDateTime.now());
        novoVeiculo.setUpdated(LocalDateTime.now());
        novoVeiculo.setDescricao(veiculoDto.getDescricao());
        novoVeiculo.setVeiculo(veiculoDto.getVeiculo());
        novoVeiculo.setId(veiculoDto.getId());
        novoVeiculo.setVendido(veiculoDto.isVendido());

        repositoryVeiculo.save(novoVeiculo);
        return "Veiculo criado com sucesso";
    }

    public VeiculoDto findByIdVeiculo(long id) {
        VeiculoDto veiculoDto;
        Optional<Veiculo> veiculo = repositoryVeiculo.findById(id);
        veiculoDto = veiculo.map(VeiculoDto::new).orElseGet(VeiculoDto::new);

        return veiculoDto;
    }

    public List<VeiculoDto> findVeiculo(String parametro) {
        List<Veiculo> veiculos = repositoryVeiculo.findByVeiculo(parametro);
        List<VeiculoDto> listaVeiculos = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            listaVeiculos.add(new VeiculoDto(veiculo));
        }
        return listaVeiculos;
    }

    public String updateVeiculo(long id, VeiculoDto veiculoDto) {
        Optional<Veiculo> veiculo = repositoryVeiculo.findById(id);
        veiculo.ifPresent(value -> {
            value.setVendido(veiculoDto.isVendido());
            value.setVeiculo(veiculoDto.getVeiculo());
            value.setDescricao(veiculoDto.getDescricao());
            value.setAno(veiculoDto.getAno());
            value.setMarca(veiculoDto.getMarca());
            value.setUpdated(LocalDateTime.now());
            repositoryVeiculo.save(value);
        });

        return "Veiculo alterado com sucesso";
    }

    public String updateVeiculoDescricao(long id, String descricao) {
        Optional<Veiculo> veiculo = repositoryVeiculo.findById(id);
        veiculo.ifPresent(value -> {
            value.setDescricao(descricao);
            value.setUpdated(LocalDateTime.now());
            repositoryVeiculo.save(value);
        });

        return "Descrição alterada com sucesso";
    }

    public String deleteVeiculo(long id) {
        VeiculoDto veiculoDto;
        Optional<Veiculo> veiculo = repositoryVeiculo.findById(id);
        veiculo.ifPresent(value -> repositoryVeiculo.delete(value));

        return "Veiculo deletado com sucesso";
    }

    public String totalVendidos() {
        int retorno = repositoryVeiculo.totalVendidos();

        return "Foram vendidos um total de + " + retorno + " veículo(s).";
    }

    public List<Map<Fabricante, Integer>> totalVendidosFabricante() {
        return repositoryVeiculo.veiculosFabricante();
    }

    public List<Veiculo> veiculosRecentes() {
        return repositoryVeiculo.veiculosRecentes();
    }

}
