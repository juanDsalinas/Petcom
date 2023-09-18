package sena.petcom.model.Rol;

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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sena.petcom.model.Usuario.Usuario;


@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @NotEmpty
    @Column
    @NotNull
    private String rol;

    @NotNull
    @Column
    private Boolean estadoRol;

    @OneToMany(mappedBy="FK", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<Usuario> idUsuarioFK;

    public Rol() {
        idUsuarioFK=new ArrayList<Usuario>();
    }

    public Rol(Integer idRol, @NotEmpty String rol, @NotNull Boolean estadoRol) {
        this.idRol = idRol;
        this.rol = rol;
        this.estadoRol = estadoRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstadoRol() {
        return estadoRol;
    }

    public void setEstadoRol(Boolean estadoRol) {
        this.estadoRol = estadoRol;
    }
}
