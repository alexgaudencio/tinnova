package tinnova.avaliacao.alexgaudencio.controladores;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tinnova.avaliacao.alexgaudencio.dtos.out.RetornoBase;
import tinnova.avaliacao.alexgaudencio.fatorial.Fatorial;
import tinnova.avaliacao.alexgaudencio.multiplos.Multiplos;

@RestController
@RequestMapping(value = "/multiplos")
@Api(value = "4 - Soma dos multiplos de 3 ou 5")
public class ControllerMultiplos {
    @ApiOperation(value = "Soma dos multiplos de 3 ou 5")
    @PostMapping(value = "/")
    public RetornoBase retornaMultiplos(@RequestParam int numero) {
        Multiplos multiplos = new Multiplos();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString("A soma dos multiplos de 3 ou 5 é: " + multiplos.multiplosTresOuCinco(numero));
        return retorno;
    }
}
