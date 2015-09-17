package dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
public class UserDao implements IUserDao {

    private EntityManager entityManager;


    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> getAllUsers(Long id) {
        return this.entityManager.createQuery("from Article").getResultList();;
    }
}
