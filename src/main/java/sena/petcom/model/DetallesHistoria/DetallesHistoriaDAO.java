package sena.petcom.model.DetallesHistoria;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class DetallesHistoriaDAO {
    @PersistenceContext
    private EntityManager em;
}
