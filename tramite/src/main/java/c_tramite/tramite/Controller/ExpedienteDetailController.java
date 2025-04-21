package c_tramite.tramite.Controller;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;
import c_tramite.tramite.Service.ExpedienteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/expedientes/detalle")
public class ExpedienteDetailController {

    @Autowired
    private ExpedienteDetailService service;

    @GetMapping("/{anoEje}/{nExpediente}")
    public ResponseEntity<?> getDetalle(@PathVariable String anoEje, @PathVariable String nExpediente) {
        try {
            BigDecimal numExp = new BigDecimal(nExpediente);
            ExpedienteDetailDTO detalle = service.obtenerDetalle(anoEje, numExp);

            if (detalle == null) return ResponseEntity.notFound().build();

            return ResponseEntity.ok(detalle);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Número de expediente inválido");
        }
    }
}

