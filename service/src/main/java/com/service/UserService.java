package com.service;

import dao.IUserDao;
import facade.IUserFacade;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/user")
public class UserService {

    @Autowired
    IUserFacade userFacade;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers(Long id) {

        return this.userFacade.getAllUsers(id);
    }

    public void setUserFacade(IUserFacade userFacade) {
        this.userFacade = userFacade;
    }
}
