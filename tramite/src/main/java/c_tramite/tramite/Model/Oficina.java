package c_tramite.tramite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Oficina {

    @Id
    @Column(name = "n_oficina", length = 8)
    private String nOficina;

    @Column(length = 100)
    private String oficina;

    @Column(columnDefinition = "char(1)")
    private Character estado;

    @Column(name = "Nivel", columnDefinition = "char(1)")
    private Character nivel;

    @Column(name = "Ubicacion", length = 100)
    private String ubicacion;

    private Integer iduo;

    @Column(name = "rep_dni", length = 8)
    private String repDni;

    @Column(name = "rep_datos_completos", length = 100)
    private String repDatosCompletos;

    @Column(columnDefinition = "char(1)")
    private Character selec;

    @Column(name = "fecha_reg")
    private LocalDateTime fechaReg;

    @Column(name = "user_reg", length = 25)
    private String userReg;

    @Column(name = "fecha_mod")
    private LocalDateTime fechaMod;

    @Column(name = "user_mod", length = 25)
    private String userMod;

    @Column(length = 50)
    private String siglas;
}
