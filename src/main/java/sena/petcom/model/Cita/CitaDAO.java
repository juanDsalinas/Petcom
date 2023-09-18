package sena.petcom.model.Cita;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CitaDAO {
    @PersistenceContext
    private EntityManager em;
}
