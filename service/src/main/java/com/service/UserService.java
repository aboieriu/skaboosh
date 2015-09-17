package com.service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserService {

    @Autowired
    IArticleFacade articleFacade;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<User> myArticleList() {

        return this.articleFacade.get();
    }

}
