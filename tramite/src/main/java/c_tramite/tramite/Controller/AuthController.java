package c_tramite.tramite.Controller;

import c_tramite.tramite.Model.Solicitante;
import c_tramite.tramite.Repository.SolicitanteRepository;
import c_tramite.tramite.Dto.LoginRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO loginRequest) {

        // Obtener los parámetros del DTO
        String user_web = loginRequest.getUser_web();
        String clave_web = loginRequest.getClave_web();

        // Buscar usuario por user_web
        Optional<Solicitante> optionalSolicitante = solicitanteRepository.findByUserWeb(user_web);

        if (optionalSolicitante.isEmpty()) {
            return ResponseEntity.status(404).body("Usuario no encontrado.");
        }

        Solicitante solicitante = optionalSolicitante.get();

        // Validar contraseña (sin encriptar)
        if (!clave_web.equals(solicitante.getClaveWeb())) {
            return ResponseEntity.status(401).body("Clave incorrecta.");
        }

        // Validar rol (solo 1 y 2)
        System.out.println("Rol del usuario: '" + solicitante.getRolUser() + "'");  // Añadido para depurar
        // Validar rol (solo 1 y 2)
        if (!"1".equals(solicitante.getRolUser().trim()) && !"2".equals(solicitante.getRolUser().trim())) {
            return ResponseEntity.status(403).body("No tienes permisos para acceder.");
        }

                

        // Mensaje personalizado según rol
        String rolUser = solicitante.getRolUser().trim();
        String message;
        if ("1".equals(rolUser)) {
            message = "Bienvenido Solicitante";
        } else {
            message = "Bienvenido Administrador";
        }
        
        // Respuesta exitosa
        return ResponseEntity.ok().body(new LoginResponse(
                message,
                solicitante.getDniruc(),
                solicitante.getRolUser()
        ));
    }

    // Clase para estructurar la respuesta JSON
    public record LoginResponse(String message, String dniruc, String rol_user) {
    }
}
//aasd