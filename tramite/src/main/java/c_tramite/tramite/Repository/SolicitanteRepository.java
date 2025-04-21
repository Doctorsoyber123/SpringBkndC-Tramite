package c_tramite.tramite.Repository;

import c_tramite.tramite.Model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, BigDecimal> {
    
    Optional<Solicitante> findByDniruc(String dniruc);
}
