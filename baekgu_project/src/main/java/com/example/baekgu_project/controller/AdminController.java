package com.example.baekgu_project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.service.AdminService;

@Controller
@RequestMapping({ "/admin" })
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin_main")
    public ModelAndView adminMain(@RequestParam Map params, ModelAndView modelAndView) {

        try {

            Object result = adminService.selectAllMember(params);

            modelAndView.addObject("params", params);
            modelAndView.addObject("result", result);
            modelAndView.setViewName("/WEB-INF/views/admin/admin_main.jsp");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

        return modelAndView;

    }

    @GetMapping("/search")
    public ModelAndView memberSearch(@RequestParam Map params, ModelAndView modelAndView) {
        try {

            Object result = adminService.selectSearch(params);
            
            modelAndView.addObject("params", params);
            modelAndView.addObject("result", result);
            modelAndView.setViewName("/WEB-INF/views/admin/admin_main_select.jsp");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelAndView;
    }

}
