package com.example.baekgu_project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.service.CommunityService;

@Controller
@RequestMapping("/community")
public class CommunityController
{
    @Autowired
    CommunityService communityService;

    @GetMapping("/communityDetail")
    public ModelAndView selectDetail(@RequestParam Map params, ModelAndView modelAndView)
    {
        Object result = communityService.selectSearchWithPagination(params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        
        modelAndView.setViewName("/WEB-INF/views/community/community.jsp");
        return modelAndView;
    }

    @GetMapping({"/communityList", "/communityList/{currentPage}"}) 
    public ModelAndView selectSearch(@PathVariable(required=false) String currentPage, @RequestParam Map params, ModelAndView modelAndView)
    {
        if (currentPage == null)
        {
            currentPage = "1";
        }
        params.put("currentPage", currentPage);
        Object result = communityService.selectSearchWithPagination(params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        
        modelAndView.setViewName("/WEB-INF/views/community/community.jsp");
        return modelAndView;
    }
}
