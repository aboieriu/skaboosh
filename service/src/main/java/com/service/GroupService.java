package com.service;

import facade.IGroupFacade;
import model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/group")
public class GroupService {
<<<<<<< Updated upstream
     @Autowired
    private IGroupFacade groupFacade;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Group> getAllGroup(){
        return this.groupFacade.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Group getGroup(@PathVariable("id") Long id){
        return this.groupFacade.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public void saveGroup(@RequestBody Group group) {
        this.groupFacade.save(group);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void updateGroup(@PathVariable("id") Long id,@PathVariable("EndDate")Date EndDate, @RequestBody Group group) {
        group.setId(id);
        group.setEndDate(EndDate);
        this.groupFacade.update(group);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteGroup(@PathVariable("id") Long id) {
        this.groupFacade.remove(id);
    }

    public IGroupFacade getGroupFacade() {
        return groupFacade;
    }

    public void setGroupFacade(IGroupFacade groupFacade) {
        this.groupFacade = groupFacade;
    }




=======
>>>>>>> Stashed changes


}
