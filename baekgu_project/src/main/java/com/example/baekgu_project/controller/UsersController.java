package com.example.baekgu_project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.service.UsersService;


@Controller
public class UsersController
{

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView registerForm(ModelAndView modelAndView)
    {
        String viewName = "/WEB-INF/views/security/register.jsp";

        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @RequestMapping(value = "/joinProc", method = RequestMethod.POST)
    public ModelAndView joinProc(@RequestParam Map params, ModelAndView modelAndView)
    {
        Object result = usersService.insertWithAuths(params);
        String viewName = "/WEB-INF/views/main.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}