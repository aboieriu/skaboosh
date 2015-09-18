package com.service;

import facade.IPresenceFacade;
import model.Presence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */

@Controller

public class PresenceService {

    @Autowired
    private IPresenceFacade presenceFacade;

    @DateTimeFormat
    @RequestMapping(value = "/api/group/{groupId}/user/{userId}/presence", method = RequestMethod.GET)
    @ResponseBody
    public List<Presence> bringPresence(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId){
        return this.presenceFacade.bringPresence();

    }

    @DateTimeFormat
    @RequestMapping(value = "/api/group/{groupId}/user/{userId}/presence/{presenceId}", method = RequestMethod.GET)
    @ResponseBody
    public Presence getPresence(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId,@PathVariable("presenceId") Long presenceId){

        return this.presenceFacade.getPresence(groupId,userId,presenceId);

    }


    @RequestMapping(value = "/api/group/{groupId}/user/{userId}/presence/{presenceId}",method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePresence(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId,@PathVariable("presenceId") Long presenceId){

        this.presenceFacade.deletePresence(groupId,userId,presenceId);


    }


    @DateTimeFormat
    @RequestMapping(value = "/api/group/{groupId}/user/{userId}/presence/",method = RequestMethod.POST)
    @ResponseBody
    public void addPresence(@RequestBody Presence newEntry){


        this.presenceFacade.addPresence(newEntry);
    }

    @DateTimeFormat
    @RequestMapping(value = "/api/group/{groupId}/user/{userId}/presence/{presenceId}",method = RequestMethod.PUT)
    @ResponseBody
    public void updatePresence(@PathVariable("groupId") Long groupId,@PathVariable("userId") Long userId,@PathVariable("presenceId") Long presenceId, @RequestBody Presence presenceUpdate) {
        presenceUpdate.setId(presenceId);
        presenceUpdate.setUserId(userId);
        presenceUpdate.setGroupId(groupId);

        this.presenceFacade.updatePresence(presenceUpdate);
    }



    public IPresenceFacade getPresenceFacade() {
        return presenceFacade;
    }

    public void setPresenceFacade(IPresenceFacade presenceFacade) {
        this.presenceFacade = presenceFacade;
    }


}
