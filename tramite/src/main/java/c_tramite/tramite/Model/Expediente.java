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
public class Expediente {

    @Id
    @Column(name = "ano_eje", columnDefinition = "char(4)")
    private String anoEje;

    @Column(name = "n_expediente", precision = 18, scale = 0)
    private BigDecimal nExpediente;

    @Column(name = "n_registro")
    private Integer nRegistro;

    @Column(length = 12)
    private String codigo;

    @Column(columnDefinition = "char(1)")
    private Character contupa;

    @Column(name = "tipo_mov_ie", columnDefinition = "char(1)")
    private Character tipoMovIe;

    @Column(name = "tipo_reg", columnDefinition = "char(1)")
    private Character tipoReg;

    private Integer nCopias;

    @Column(name = "reg_copias_orginal")
    private Integer regCopiasOrginal;

    @Column(name = "fecha_doc")
    private LocalDateTime fechaDoc;

    @Column(name = "cod_tipodoc", columnDefinition = "char(3)")
    private String codTipodoc;

    @Column(name = "nro_doc", length = 5)
    private String nroDoc;

    @Column(name = "siglas_doc", length = 75)
    private String siglasDoc;

    private Integer folios;

    @Column(name = "n_solicitante")
    private Integer nSolicitante;

    @Column(name = "n_contacto")
    private Integer nContacto;

    @Column(length = 100)
    private String contacto;

    @Column(length = 25)
    private String telefono;

    @Column(length = 1000)
    private String asunto;

    @Column(name = "n_procedimiento")
    private Integer nProcedimiento;

    @Column(name = "annio_procedimiento", columnDefinition = "char(4)")
    private String annioProcedimiento;

    @Column(columnDefinition = "varchar(MAX)")
    private String referencia;

    @Column(name = "n_oficina", length = 8)
    private String nOficina;

    @Column(name = "area_inicio", length = 8)
    private String areaInicio;

    @Column(name = "dni_inicio", length = 8)
    private String dniInicio;

    @Column(name = "datos_responsable_inicio", length = 100)
    private String datosResponsableInicio;

    @Column(name = "area_resuelve", length = 8)
    private String areaResuelve;

    @Column(name = "dni_resuelve", length = 8)
    private String dniResuelve;

    @Column(name = "datos_responsable_resuelve", length = 100)
    private String datosResponsableResuelve;

    @Column(length = 254)
    private String observacion;

    @Column(name = "proceso_describe", length = 200)
    private String procesoDescribe;

    private BigDecimal uit;

    private BigDecimal valor;

    private Integer dias;

    @Column(name = "item_estado")
    private Integer itemEstado;

    @Column(length = 75)
    private String estado;

    @Column(name = "estado_req", length = 75)
    private String estadoReq;

    @Column(name = "estado_bandeja_usuario", columnDefinition = "char(1)")
    private Character estadoBandejaUsuario;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "fecha_envio")
    private LocalDateTime fechaEnvio;

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

    @Column(name = "user_anula", length = 25)
    private String userAnula;

    @Column(name = "fecha_anula")
    private LocalDateTime fechaAnula;

    @Column(columnDefinition = "char(1)")
    private Character pdf;

    @Column(length = 250)
    private String ruta;

    @Lob
    @Column(name = "pdfdigital")
    private byte[] pdfDigital;

    @Column(length = 100)
    private String pasea;

    @Column(length = 100)
    private String parasu;

    @Column(name = "fechahorapasea")
    private LocalDateTime fechahoraPasea;

    @Column(name = "codigo_origen", length = 12)
    private String codigoOrigen;

    @Column(name = "check_derivado", columnDefinition = "char(1)")
    private Character checkDerivado;

    @Column(name = "seguimiento_copia")
    private Integer seguimientoCopia;

    @Column(name = "doc_deriva", length = 600)
    private String docDeriva;

    @Column(name = "doc_deriva_ie", columnDefinition = "char(1)")
    private Character docDerivaIe;

    @Column(name = "doc_deriva_e_segun", length = 200)
    private String docDerivaESegun;

    @Column(name = "doc_deriva_entidad", length = 200)
    private String docDerivaEntidad;

    @Column(length = 150)
    private String idareaini;

    @Column(length = 150)
    private String idareafin;
    
    @Column(length = 35)
    private String idestado;

    @Column(name = "fecha_actual", length = 20)
    private String fechaActual;

    @Column(length = 11)
    private String dniruc;

    @Column(length = 200)
    private String foto;

    @Column(name = "ano_eje_principal", columnDefinition = "char(4)")
    private String anoEjePrincipal;

    @Column(name = "n_expediente_principal", precision = 18, scale = 0)
    private BigDecimal nExpedientePrincipal;

    @Column(name = "docnuevo_original", length = 2)
    private String docNuevoOriginal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipodoc", referencedColumnName = "cod_tipodoc", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;
    
    // Relación con Solicitante (muchos a uno)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "n_solicitante", referencedColumnName = "n_solicitante", insertable = false, updatable = false)
    private Solicitante solicitante;
}
