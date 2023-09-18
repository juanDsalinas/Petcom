package sena.petcom.model.HisoriaClinica;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class HistoriaClinicaDAO implements IHistoriaClinica{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void delete(Integer idHistoriaClinica) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<HistoriaClinica> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HistoriaClinica findOne(Integer idHistoriaClinica) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(HistoriaClinica histo) {
        // TODO Auto-generated method stub
        
    }


}
