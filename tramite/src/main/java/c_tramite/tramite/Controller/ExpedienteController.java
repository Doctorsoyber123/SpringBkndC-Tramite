package c_tramite.tramite.Controller;

import c_tramite.tramite.Dto.ExpedienteDTO;
import c_tramite.tramite.Service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/expedientes")
public class ExpedienteController {

    @Autowired
    private ExpedienteService expedienteService;

    // Obtener todos los expedientes con paginación
    @GetMapping
    public ResponseEntity<?> getAllExpedientes(@RequestParam(defaultValue = "0") int page) {
        List<ExpedienteDTO> expedientes = expedienteService.getAllExpedientes(page);

        if (expedientes.isEmpty()) {
            return ResponseEntity.status(404).body(Map.of(
                "status", "error",
                "message", "No se encontraron expedientes"
            ));
        }

        return ResponseEntity.ok(Map.of(
            "status", "success",
            "data", expedientes
        ));
    }

    // Obtener expedientes por DNI con paginación
    @GetMapping("/dni/{dni}")
    public ResponseEntity<?> getExpedientesByDni(@PathVariable String dni, @RequestParam(defaultValue = "0") int page) {
        List<ExpedienteDTO> expedientes = expedienteService.getExpedientesByDni(dni, page);

        if (expedientes.isEmpty()) {
            return ResponseEntity.status(404).body(Map.of(
                "status", "error",
                "message", "No se encontraron expedientes para este DNI"
            ));
        }

        return ResponseEntity.ok(Map.of(
            "status", "success",
            "data", expedientes
        ));
    }
}
