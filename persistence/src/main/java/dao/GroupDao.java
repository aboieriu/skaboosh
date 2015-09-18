package dao;

import model.Group;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
  public class GroupDao implements IGroupDao {

    private EntityManager entityManager ;
    @PersistenceContext
    private void setEntityManager(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    public List<Group> getAllGroup (){
        return this.entityManager.createQuery("from student_group").getResultList();
    }

    @Transactional
    public Group getGroup(Long id){
        if (id == null) {
            return null;
        } else {
            return entityManager.find(Group.class, id);
        }
        
    }

   @Transactional
    public void addGroup(Group item){

       entityManager.persist(item);
   }

    @Transactional
    public void updateGroup(Group group){
        Group groupFromDbs = this.getGroup(group.getId());
        if (groupFromDbs != null) {
            groupFromDbs.setName(group.getName());
            groupFromDbs.setEndDate(group.getEndDate());
            groupFromDbs.setStartDate(group.getStartDate());
            entityManager.persist(groupFromDbs);
        }
    }
    @Transactional
    public void deleteGroup(Long id) {
       Group groupFromDbs= this.getGroup(id);
        if (groupFromDbs != null) {
            entityManager.remove(groupFromDbs);
        }
    }
}
