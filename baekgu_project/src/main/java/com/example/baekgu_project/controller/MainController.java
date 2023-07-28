package com.example.baekgu_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.utils.Commons;

@Controller
public class MainController
{
    @Autowired
    Commons commons;

    @GetMapping({"/", "/home", "/main"})
    public ModelAndView main(ModelAndView modelAndView)
    {
        String userId = commons.getMemberID();
        modelAndView.setViewName("/WEB-INF/views/main.jsp");
        return modelAndView;
    }
}
