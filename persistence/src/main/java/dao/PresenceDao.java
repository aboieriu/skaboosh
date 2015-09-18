package dao;

import model.Presence;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
        return this.entityManager.createQuery("from Presence").getResultList();
    }

    public Presence getPresence(Long groupId,Long userId,Long presenceId) {
        if(groupId !=null || userId != null || presenceId !=null)
        {
            Query query = this.entityManager.createQuery("from Presence WHERE groupId = :groupId AND userId = :userId AND id = :presenceId");
            query.setParameter("groupId" , groupId);
            query.setParameter("userId" , userId);
            query.setParameter("presenceId" , presenceId);
            List<Presence> result = query.getResultList();
            if (!result.isEmpty()) {
                return result.get(0);
            }

        }
        return null;

    }

    public Presence getThisPresence(Long presenceId)
    {
        return this.entityManager.find(Presence.class,presenceId);
    }
    @Transactional
    public void updatePresence(Presence presence) {
        Presence presenceFromDbs = this.getThisPresence(presence.getId());
        if(presenceFromDbs !=null){

            presenceFromDbs.setDate(presence.getDate());
            entityManager.persist(presenceFromDbs);
        }

    }
    @Transactional
    public void addPresence(Presence presence) {

        entityManager.persist(presence);
    }
    @Transactional
    public void deletePresence(Long groupId,Long userId,Long presenceId) {
        Presence presenceFromDbs= this.getPresence(groupId,userId,presenceId);
        if(presenceFromDbs != null){
            entityManager.remove(presenceFromDbs);
        }

    }
}
