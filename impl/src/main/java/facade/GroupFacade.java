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
        return this.groupFacade.getAllGroup();
    }

    public Group getGroup(Long id) {
        return this.groupFacade.getGroup(id)  ;
    }

    public void addGroup(Group group) {
         this.groupFacade.addGroup(group);

    }
    public void updateGroup(Group group) {
         this.groupFacade.updateGroup(group);

    }



    public void deleteGroup(Long id) {
        this.groupFacade.deleteGroup(id);

    }
    public IGroupFacade getGroupFacade() {
        return groupFacade;
    }

    public void setGroupFacade(IGroupFacade groupFacade) {
        this.groupFacade = groupFacade;
    }

}
