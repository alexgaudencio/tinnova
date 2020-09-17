package tinnova.avaliacao.alexgaudencio.controladores;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tinnova.avaliacao.alexgaudencio.bubble.BubbleSort;
import tinnova.avaliacao.alexgaudencio.dtos.out.RetornoBase;

@RestController
@RequestMapping(value = "/bubble")
@Api(value = "2 - Algoritmo de ordenação Bubble Sort")
public class ControllerBubble {

    @ApiOperation(value = "Algoritmo de ordenação Bubble Sort")
    @PostMapping(value = "/")
    public RetornoBase OrdenarEntrada(@RequestParam int [] vetorEntrada) {
        BubbleSort bubbleSort = new BubbleSort();
        RetornoBase retorno = new RetornoBase();
        retorno.setRetornoString(bubbleSort.imprimirResultado(bubbleSort.bubbleSort(vetorEntrada)));
        return retorno;
    }
}
