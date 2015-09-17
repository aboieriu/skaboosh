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

     List<Group> getAllGroup();
     Group getGroup(Long id);
     void addGroup(Group group);
     void updateGroup(Group group);
     void deleteGroup(Long id);
}
