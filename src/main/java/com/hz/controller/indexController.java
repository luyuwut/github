package com.hz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class indexController {
    @RequestMapping(value = "/index1",method = RequestMethod.GET)
    public  String info(@ModelAttribute("username") String username){
        System.out.println("username"+username);
        username="666";
        System.out.println("username"+username);
        return "index2";
    }
}
