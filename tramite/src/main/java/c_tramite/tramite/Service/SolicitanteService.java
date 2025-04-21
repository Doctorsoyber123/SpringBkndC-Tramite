package c_tramite.tramite.Service;

import c_tramite.tramite.Model.Solicitante;
import c_tramite.tramite.Repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public List<Solicitante> getAllSolicitantes() {
        return solicitanteRepository.findAll();
    }

    public Optional<Solicitante> getSolicitanteById(BigDecimal id) {
        return solicitanteRepository.findById(id);
    }

    public Optional<Solicitante> getSolicitanteByDniruc(String dniruc) {
        return solicitanteRepository.findByDniruc(dniruc);
    }

    public Solicitante saveSolicitante(Solicitante solicitante) {
        return solicitanteRepository.save(solicitante);
    }

    public void deleteSolicitante(BigDecimal id) {
        solicitanteRepository.deleteById(id);
    }
}
