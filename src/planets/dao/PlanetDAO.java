package planets.dao;

import planets.model.Planet;
import planets.model.Star;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Eugeny on 15.11.2016.
 */
@Stateless
public class PlanetDAO {
    @PersistenceContext
    EntityManager em;

    public List<Planet> findAll() {
        return em.createQuery("select p from Planet p").getResultList();
    }

    public Planet find(int id) {
        return em.find(Planet.class, id);
    }

    public void create(String name, int radius, int temp, byte life, byte atm, Star star) {
        Planet planet = new Planet(name,radius, temp, life, atm);
        planet.setStar(star);
        em.persist(planet);
    }

}
