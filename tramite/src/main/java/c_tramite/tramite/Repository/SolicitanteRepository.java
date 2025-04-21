package c_tramite.tramite.Repository;

import c_tramite.tramite.Model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, BigDecimal> {

    // Buscar por DNI o RUC
    Optional<Solicitante> findByDniruc(String dniruc);

    // Buscar por usuario web
    Optional<Solicitante> findByUserWeb(String userWeb);
}
