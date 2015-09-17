package facade;

import dao.IGroupDao;
import model.Group;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public class GroupFacade implements IGroupFacade{

    @Autowired
    private IGroupDao groupDao;


    public List<Group> getAllGroup() {
        return this.groupDao.getAllGroup();
    }

    public Group getGroup(Long id) {
        return this.groupDao.getGroup(id)  ;
    }

    public void addGroup(Group group) {
         this.groupDao.addGroup(group);

    }
    public void updateGroup(Group group) {
         this.groupDao.updateGroup(group);

    }



    public void deleteGroup(Long id) {
        this.groupDao.deleteGroup(id);

    }

    public IGroupDao getGroupDao() {
        return groupDao;
    }

    public void setGroupDao(IGroupDao groupDao) {
        this.groupDao = groupDao;
    }
}
