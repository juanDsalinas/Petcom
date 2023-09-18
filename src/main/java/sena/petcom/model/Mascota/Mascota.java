package sena.petcom.model.Mascota;

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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import sena.petcom.model.Cliente;
import sena.petcom.model.HistoriaClinica;

@Entity
@Table(name="Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascota;

    @NotNull
    @NotEmpty
    @Column
    private String nombreMascota;

    @NotNull
    @NotEmpty
    @Column
    private String apellidoMascota;

    @NotNull
    @Column
    private Date fechaNacimiento;

    @NotNull
    @NotEmpty
    @Column
    private String raza;
    
    @NotNull
    @NotEmpty
    @Column
    private String genero;

    @NotNull
    @Column
    private Boolean estadoMascota;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente FK;
    

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<HistoriaClinica> idHistoriaClinicaFK;

    public Mascota() {
        idHistoriaClinicaFK=new ArrayList<HistoriaClinica>();
    }

    public Mascota(Integer idMascota, @NotEmpty String nombreMascota, @NotEmpty String apellidoMascota,
            @NotNull Date fechaNacimiento, @NotEmpty String raza, @NotEmpty String genero,
            @NotNull Boolean estadoMascota) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.apellidoMascota = apellidoMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.genero = genero;
        this.estadoMascota = estadoMascota;
    }

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getApellidoMascota() {
        return apellidoMascota;
    }

    public void setApellidoMascota(String apellidoMascota) {
        this.apellidoMascota = apellidoMascota;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(Boolean estadoMascota) {
        this.estadoMascota = estadoMascota;
    }
}
