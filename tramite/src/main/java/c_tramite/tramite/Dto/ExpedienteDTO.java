package c_tramite.tramite.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpedienteDTO {
    private String ano_eje;
    private BigDecimal n_expediente;
    private String nom_tipodoc;
    private String siglas_doc;
    private Integer folios;
    private String asunto;
    private LocalDateTime fecha_doc;
    private String idareafin;
    private String dniruc;
}
