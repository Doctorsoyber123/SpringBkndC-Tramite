package c_tramite.tramite.Controller;

import c_tramite.tramite.Dto.SolicitanteDTO;
import c_tramite.tramite.Service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/solicitantes")
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping
    public List<SolicitanteDTO> getAllSolicitantes() {
        return solicitanteService.getAllSolicitantes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitanteDTO> getSolicitanteById(@PathVariable BigDecimal id) {
        return solicitanteService.getSolicitanteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar")
    public ResponseEntity<SolicitanteDTO> getSolicitanteByDniruc(@RequestParam String dniruc) {
        return solicitanteService.getSolicitanteByDniruc(dniruc)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
