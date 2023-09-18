package sena.petcom.model.Agenda;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class AgendaDAO {
    @PersistenceContext
    private EntityManager em;
}
