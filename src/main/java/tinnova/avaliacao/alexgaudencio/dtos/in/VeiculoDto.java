package tinnova.avaliacao.alexgaudencio.dtos.in;

import lombok.Getter;
import lombok.Setter;
import tinnova.avaliacao.alexgaudencio.entidades.Veiculo;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import java.time.LocalDateTime;

public class VeiculoDto {

    public VeiculoDto() {

    }

    public VeiculoDto(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.veiculo = veiculo.getVeiculo();
        this.marca = veiculo.getMarca();
        this.ano = veiculo.getAno();
        this.descricao = veiculo.getDescricao();
        this.vendido = veiculo.isVendido();
    }

    @Setter
    @Getter
    private long id;

    @Setter
    @Getter
    private String veiculo;

    @Setter
    @Getter
    private Fabricante marca;

    @Setter
    @Getter
    private int ano;

    @Setter
    @Getter
    private String descricao;

    @Setter
    @Getter
    private boolean vendido;
}
