package com.example.baekgu_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.service.CommonService;

@Controller
@RequestMapping("/main")
public class CommonController {
    @Autowired
    CommonService commonService;

    // @GetMapping({ "/login" })
    // public ModelAndView login(ModelAndView modelAndView) {
    //     modelAndView.setViewName("/WEB-INF/views/login/login.jsp");
    //     return modelAndView;
    // }

    @GetMapping({ "/register" })
    public ModelAndView register(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/security/register.jsp");
        return modelAndView;
    }

    @GetMapping({ "/introduce" })
    public ModelAndView introduce(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/introduce.jsp");
        return modelAndView;
    }

    @GetMapping({ "/guide" })
    public ModelAndView guide(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/guide.jsp");
        return modelAndView;
    }

    @GetMapping({ "/community" })
    public ModelAndView community(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/community/community.jsp");
        return modelAndView;
    }

    @GetMapping({ "/community_write" })
    public ModelAndView community_write(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/community/community_write.jsp");
        return modelAndView;
    }

    @GetMapping({ "/myPage" })
    public ModelAndView myPage(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/myPage/myPage.jsp");
        return modelAndView;
    }

    @GetMapping("/statistics")
    public ModelAndView statistics(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/myPage/statistics.jsp");
        return modelAndView;
    }

    @GetMapping("/myNewPet")
    public ModelAndView myNewPet(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/myPage/myNewPet.jsp");
        return modelAndView;
    }

    @GetMapping("/animals")
    public ModelAndView animals(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/animals.jsp");
        return modelAndView;
    }

    @GetMapping("/admin_main")
    public ModelAndView admin_main(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/admin/admin_main.jsp");
        return modelAndView;
    }

    @GetMapping({ "/myAccount" })
    public ModelAndView myAccount(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/myAccount.jsp");
        return modelAndView;
    }
}
