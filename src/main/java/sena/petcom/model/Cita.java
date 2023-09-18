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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCita;
    
    @NotNull
    @NotEmpty
    @Column
    private String motivoConsulta;

    @NotEmpty
    @NotNull
    @Column
    private Boolean estadoCita;

    @ManyToOne(fetch=FetchType.LAZY)
    private Agenda FK;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente Fk;

    @OneToMany(mappedBy="Fk", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<DetallesHistoria> idDetallesHistoriaFK;

    public Cita() {
        idDetallesHistoriaFK=new ArrayList<DetallesHistoria>();
    }

    public Cita(Integer idCita, @NotEmpty String motivoConsulta, @NotEmpty Boolean estadoCita) {
        this.idCita = idCita;
        this.motivoConsulta = motivoConsulta;
        this.estadoCita = estadoCita;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Boolean getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(Boolean estadoCita) {
        this.estadoCita = estadoCita;
    }
}
