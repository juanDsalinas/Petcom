package sena.petcom.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull
    @NotEmpty
    @Column
    private String tipoDocumentoCliente;

    @NotNull
    @Column(unique=true)
    private int numDocCliente;

    @NotNull
    @NotEmpty
    @Column
    private String nombreCliente;

    @NotNull
    @Column(unique=true)
    private long telefonoCliente;

    @NotNull
    @NotEmpty
    @Column(unique=true)
    private String correoCliente;

    @NotNull
    @NotEmpty
    @Column
    private Boolean estadoCliente;

    @OneToMany(mappedBy="Fk", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Cita> idCitaFK;

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Mascota> idMascotaFK;

    public Cliente() {
        idCitaFK=new ArrayList<Cita>();
        idMascotaFK=new ArrayList<Mascota>();
    }

    public Cliente(Integer idCliente, @NotEmpty String tipoDocumentoCliente, @NotNull int numDocCliente,
            @NotEmpty String nombreCliente, @NotNull long telefonoCliente, @NotEmpty String correoCliente,
            @NotEmpty Boolean estadoCliente) {
        this.idCliente = idCliente;
        this.tipoDocumentoCliente = tipoDocumentoCliente;
        this.numDocCliente = numDocCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.estadoCliente = estadoCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }

    public void setTipoDocumentoCliente(String tipoDocumentoCliente) {
        this.tipoDocumentoCliente = tipoDocumentoCliente;
    }

    public int getNumDocCliente() {
        return numDocCliente;
    }

    public void setNumDocCliente(int numDocCliente) {
        this.numDocCliente = numDocCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public Boolean getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(Boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
}
