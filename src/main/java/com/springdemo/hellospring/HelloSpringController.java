package com.springdemo.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloSpringController {

    @RequestMapping
    public ModelAndView helloSpring() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("helloSpring.html");
        return modelAndView;
    }

    @RequestMapping("/goodbye")
    public ModelAndView goodbyeSpring() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("goodbyeSpring.html");
        return modelAndView;
    }
}
