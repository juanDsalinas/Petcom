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

@Entity
@Table(name="DetallesHistoria")
public class DetallesHistoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDetallesHistoria;

    @NotNull
    @Column
    private int tamañoDetalles;
    
    @NotNull
    @Column
    private int pesoDetalles;

    @NotNull
    @NotEmpty
    @Column
    private String antecedentesDetalles;

    @NotNull
    @NotEmpty
    @Column
    private String recomendaciones;

    @NotNull
    @Column
    private Boolean estadoDetalles;

    @ManyToOne(fetch=FetchType.LAZY)
    private HistoriaClinica FK;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cita Fk;

    public DetallesHistoria() {
    }

    public DetallesHistoria(Integer idDetallesHistoria, @NotNull int tamañoDetalles, @NotNull int pesoDetalles,
            @NotEmpty String antecedentesDetalles, @NotEmpty String recomendaciones, @NotNull Boolean estadoDetalles) {
        this.idDetallesHistoria = idDetallesHistoria;
        this.tamañoDetalles = tamañoDetalles;
        this.pesoDetalles = pesoDetalles;
        this.antecedentesDetalles = antecedentesDetalles;
        this.recomendaciones = recomendaciones;
        this.estadoDetalles = estadoDetalles;
    }

    public Integer getIdDetallesHistoria() {
        return idDetallesHistoria;
    }

    public void setIdDetallesHistoria(Integer idDetallesHistoria) {
        this.idDetallesHistoria = idDetallesHistoria;
    }

    public int getTamañoDetalles() {
        return tamañoDetalles;
    }

    public void setTamañoDetalles(int tamañoDetalles) {
        this.tamañoDetalles = tamañoDetalles;
    }

    public int getPesoDetalles() {
        return pesoDetalles;
    }

    public void setPesoDetalles(int pesoDetalles) {
        this.pesoDetalles = pesoDetalles;
    }

    public String getAntecedentesDetalles() {
        return antecedentesDetalles;
    }

    public void setAntecedentesDetalles(String antecedentesDetalles) {
        this.antecedentesDetalles = antecedentesDetalles;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Boolean getEstadoDetalles() {
        return estadoDetalles;
    }

    public void setEstadoDetalles(Boolean estadoDetalles) {
        this.estadoDetalles = estadoDetalles;
    }
}
