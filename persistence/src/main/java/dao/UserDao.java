package dao;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
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
        return this.entityManager.createQuery("from User").getResultList();
    }



    @Transactional
    public void deleteUser(Long groupId , Long userId) {
        User itemFromDbs = this.getUser(groupId, userId);
        //Article itemFromDbs = entityManager.find(Article.class, id);
        if (itemFromDbs != null) {
            entityManager.remove(itemFromDbs);
        }
    }



    @Transactional
    public User getUser(Long groupId,Long userId) {
        if(groupId !=null || userId != null)
        {
            Query query = this.entityManager.createQuery("from User WHERE groupId = :targetgroupId AND id = :targetuserId ");
            query.setParameter("targetgroupId" , groupId);
            query.setParameter("targetuserId" , userId);
            List<User> result = query.getResultList();
            if (!result.isEmpty()) {
                return result.get(0);
            }

        }
        return null;
    }

    @Transactional
    public void addUser(User userId)
    {
        entityManager.persist(userId);
    }

    public User getUserById (Long userId)
    {
        return this.entityManager.find(User.class,userId);
    }

    @Transactional
    public void updateUser(User myUser){
        User itemFromDbs = this.getUserById(myUser.getId());
        if (itemFromDbs != null) {
            itemFromDbs.setName(myUser.getName());
            itemFromDbs.setSurname(myUser.getSurname());
            itemFromDbs.setUsername(myUser.getUsername());
            itemFromDbs.setPassword(myUser.getPassword());
            itemFromDbs.setEmail(myUser.getEmail());
            itemFromDbs.setPhone(myUser.getPhone());
            itemFromDbs.setRepositoryUrl(myUser.getRepositoryUrl());
            entityManager.persist(itemFromDbs);
        }
    }


}
