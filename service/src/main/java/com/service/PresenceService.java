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
@RequestMapping("/presence")
public class PresenceService {

    @Autowired
    private IPresenceFacade presenceFacade;

    public IPresenceFacade getPresenceFacade() {
        return presenceFacade;
    }

    public void setPresenceFacade(IPresenceFacade presenceFacade) {
        this.presenceFacade = presenceFacade;
    }

    @DateTimeFormat
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Presence> bringPresence(){
        return this.presenceFacade.bringPresence();

    }

    @DateTimeFormat
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Presence getPresence(@PathVariable("id") Long id){

        return this.presenceFacade.getPresence(id);

    }


    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePresence(@PathVariable("id")Long id){

        this.presenceFacade.deletePresence(id);


    }


    @DateTimeFormat
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public void addPresence(@RequestBody Presence newEntry){


        this.presenceFacade.addPresence(newEntry);
    }

    @DateTimeFormat
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public void updatePresence(@PathVariable("id") Long id, @RequestBody Presence presenceUpdate) {
        presenceUpdate.setId(id);


        this.presenceFacade.updatePresence(presenceUpdate);
    }



}
