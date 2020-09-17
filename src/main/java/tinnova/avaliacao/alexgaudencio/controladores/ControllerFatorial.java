package tinnova.avaliacao.alexgaudencio.controladores;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tinnova.avaliacao.alexgaudencio.dtos.out.RetornoBase;
import tinnova.avaliacao.alexgaudencio.fatorial.Fatorial;

@RestController
@RequestMapping(value = "/fatorial")
@Api(value = "3 - Fatorial")
public class ControllerFatorial {

    @ApiOperation(value = "Retorna o Fatorial")
    @PostMapping(value = "/")
    public RetornoBase retornaFatorial(@RequestParam int numero) {
        Fatorial fatorial = new Fatorial();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString(numero + "! = " + fatorial.calcularFatorial(numero));
        return retorno;
    }
}
