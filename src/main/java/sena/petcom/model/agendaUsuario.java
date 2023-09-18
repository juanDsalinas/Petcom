package sena.petcom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import sena.petcom.model.Usuario.Usuario;

@Entity
@Table(name="agendaUsuario")
public class agendaUsuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idAgendaUsuario;

    @NotEmpty
    @Column
    @NotNull
    private String tipoCita;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuario FK;

    @ManyToOne(fetch=FetchType.LAZY)
    private Agenda Fk;

    public agendaUsuario() {
    }

    public agendaUsuario(Integer idAgendaUsuario, @NotEmpty String tipoCita) {
        this.idAgendaUsuario = idAgendaUsuario;
        this.tipoCita = tipoCita;
    }

    public Integer getIdAgendaUsuario() {
        return idAgendaUsuario;
    }

    public void setIdAgendaUsuario(Integer idAgendaUsuario) {
        this.idAgendaUsuario = idAgendaUsuario;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }
}
