package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bootjpa.model.Alien;
import com.example.bootjpa.dao.AlienRepo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AlienController
{

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }


    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "home.jsp";
    }


    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens()
    {
//        when we say public String above , it expects we return a view name but here we are not returning a view name, we are returning a data thus add annotation
//        @ResponseBody

//        when using web services we dont need jsp thus we dont need ModelAndView object. All you need is data
//          find all returns all aliens.Part of your repository
        return repo.findAll().toString();
    }

//    we also want a user can search with id also eg, localhost:8080/aliens/102 thus we create this method

    @RequestMapping("/aliens/{aid}")
    @ResponseBody
    public String getAlien(@PathVariable("aid") int aid)
    {
//        @PathVariable helps the data coming in @RequestMapping to go to argument in getAlien
//        when we say public String above , it expects we return a view name but here we are not returning a view name, we are returning a data thus add annotation
//        @ResponseBody

//        when using web services we dont need jsp thus we dont need ModelAndView object. All you need is data
//          find all returns all aliens.Part of your repository
        return repo.findById(aid).toString();
    }

}
