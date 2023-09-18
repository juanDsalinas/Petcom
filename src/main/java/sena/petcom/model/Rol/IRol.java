package sena.petcom.model.Rol;

import java.util.List;

public interface IRol {
    public void save (Rol rol);
    public List<Rol> findAll();
    public Rol findOne(Integer idRol);
    public void delete(Integer idRol);
}
