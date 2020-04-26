package com.iamvickyav.MVCSample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/test")
    String display1(){
        return "demo";
    }

    @RequestMapping("/test2")
    ModelAndView displayName(@RequestParam("name") String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", 30);
        modelAndView.addObject("gender", "Female");
        modelAndView.addObject("country", "US");
        modelAndView.setViewName("venki");

        return modelAndView;
    }
}
