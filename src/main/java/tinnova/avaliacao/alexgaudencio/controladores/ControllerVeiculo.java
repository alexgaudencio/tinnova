package tinnova.avaliacao.alexgaudencio.controladores;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tinnova.avaliacao.alexgaudencio.dtos.in.VeiculoDto;
import tinnova.avaliacao.alexgaudencio.entidades.Veiculo;
import tinnova.avaliacao.alexgaudencio.servicos.IServiceVeiculo;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/veiculos")
@Api(value = "5 - Cadastro de veículos")
public class ControllerVeiculo {

    @Autowired
    IServiceVeiculo serviceVeiculo;

    @PostMapping("/")
    public String createVeiculos(@RequestBody VeiculoDto veiculoDto) {
        return serviceVeiculo.createVeiculos(veiculoDto);
    }

    @GetMapping("/")
    public List<VeiculoDto> findVeidulos() {
        return serviceVeiculo.findVeidulos();
    }

    @GetMapping("/{id}")
    public VeiculoDto findByIdVeiculo(@PathVariable long id) {
        return serviceVeiculo.findByIdVeiculo(id);
    }

    @GetMapping("/find")
    public List<VeiculoDto> findVeiculo(@RequestBody String parametro) {
        return serviceVeiculo.findVeiculo(parametro);
    }

    @PutMapping("/{id}")
    public String updateVeiculo(@PathVariable long id, @RequestBody VeiculoDto veiculoDto) {
        return serviceVeiculo.updateVeiculo(id, veiculoDto);
    }

    @PatchMapping("/{id}")
    public String updateVeiculoDescricao(@PathVariable long id, @RequestParam String descricao) {
        return serviceVeiculo.updateVeiculoDescricao(id, descricao);
    }

    @DeleteMapping("/{id}")
    public String deleteVeiculo(@PathVariable long id) {
        return serviceVeiculo.deleteVeiculo(id);
    }

    @GetMapping("/vendidos")
    public String totalVendido() {
        return serviceVeiculo.totalVendidos();
    }

    @GetMapping("/fabricantes")
    public List<Map<Fabricante, Integer>> totalFabricantes() {
        return serviceVeiculo.totalVendidosFabricante();
    }

    @GetMapping("/recentes")
    public List<Veiculo> totalRecentes() {
        return serviceVeiculo.veiculosRecentes();
    }
}
