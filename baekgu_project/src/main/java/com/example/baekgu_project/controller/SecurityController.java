package com.example.baekgu_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController
{

    @GetMapping({"/loginPage"})
    public ModelAndView loginPage(ModelAndView modelAndView)
    {
        String viewName = "/WEB-INF/views/security/login.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}