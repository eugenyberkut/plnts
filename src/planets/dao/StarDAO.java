package planets.dao;

import planets.model.Star;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Eugeny on 25.10.2016.
 */
@Stateless
public class StarDAO {
    @PersistenceContext
    EntityManager em;

    public List<Star> findAll(){
        return em.createQuery("select s from Star s").getResultList();
    }
}
