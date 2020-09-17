package tinnova.avaliacao.alexgaudencio.controladores;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tinnova.avaliacao.alexgaudencio.dtos.out.RetornoBase;
import tinnova.avaliacao.alexgaudencio.eleitores.Eleitores;

@RestController
@RequestMapping(value = "/eleitores")
@Api(value = "1 - Votos em relação ao total de eleitores")
public class ControllerEleitores {

    @ApiOperation(value = "Retorna a porcentagem de eleitores válidos")
    @PostMapping(value = "/validos")
    public RetornoBase EleitoresValidos() {
        Eleitores eleitor = new Eleitores();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString("O percentual de eleitores validos é: " + eleitor.percentualValidos() + " %");
        return retorno;
    }

    @ApiOperation(value = "Retorna a porcentagem de eleitores brancos")
    @PostMapping(value = "/brancos")
    public RetornoBase EleitoresBrancos() {
        Eleitores eleitor = new Eleitores();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString("O percentual de eleitores brancos é: " + eleitor.percentualBrancos() + " %");
        return retorno;
    }

    @ApiOperation(value = "Retorna a porcentagem de eleitores nulos")
    @PostMapping(value = "/nulos")
    public RetornoBase EleitoresNulos() {
        Eleitores eleitor = new Eleitores();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString("O percentual de eleitores nulos é: " + eleitor.percentualNulos() + " %");
        return retorno;
    }
}
