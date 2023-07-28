package com.example.baekgu_project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.baekgu_project.service.CommunityWriteService;


@Controller
@RequestMapping("/commuWrite")
public class CommunityWriteController {
    @Autowired
    CommunityWriteService communityWriteService;

    // /selectDetail/LW-01
    @GetMapping("/selectDetail/{COMWRITE_ID}")
    public ResponseEntity selectDetail(@PathVariable String COMWRITE_ID) {
        Object result = communityWriteService.selectDetail(COMWRITE_ID);
        return ResponseEntity.ok().body(result);
    }

    // create
    // @PostMapping("/insert")
    // public ResponseEntity insert(@RequestParam Map paramMap) {
    // Object result = communityWriteService.insert(paramMap);
    // return ResponseEntity.ok().body(result);
    // }
    // insert 완료 후 ↓

    // /insertAndView/LW-06
    @GetMapping("/insertAndView")
    public ModelAndView insertAndView(@RequestParam Map params,
            ModelAndView modelAndView) {
                String UNIQUE_ID = "CrimsonPhoenix22";
        Object result = communityWriteService.insertAndView(UNIQUE_ID, params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);

        modelAndView.setViewName("/WEB-INF/views/community/community.jsp");
        return modelAndView;
    }

    @GetMapping("/insertForm")
    public ModelAndView insertForm(@RequestParam Map params,
            ModelAndView modelAndView) {
   
        modelAndView.addObject("params", params);
        modelAndView.setViewName("/WEB-INF/views/community/community_write.jsp");
        return modelAndView;
    }

    // update
    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Map paramMap) {
        Object result = communityWriteService.update(paramMap);
        return ResponseEntity.ok().body(result);
    }

    // delete with MVC
    @PostMapping("/delete")
    public ModelAndView delete(@RequestParam Map params, ModelAndView modelAndView) {
        Object result = communityWriteService.delete(params);
        modelAndView.addObject("params", params);
        modelAndView.setViewName("/WEB-INF/views/community/community_write.jsp");
        return modelAndView;
    }

    // /selectAll/LW-01
    @GetMapping("/selectAll/{COMWRITE_ID}")
    public ResponseEntity selectAll(@PathVariable String COMWRITE_ID) {
        Object result = communityWriteService.selectAll(COMWRITE_ID);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/selectInUID")
    public ResponseEntity selectInUID(@RequestBody Map paramMap) {
        Object result = null;
        try {
            result = communityWriteService.selectInUID(paramMap);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.ok().body(result);
    }

    // UUID
    // public void settingUUID(String uuidString) {
    //     try {
    //         // UUID 문자열을 파싱하여 UUID 객체 얻기
    //         UUID uuid = UUID.fromString(uuidString);

    //         // 얻어진 UUID 확인
    //         System.out.println("파싱된 UUID: " + uuid.toString());
    //     } catch (IllegalArgumentException e) {
    //         System.out.println("유효하지 않은 UUID 문자열입니다: "+ uuidString);
    //     }
    // }

     @GetMapping("/insertList")
    public ResponseEntity<Object> insertList(@PathVariable String COMWRITE_ID, 
                            @PathVariable String WRITINGGROUP_NAME, @PathVariable String TITLE, 
                            @PathVariable String CONTENT,@PathVariable String MEMBER_ID,
                            @PathVariable String DATEOFPREPARATION) {
        // (#{COMWRITE_ID}, #{WRITINGGROUP_NAME}, #{TITLE}, #{CONTENT}, #{MEMBER_ID}, NOW())
        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();
        resultMap.put("COMWRITE_ID", "LW-15");
        resultMap.put("WRITINGGROUP_NAME", "기타");
        resultMap.put("TITLE", "햄스터 집 확장 도와주세요");
        resultMap.put("CONTENT", "우리 햄찌는 언제 시원한 집에 살까..");
        resultMap.put("MEMBER_ID", "M-09");
        resultMap.put("DATEOFPREPARATION", NOW());

        return ResponseEntity.ok().body(arrayList);
    }

    private Object NOW() {
        return null;
    }

}
