package c_tramite.tramite.Controller;

import c_tramite.tramite.Model.Solicitante;
import c_tramite.tramite.Service.SolicitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/solicitantes")
public class SolicitanteController {

    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping
    public List<Solicitante> getAllSolicitantes() {
        return solicitanteService.getAllSolicitantes();
    }

    @GetMapping("/{id}")
    public Optional<Solicitante> getSolicitanteById(@PathVariable BigDecimal id) {
        return solicitanteService.getSolicitanteById(id);
    }

    @GetMapping("/buscar")
    public Optional<Solicitante> getSolicitanteByDniruc(@RequestParam String dniruc) {
        return solicitanteService.getSolicitanteByDniruc(dniruc);
    }
}
