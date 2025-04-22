package c_tramite.tramite.Dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpedienteDetailDTO {

    @JsonProperty("ano_eje")
    private String anoEje;

    @JsonProperty("n_expediente")
    private BigDecimal nExpediente;

    @JsonProperty("nombre_solicitante")
    private String nombreSolicitante;

    @JsonProperty("tipo_movimiento")
    private String tipoMovIe;

    @JsonProperty("nombre_tipo_documento")
    private String nombreTipoDoc;

    @JsonProperty("codigo_tipo_documento")
    private String codTipodoc;

    @JsonProperty("siglas_documento")
    private String siglasDoc;

    @JsonProperty("fecha_documento")
    private LocalDateTime fechaDoc;

    @JsonProperty("folios")
    private Integer folios;

    @JsonProperty("asunto")
    private String asunto;

    @JsonProperty("n_registro")
    private Integer nRegistro;

    @JsonProperty("tipo_registro")
    private String tipoReg;

    @JsonProperty("fecha_registro")
    private LocalDateTime fechaRegistro;

    @JsonProperty("area_inicio")
    private String idAreaIni;

    @JsonProperty("fecha_envio")
    private LocalDateTime fechaEnvio;

    @JsonProperty("area_fin")
    private String idAreaFin;

    @JsonProperty("estado")
    private String idEstado;

    @JsonProperty("usuario_registro")
    private String userReg;

    @JsonProperty("parasu")
    private String paraSu;
}
