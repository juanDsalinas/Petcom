package sena.petcom.model.Mascota;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Null;

@Repository
public class MascotaDAO implements IMascota{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void delete(Integer idMascota) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Mascota> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mascota findOne(Integer idMascota) {
        // TODO Auto-generated method stub
        return null;
    }

    @Transactional
    @Override
    public void save(Mascota masco) {
        if(masco.getIdMascota()!=null && masco.getIdMascota()>0){
            em.merge(masco);    
        }
        else{
            em.persist(masco);
        }
        
    }



    
}
