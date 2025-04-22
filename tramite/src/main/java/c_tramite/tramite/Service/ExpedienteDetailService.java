package c_tramite.tramite.Service;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;
import c_tramite.tramite.Mapper.ExpedienteDetailMapper;
import c_tramite.tramite.Repository.ExpedienteDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExpedienteDetailService {

    private final ExpedienteDetailRepository repository;
    private final ExpedienteDetailMapper mapper;

    @Autowired
    public ExpedienteDetailService(ExpedienteDetailRepository repository, ExpedienteDetailMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ExpedienteDetailDTO obtenerDetalle(String anoEje, BigDecimal nExpediente, String dni) {
        Object result = repository.getDetalle(anoEje, nExpediente, dni);

        if (result instanceof Object[] row) {
            return mapper.mapToDto(row); // Usamos el mapper para Object[]
        }

        return null;
    }
}
