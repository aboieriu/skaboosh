package facade;

import model.Group;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public interface IGroupFacade {
    List<Group> getAllGroup();
    Group getGroup(Long id);
    void updateGroup(Group group);
    void addGroup(Group group);
    void deleteGroup(Long id);
}
