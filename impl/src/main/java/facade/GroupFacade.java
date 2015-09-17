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
public class GroupFacade {


    private IGroupFacade groupFacade;


    public List<Group> getAllGroup() {
        return null;
    }

    public Group getGroup(Long id) {
        return null;
    }

    public void updateGroup(Group group) {

    }

    public void addGroup(Group group) {

    }

    public void deleteGroup(Long id) {

    }
    public IGroupFacade getGroupFacade() {
        return groupFacade;
    }

    public void setGroupFacade(IGroupFacade groupFacade) {
        this.groupFacade = groupFacade;
    }

}
