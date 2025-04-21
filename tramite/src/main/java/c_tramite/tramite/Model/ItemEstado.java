package c_tramite.tramite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemEstado {

    @Id
    @Column(name = "item_estado")
    private Integer itemEstado;

    @Column(name = "nom_estado", length = 100)
    private String nomEstado;

    private Integer orden;
}
