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

//    below is a mapping for deleting data
//    we use a delete mapping
//    NB- we are using the same url in all this methods but a different request. URL= alien but request's are 3= delete, get and post
//    remember in this delete we are using id to delete thus we specify aid
    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable("aid") int aid)
    {
//        here we wanna return an alien, and where do we get the alien?using a get method
//        so first we have to check, do we have that method if we're deleting
        Alien a = repo.getOne(aid);
//        now we perform a delete operation
//        we have method called delete where we need to pass an object
//        and we're deleting from repo that's why we start with repo
//        repo contains our data that's why
        repo.delete(a);
//        once the object is deleted you cannot return it thus we change our return to return a string
        return "deleted";
    }





    @PostMapping(path="/alien", consumes= {"application/json"})
    public Alien addAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }


//
    @GetMapping (path="/aliens")
    public List<Alien> getAliens()
    {
//
        return repo.findAll();
    }


    //    we also want to update data thus we create it's method
//    in our postman we use PUT since there is no update
//    if data is not available it is created, if available, it is updated
//    we use PutMapping
//    also uses the same method as POST
    @PutMapping(path="/alien",consumes= {"application/json"})
    public Alien saveOrUpdateAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }



//    we also want a user can search with id also eg, localhost:8080/aliens/102 thus we create this method

    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid)
    {
//
        return repo.findById(aid);
    }

}
