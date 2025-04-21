package c_tramite.tramite.Dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "anoEje",
    "nexpediente",
    "nombreSolicitante",
    "tipoMovIe",
    "nomTipoDoc",
    "siglasDoc",
    "fechaDoc",
    "folios",
    "asunto",
    "nregistro",
    "tipoReg",
    "fechaRegistro",
    "idAreaIni",
    "fechaEnvio",
    "idAreaFin",
    "idEstado",
    "userReg",
    "parasu"
})
public class ExpedienteDetailDTO {
    private String anoEje;
    private BigDecimal nexpediente;
    private String nombreSolicitante;
    private String tipoMovIe;
    private String nomTipoDoc;
    private String siglasDoc;
    private LocalDateTime fechaDoc;
    private Integer folios;
    private String asunto;
    private Integer nregistro;
    private String tipoReg;
    private LocalDateTime fechaRegistro;
    private String idAreaIni;
    private LocalDateTime fechaEnvio;
    private String idAreaFin;
    private String idEstado;
    private String userReg;
    private String parasu;
}
