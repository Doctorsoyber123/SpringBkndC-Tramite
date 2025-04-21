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
public class TipoDocumento {

    @Id
    @Column(name = "cod_tipodoc", columnDefinition = "char(3)")
    private String codTipodoc;

    @Column(name = "nom_tipodoc", length = 150)
    private String nomTipodoc;

    @Column(length = 35)
    private String abrev;

    @Column(columnDefinition = "char(1)")
    private Character estado;

    @Column(name = "fecha_reg")
    private LocalDateTime fechaReg;

    @Column(name = "user_reg", length = 25)
    private String userReg;

    @Column(name = "fecha_mod")
    private LocalDateTime fechaMod;

    @Column(name = "user_mod", length = 25)
    private String userMod;

    @Column(columnDefinition = "char(1)")
    private Character selec;
}
