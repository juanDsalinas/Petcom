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
@Table(name="HistoriaClinica")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idHistoriaClinica;

    @NotNull
    @Column
    private int peso;

    @NotNull
    @Column
    private int tamaño;

    @NotNull
    @NotEmpty
    @Column
    private String enfermedades;

    @NotNull
    @NotEmpty
    @Column
    private String antecedentes;

    @NotNull
    @NotEmpty
    @Column
    private String diagnosticoHistoria;

    @ManyToOne(fetch=FetchType.LAZY)
    private Mascota FK;

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<DetallesHistoria> idDetallesHistoriaFK;

    public HistoriaClinica() {
        idDetallesHistoriaFK=new ArrayList<DetallesHistoria>();
    }

    public HistoriaClinica(Integer idHistoriaClinica, @NotNull int peso, @NotNull int tamaño,
            @NotEmpty String enfermedades, @NotEmpty String antecedentes, @NotEmpty String diagnosticoHistoria) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.peso = peso;
        this.tamaño = tamaño;
        this.enfermedades = enfermedades;
        this.antecedentes = antecedentes;
        this.diagnosticoHistoria = diagnosticoHistoria;
    }

    public Integer getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getDiagnosticoHistoria() {
        return diagnosticoHistoria;
    }

    public void setDiagnosticoHistoria(String diagnosticoHistoria) {
        this.diagnosticoHistoria = diagnosticoHistoria;
    }
}
