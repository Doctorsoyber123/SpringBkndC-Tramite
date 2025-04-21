package c_tramite.tramite.Service;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;
import c_tramite.tramite.Mapper.ExpedienteDetailMapper;
import c_tramite.tramite.Repository.ExpedienteDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExpedienteDetailService {

    @Autowired
    private ExpedienteDetailRepository repository;

    public ExpedienteDetailDTO obtenerDetalle(String anoEje, BigDecimal nExpediente) {
        Object result = repository.getDetalle(anoEje, nExpediente);
    
        if (result instanceof Object[]) {
            return ExpedienteDetailMapper.mapToDto((Object[]) result);
        } else {
            return null; // o lanza excepción si quieres asegurar consistencia
        }
    }
   
}
