package com.example.baekgu_project.restapis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.baekgu_project.service.CommonService;

@RestController
@RequestMapping("/rest/commonsCode")
public class CommonsCodeRestController
{
    @Autowired
    CommonService commonService;

    @GetMapping("/selectByUID/{UNIQUE_ID}")
    public ResponseEntity selectByUID(@PathVariable String UNIQUE_ID, @RequestBody Map paramMap)
    {
        Map result = null;
        try {
            result = new HashMap<>();
            result.put("TITLE","like TITLE");
            result.put("UNIQUE_ID","like UNQUE_ID");

        } catch (Exception e)
        {
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.ok().body(result);
    }
}
