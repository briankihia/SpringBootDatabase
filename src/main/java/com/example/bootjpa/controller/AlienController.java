package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bootjpa.model.Alien;
import com.example.bootjpa.dao.AlienRepo;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController
{
//    we create an implementation of this repository
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }

//    we create a controller that will accept addAlien
//    below is used to send data to the database
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "home.jsp";
    }

//    this is the controller for get alien
//    we don't want to get alien we just want the id
//    we will also use requestParam which is used to get data from client
//    we use ModelAndView because we are getting data and using it not sending to database
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid)
    {
//        below showAlien.jsp is a view name put where a constructor should be
//        the below ModelAndView doesn't contain anything at first, it's just use to store data
        ModelAndView mv = new ModelAndView("showAlien.jsp");
//        below orElse art is used to remove an error that you get without it
//        and incase client is trying to get data that is not in the database it will return null values
        Alien alien =repo.findById(aid).orElse(new Alien());
//        above we put some data in alien and then we use ModelAndView and put data content of alien
//        after writing below, we can now access the data in our template but using alien
        mv.addObject(alien);
//        when you use mv you just return mv
        return mv;
    }

}
