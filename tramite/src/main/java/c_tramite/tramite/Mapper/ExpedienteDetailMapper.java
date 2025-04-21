package c_tramite.tramite.Mapper;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ExpedienteDetailMapper {

    public static ExpedienteDetailDTO mapToDto(Object[] row) {
        return new ExpedienteDetailDTO(
            row[0] != null ? row[0].toString() : null,  // ano_eje
            row[1] != null ? (BigDecimal) row[1] : null,  // n_expediente
            row[2] != null ? row[2].toString() : null,  // nombre solicitante (s.nombre)
            row[3] != null ? row[3].toString() : null,  // tipo_mov_ie
            row[4] != null ? row[4].toString() : null,  // nom_tipodoc
            row[5] != null ? row[5].toString() : null,  // siglas_doc
            row[6] != null ? ((Timestamp) row[6]).toLocalDateTime() : null,  // fecha_doc
            row[7] != null ? (Integer) row[7] : null,  // folios
            row[8] != null ? row[8].toString() : null,  // asunto
            row[9] != null ? (Integer) row[9] : null,  // n_registro
            row[10] != null ? row[10].toString() : null,  // tipo_reg
            row[11] != null ? ((Timestamp) row[11]).toLocalDateTime() : null,  // fecha_registro
            row[12] != null ? row[12].toString() : null,  // idAreaIni
            row[13] != null ? ((Timestamp) row[13]).toLocalDateTime() : null,  // fecha_envio
            row[14] != null ? row[14].toString() : null,  // idAreaFin
            row[15] != null ? row[15].toString() : null,  // idEstado
            row[16] != null ? row[16].toString() : null,  // userReg
            row[17] != null ? row[17].toString() : null   // parasu
        );
    }
}
