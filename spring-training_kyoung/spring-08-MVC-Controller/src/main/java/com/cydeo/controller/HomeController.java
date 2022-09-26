package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

    @RequestMapping("/home")

    public String getHomePAge(){
        return "home.html";
    }

    @RequestMapping   //default  //nothing and /

    public String getHomePAge1(){
        return "home.html";
    }

    @RequestMapping ({"/apple","/orange"})

    public String getHomePAge2(){
        return "home.html";
    }
}
