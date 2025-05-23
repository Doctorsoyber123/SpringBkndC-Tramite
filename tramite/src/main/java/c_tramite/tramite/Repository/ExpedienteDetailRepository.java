package c_tramite.tramite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ExpedienteDetailRepository extends JpaRepository<c_tramite.tramite.Model.Expediente, String> {

    @Query(value = """
        SELECT TOP 1 
            e.ano_eje, e.n_expediente, s.nombre, e.tipo_mov_ie, td.nom_tipodoc, 
            e.cod_tipodoc, e.siglas_doc, e.fecha_doc, e.folios, e.asunto, 
            e.n_registro, e.tipo_reg, e.fecha_registro, e.idareaini, 
            e.fecha_envio, e.idareafin, e.idestado, e.user_reg, e.parasu
        FROM dbo.Expedientes e
        INNER JOIN dbo.TipoDocumento td ON td.cod_tipodoc = e.cod_tipodoc
        LEFT JOIN dbo.Solicitante s ON s.dniruc = e.dniruc
        WHERE e.ano_eje = :anoEje 
          AND e.n_expediente = :nExpediente
          AND e.dniruc = :dni
          AND e.n_registro = (
              SELECT MAX(n_registro)
              FROM dbo.Expedientes
              WHERE n_expediente = :nExpediente 
                AND ano_eje = :anoEje
          )
        ORDER BY e.fecha_doc DESC
        """, nativeQuery = true)
    Object getDetalle(
        @Param("anoEje") String anoEje, 
        @Param("nExpediente") BigDecimal nExpediente, 
        @Param("dni") String dni
    );
}
