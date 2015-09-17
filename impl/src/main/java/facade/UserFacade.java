package facade;

import dao.IUserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public class UserFacade implements IUserFacade {

    @Autowired
    private IUserDao userDao;

    public List<User> getAllUsers(Long id) {
        return this.userDao.getAllUsers(id);
    }
}