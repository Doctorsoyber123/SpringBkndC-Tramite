package c_tramite.tramite.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitanteDTO {
    private BigDecimal nSolicitante;
    private String dniruc;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String observacion;
}
