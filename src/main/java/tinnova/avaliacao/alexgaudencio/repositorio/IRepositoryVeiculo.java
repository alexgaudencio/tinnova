package tinnova.avaliacao.alexgaudencio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tinnova.avaliacao.alexgaudencio.entidades.Veiculo;
import tinnova.avaliacao.alexgaudencio.utils.Fabricante;

import java.util.List;
import java.util.Map;

@Repository
public interface IRepositoryVeiculo extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByVeiculo(String Veiculo);
    List<Veiculo> findAll();

    @Query(value = "select count(1) as total from veiculo v where v.vendido", nativeQuery = true)
    int totalVendidos();

    @Query(value = "select marca, count(1) as total from veiculo v group by v.marca", nativeQuery = true)
    List<Map<Fabricante, Integer>> veiculosFabricante();

    @Query(value = "select * from veiculo v where v.created > (now() - interval '7 days')", nativeQuery = true)
    List<Veiculo> veiculosRecentes();
}
