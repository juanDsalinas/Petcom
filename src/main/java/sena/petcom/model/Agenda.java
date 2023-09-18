package sena.petcom.model;

import java.sql.Time;
import java.sql.Date;
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
@Table(name="Agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAgenda;

    @NotNull
    @Column
    private Date fechaInicio;

    @NotNull
    @Column
    private Date fechaFin;

    @NotNull
    @Column
    private Time horaInicio;

    @NotNull
    @Column
    private Time horaFin;

    @NotNull
    @Column
    private Boolean estadoAgenda;

    @OneToMany(mappedBy="Fk", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<agendaUsuario> idAgendaUsuarioFK;

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Cita> idCitaFK;

    public Agenda(){
        idAgendaUsuarioFK=new ArrayList<agendaUsuario>();
        idCitaFK=new ArrayList<Cita>();
    }

    public Agenda(Integer idAgenda, @NotNull Date fechaInicio, @NotNull Date fechaFin, @NotNull Time horaInicio,
            @NotNull Time horaFin, @NotEmpty Boolean estadoAgenda) {
        this.idAgenda = idAgenda;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estadoAgenda = estadoAgenda;
    }

    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Boolean getEstadoAgenda() {
        return estadoAgenda;
    }

    public void setEstadoAgenda(Boolean estadoAgenda) {
        this.estadoAgenda = estadoAgenda;
    }
}
