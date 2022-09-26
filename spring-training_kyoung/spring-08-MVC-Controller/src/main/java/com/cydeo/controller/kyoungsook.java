package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kyoungsook {
    @RequestMapping("/kyoungsook")
    public String getStartPage(){
        return "kyoungsook.html";
    }
}
