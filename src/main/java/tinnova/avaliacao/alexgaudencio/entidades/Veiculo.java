package tinnova.avaliacao.alexgaudencio.entidades;

import lombok.Getter;
import lombok.Setter;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(columnDefinition = "text")
    @Setter
    @Getter
    private String descricao;

    @Setter
    @Getter
    private boolean vendido;

    @Setter
    @Getter
    private LocalDateTime created;

    @Setter
    @Getter
    private LocalDateTime updated;

}
