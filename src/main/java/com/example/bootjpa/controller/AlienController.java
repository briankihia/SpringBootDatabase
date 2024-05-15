package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.bootjpa.model.Alien;
import com.example.bootjpa.dao.AlienRepo;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RestController
public class AlienController
{

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }


//    we change url below to just alien
//    there are now 2 methods with a url of alien. but this one is for post request and the other for get request
//    for below methods to know which is which, post and get, change annotation @RequestMapping to @PostMapping
//    below I have consumes which is used to control what type of data a client can send to the server.
//    when server sends data to server the server consumes but server sending data to client is producing.
    @PostMapping(path="/alien", consumes= {"application/json"})
    public Alien addAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }


//    supporting both xml and json
    @GetMapping (path="/aliens")
    public List<Alien> getAliens()
    {
//        when we say public String above , it expects we return a view name but here we are not returning a view name, we are returning a data thus add annotation
//        @ResponseBody

//        when using web services we dont need jsp thus we dont need ModelAndView object. All you need is data
//          find all returns all aliens.Part of your repository
        return repo.findAll();
    }

//    we also want a user can search with id also eg, localhost:8080/aliens/102 thus we create this method

    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid)
    {
//        Optional<Alien> is used to return alien and if it doesn't find it returns optional data
//        @PathVariable helps the data coming in @RequestMapping to go to argument in getAlien
//        when we say public String above , it expects we return a view name but here we are not returning a view name, we are returning a data thus add annotation
//        @ResponseBody

//        when using web services we dont need jsp thus we dont need ModelAndView object. All you need is data
//          find all returns all aliens.Part of your repository
        return repo.findById(aid);
    }

}
