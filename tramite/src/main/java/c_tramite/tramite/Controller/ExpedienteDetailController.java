package c_tramite.tramite.Controller;

import c_tramite.tramite.Dto.ExpedienteDetailDTO;
import c_tramite.tramite.Service.ExpedienteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/api/expedientes/detalle")
public class ExpedienteDetailController {

    private final ExpedienteDetailService service;

    @Autowired
    public ExpedienteDetailController(ExpedienteDetailService service) {
        this.service = service;
    }

    @GetMapping("/{anoEje}/{nExpediente}/{dni}")
    public ResponseEntity<?> getDetalle(
            @PathVariable String anoEje,
            @PathVariable String nExpediente,
            @PathVariable String dni) {
        try {
            // Verifica los valores que llegan en los parámetros
            System.out.println("anoEje: " + anoEje);  // Espera: "2022"
            System.out.println("nExpediente: " + nExpediente);  // Espera: "4460"
            System.out.println("dni: " + dni);  // Espera: "32977956"

            // Convertir nExpediente a BigDecimal
            BigDecimal numExp = new BigDecimal(nExpediente);
            // Llamar al servicio para obtener el detalle
            ExpedienteDetailDTO detalle = service.obtenerDetalle(anoEje, numExp, dni);

            if (detalle == null) {
                return ResponseEntity.status(404).body(Map.of(
                        "status", "error",
                        "message", "No se encontró el detalle para el expediente"
                ));
            }

            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "data", detalle
            ));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(Map.of(
                    "status", "error",
                    "message", "Número de expediente inválido"
            ));
        }
    }
}
