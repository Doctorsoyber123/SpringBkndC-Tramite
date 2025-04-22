package c_tramite.tramite.Mapper;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;
import c_tramite.tramite.Model.Expediente;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Component
public class ExpedienteDetailMapper {

    public ExpedienteDetailDTO mapToDto(Expediente entity) {
        if (entity == null) {
            return null;
        }

        ExpedienteDetailDTO dto = new ExpedienteDetailDTO();

        dto.setAnoEje(entity.getAnoEje());
        dto.setNExpediente(entity.getNExpediente());
        dto.setNombreSolicitante(entity.getSolicitante() != null ? entity.getSolicitante().getNombre() : null);
        dto.setTipoMovIe(entity.getTipoMovIe() != null ? String.valueOf(entity.getTipoMovIe()) : null);
        dto.setNombreTipoDoc(entity.getTipoDocumento() != null ? entity.getTipoDocumento().getNomTipodoc() : null);
        dto.setCodTipodoc(entity.getCodTipodoc());
        dto.setSiglasDoc(entity.getSiglasDoc());
        dto.setFechaDoc(entity.getFechaDoc());
        dto.setFolios(entity.getFolios());
        dto.setAsunto(entity.getAsunto());
        dto.setNRegistro(entity.getNRegistro());
        dto.setTipoReg(entity.getTipoReg() != null ? String.valueOf(entity.getTipoReg()) : null);
        dto.setFechaRegistro(entity.getFechaRegistro());
        dto.setIdAreaIni(entity.getIdareaini());
        dto.setFechaEnvio(entity.getFechaEnvio());
        dto.setIdAreaFin(entity.getIdareafin());
        dto.setIdEstado(entity.getIdestado());
        dto.setUserReg(entity.getUserReg());
        dto.setParaSu(entity.getParasu());

        return dto;
    }

    public ExpedienteDetailDTO mapToDto(Object[] row) {
        if (row == null || row.length < 19) return null;

        ExpedienteDetailDTO dto = new ExpedienteDetailDTO();

        dto.setAnoEje((String) row[0]);
        dto.setNExpediente((BigDecimal) row[1]);
        dto.setNombreSolicitante((String) row[2]);
        dto.setTipoMovIe(row[3] != null ? String.valueOf(row[3]) : null);
        dto.setNombreTipoDoc((String) row[4]);
        dto.setCodTipodoc((String) row[5]);
        dto.setSiglasDoc((String) row[6]);
        dto.setFechaDoc(row[7] != null ? ((Timestamp) row[7]).toLocalDateTime() : null);
        dto.setFolios((Integer) row[8]);
        dto.setAsunto((String) row[9]);
        dto.setNRegistro((Integer) row[10]);
        dto.setTipoReg(row[11] != null ? String.valueOf(row[11]) : null);
        dto.setFechaRegistro(row[12] != null ? ((Timestamp) row[12]).toLocalDateTime() : null);
        dto.setIdAreaIni((String) row[13]);
        dto.setFechaEnvio(row[14] != null ? ((Timestamp) row[14]).toLocalDateTime() : null);
        dto.setIdAreaFin((String) row[15]);
        dto.setIdEstado((String) row[16]);
        dto.setUserReg((String) row[17]);
        dto.setParaSu((String) row[18]);

        return dto;
    }
}
