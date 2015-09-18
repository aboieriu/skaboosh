package com.service;

import dao.IUserDao;
import facade.IUserFacade;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
@Controller

public class UserService {

    @Autowired
    IUserFacade userFacade;

    @RequestMapping(value = "/api/group/{groupId}/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers(Long id) {

        return this.userFacade.getAllUsers(id);
    }
    @RequestMapping(value="/api/group/{groupId}/user/{userId}", method= RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId) {
        return this.userFacade.getUser(groupId, userId);
    }

    @RequestMapping(value="/api/group/{groupId}/user/{userId}", method= RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId) {
        this.userFacade.deleteUser(groupId, userId);
    }


    @RequestMapping(value="/api/group/{groupId}/user/", method= RequestMethod.POST)
    @ResponseBody
    public void addUser(@PathVariable("groupId") Long groupId,@RequestBody User userId) {
        userId.setGroupId(groupId);
        this.userFacade.addUser(userId);
    }

    @RequestMapping(value = "/api/group/{groupId}/user/{userId}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateUser(@PathVariable("userId") Long id ,@PathVariable("groupId") Long groupId,@RequestBody User user) {
        user.setId(id);
        user.setGroupId(groupId);
        this.userFacade.updateUser(user);
    }

    public IUserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(IUserFacade userFacade) {
        this.userFacade = userFacade;
    }
}
