package c_tramite.tramite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solicitante {

    @Id
    @Column(name = "n_solicitante")
    private BigDecimal nSolicitante;

    private Character tipo;

    private String dniruc;

    private String nombre;

    @Column(columnDefinition = "varchar(MAX)")
    private String direccion;

    private String telefono;

    private String email;

    @Column(name = "Observacion")
    private String observacion;

    private Character selec;

    @Column(name = "fecha_reg")
    private LocalDateTime fechaReg;

    @Column(name = "user_reg")
    private String userReg;

    @Column(name = "fecha_mod")
    private LocalDateTime fechaMod;

    @Column(name = "user_mod")
    private String userMod;

    @Column(name = "user_web")
    private String userWeb;

    @Column(name = "clave_web")
    private String claveWeb;

    @Column(name = "acceso_web")
    private Character accesoWeb;

    @Column(name = "fecha_actual")
    private String fechaActual;

    private String clave;

    @Column(name = "fec_hora")
    private LocalDateTime fecHora;

    private String foto;

    private String login;

    @Column(name = "rol_user", columnDefinition = "nchar(4)")
    private String rolUser;
}
