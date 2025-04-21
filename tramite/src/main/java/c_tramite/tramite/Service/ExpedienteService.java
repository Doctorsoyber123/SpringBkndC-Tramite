package c_tramite.tramite.Service;

import c_tramite.tramite.Dto.ExpedienteDTO;
import c_tramite.tramite.Mapper.ExpedienteMapper;
import c_tramite.tramite.Repository.ExpedienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpedienteService {

    @Autowired
    private ExpedienteRepository expedienteRepository;

    // Método modificado para usar paginación
    public List<ExpedienteDTO> getAllExpedientes(int page) {
        Pageable pageable = PageRequest.of(page, 7); 
        Page<Object[]> expedientesPage = expedienteRepository.findExpedientesRaw(pageable);

        return expedientesPage.getContent().stream()
                .map(ExpedienteMapper::mapToDto)
                .collect(Collectors.toList());
    }

    // Método modificado para usar paginación por DNI
    public List<ExpedienteDTO> getExpedientesByDni(String dni, int page) {
        Pageable pageable = PageRequest.of(page, 7); // 7 elementos por página
        Page<Object[]> expedientesPage = expedienteRepository.findExpedientesRawByDni(dni, pageable);

        return expedientesPage.getContent().stream()
                .map(ExpedienteMapper::mapToDto)
                .collect(Collectors.toList());
    }

}
