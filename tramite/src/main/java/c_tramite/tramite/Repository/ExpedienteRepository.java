package c_tramite.tramite.Repository;

import c_tramite.tramite.Model.Expediente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ExpedienteRepository extends JpaRepository<Expediente, String> {

    @Query(value = """
        SELECT 
            e.ano_eje,
            e.n_expediente,
            td.nom_tipodoc,
            e.siglas_doc,
            e.folios,
            e.asunto,
            e.fecha_doc,
            e.idareafin,
            e.dniruc
        FROM Expedientes e
        LEFT JOIN TipoDocumento td ON e.cod_tipodoc = td.cod_tipodoc
        WHERE e.n_registro = (
            SELECT MAX(n_registro)
            FROM Expedientes
            WHERE n_expediente = e.n_expediente
            AND ano_eje = e.ano_eje
        )
        ORDER BY e.ano_eje DESC
        """, nativeQuery = true)
    Page<Object[]> findExpedientesRaw(Pageable pageable);
    

    @Query(value = """
        SELECT 
            e.ano_eje,
            e.n_expediente,
            td.nom_tipodoc,
            e.siglas_doc,
            e.folios,
            e.asunto,
            e.fecha_doc,
            e.idareafin,
            e.dniruc
        FROM (
            SELECT e.*, 
                ROW_NUMBER() OVER (PARTITION BY e.n_expediente, e.ano_eje ORDER BY e.n_registro DESC) AS RowNum
            FROM Expedientes e
            WHERE e.dniruc = :dni
        ) e
        LEFT JOIN TipoDocumento td ON e.cod_tipodoc = td.cod_tipodoc
        WHERE e.RowNum = 1
        ORDER BY e.ano_eje DESC
        """, nativeQuery = true)
    Page<Object[]> findExpedientesRawByDni(@Param("dni") String dni, Pageable pageable);
    
}
