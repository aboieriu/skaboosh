package dao;

import model.Presence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public class PresenceDao implements IPresenceDao {

    private EntityManager entityManager;

    @PersistenceContext
    private void setEntityManager(EntityManager entityManager){

        this.entityManager =entityManager;
    }

    public List<Presence> bringPresence() {
        return null;
    }

    public Presence getPresence(Long id) {
        return null;
    }

    public void updatePresence(Presence presence) {

    }

    public void addPresence(Presence presence) {

    }

    public void deletePresence(Long id) {

    }
}
