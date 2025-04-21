package c_tramite.tramite.Service;

import c_tramite.tramite.Dto.SolicitanteDTO;
import c_tramite.tramite.Model.Solicitante;
import c_tramite.tramite.Repository.SolicitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public List<SolicitanteDTO> getAllSolicitantes() {
        return solicitanteRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<SolicitanteDTO> getSolicitanteById(BigDecimal id) {
        return solicitanteRepository.findById(id).map(this::convertToDTO);
    }

    public Optional<SolicitanteDTO> getSolicitanteByDniruc(String dniruc) {
        return solicitanteRepository.findByDniruc(dniruc).map(this::convertToDTO);
    }

    private SolicitanteDTO convertToDTO(Solicitante s) {
        return new SolicitanteDTO(
                s.getNSolicitante(),
                s.getDniruc(),
                s.getNombre(),
                s.getDireccion(),
                s.getTelefono(),
                s.getEmail(),
                s.getObservacion()
        );
    }
}
