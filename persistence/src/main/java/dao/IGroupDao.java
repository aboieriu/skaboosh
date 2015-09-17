package dao;

import model.Group;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public interface IGroupDao {
    public void getGroup();
    public  List<Group> getAllGroup();
    public Group getGroup(Long id);
    public void addGroup(Group group);
    public  void updateGroup(Group group);
    public void deleteGroup(Long id);
}
