package sena.petcom.model.Usuario;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import sena.petcom.model.agendaUsuario;
import sena.petcom.model.Rol.Rol;

@Data
@Builder
@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUsuario")
    private Integer idUsuario;
    
    @NotEmpty
    @NotNull
    @Column(name="tipoDocumentoUsu")
    private String tipoDocumentoUsu;

    @NotNull
    @Column(name="numDocumentoUsu", unique=true)
    private Integer numDocumentoUsu;

    @NotEmpty
    @NotNull
    @Column(name="nombreUsu")
    private String nombreUsu;

    @NotEmpty
    @NotNull
    @Column(name="apellidoUsu")
    private String apellidoUsu;

    @NotNull
    @Column(name="telefonoUsu", unique=true)
    private Integer telefonoUsu;

    @NotEmpty
    @NotNull
    @Column(name="correoUsu", unique=true)
    private String correoUsu;

    @NotEmpty
    @NotNull
    @Column(name="claveUsu")
    private String claveUsu;
    
    @NotNull
    @Column(name="estadoUsu")
    private Boolean estadoUsu;

    @ManyToOne(fetch=FetchType.LAZY)
    private Rol FK;

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<agendaUsuario> idAgendaUsuarioFK;

    public Usuario() {
        idAgendaUsuarioFK=new ArrayList<agendaUsuario>();
    }

    public Usuario(Integer idUsuario, @NotEmpty @NotNull String tipoDocumentoUsu, @NotNull Integer numDocumentoUsu,
            @NotEmpty @NotNull String nombreUsu, @NotEmpty @NotNull String apellidoUsu, @NotNull Integer telefonoUsu,
            @NotEmpty @NotNull String correoUsu, @NotEmpty @NotNull String claveUsu, @NotNull Boolean estadoUsu, Rol fK,
            List<agendaUsuario> idAgendaUsuarioFK) {
        this.idUsuario = idUsuario;
        this.tipoDocumentoUsu = tipoDocumentoUsu;
        this.numDocumentoUsu = numDocumentoUsu;
        this.nombreUsu = nombreUsu;
        this.apellidoUsu = apellidoUsu;
        this.telefonoUsu = telefonoUsu;
        this.correoUsu = correoUsu;
        this.claveUsu = claveUsu;
        this.estadoUsu = estadoUsu;
        FK = fK;
        this.idAgendaUsuarioFK = idAgendaUsuarioFK;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoDocumentoUsu() {
        return tipoDocumentoUsu;
    }

    public void setTipoDocumentoUsu(String tipoDocumentoUsu) {
        this.tipoDocumentoUsu = tipoDocumentoUsu;
    }

    public Integer getNumDocumentoUsu() {
        return numDocumentoUsu;
    }

    public void setNumDocumentoUsu(Integer numDocumentoUsu) {
        this.numDocumentoUsu = numDocumentoUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getApellidoUsu() {
        return apellidoUsu;
    }

    public void setApellidoUsu(String apellidoUsu) {
        this.apellidoUsu = apellidoUsu;
    }

    public Integer getTelefonoUsu() {
        return telefonoUsu;
    }

    public void setTelefonoUsu(Integer telefonoUsu) {
        this.telefonoUsu = telefonoUsu;
    }

    public String getCorreoUsu() {
        return correoUsu;
    }

    public void setCorreoUsu(String correoUsu) {
        this.correoUsu = correoUsu;
    }

    public String getClaveUsu() {
        return claveUsu;
    }

    public void setClaveUsu(String claveUsu) {
        this.claveUsu = claveUsu;
    }

    public Boolean getEstadoUsu() {
        return estadoUsu;
    }

    public void setEstadoUsu(Boolean estadoUsu) {
        this.estadoUsu = estadoUsu;
    }

    public Rol getFK() {
        return FK;
    }

    public void setFK(Rol fK) {
        FK = fK;
    }

    public List<agendaUsuario> getIdAgendaUsuarioFK() {
        return idAgendaUsuarioFK;
    }

    public void setIdAgendaUsuarioFK(List<agendaUsuario> idAgendaUsuarioFK) {
        this.idAgendaUsuarioFK = idAgendaUsuarioFK;
    }
    
}
