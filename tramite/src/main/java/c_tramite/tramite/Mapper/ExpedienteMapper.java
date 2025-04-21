package c_tramite.tramite.Mapper;

import c_tramite.tramite.Dto.ExpedienteDTO;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ExpedienteMapper {

    public static ExpedienteDTO mapToDto(Object[] row) {
        return new ExpedienteDTO(
            (String) row[0],
            (BigDecimal) row[1],
            (String) row[2],
            (String) row[3],
            (Integer) row[4],
            (String) row[5],
            row[6] != null ? ((Timestamp) row[6]).toLocalDateTime() : null,
            (String) row[7],
            (String) row[8]
        );
    }
}
