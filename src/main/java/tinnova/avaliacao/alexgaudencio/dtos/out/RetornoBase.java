package tinnova.avaliacao.alexgaudencio.dtos.out;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class RetornoBase {
    @JsonProperty(required = true, value = "retorno_tarefa")
    @Setter @Getter private String retornoString;
}
