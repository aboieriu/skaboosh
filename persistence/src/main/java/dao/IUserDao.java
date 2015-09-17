package dao;

import model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public interface IUserDao {
    public List<User> getAllUsers(Long id);
    public void addUser(User userId);
    public void updateUser(User myUser);
    public void deleteUser(Long groupId , Long userId);
    public User getUser(Long groupId,Long userId);
}
