package sena.petcom.model.agendaUsuario;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class agendaUsuarioDAO {
    @PersistenceContext
    private EntityManager em;
}
