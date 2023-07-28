package com.example.baekgu_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.baekgu_project.dao.SharedDao;
import com.example.baekgu_project.utils.Commons;

@Service
@Transactional
public class UsersService{


    @Autowired
    SharedDao sharedDao;

    @Autowired
    Commons commonUtils;

    @Autowired
    AuthsService authsService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    // 회원 가입
    public Object insert(Map dataMap)
    {
        // password 암호화 
        String pw = (String) dataMap.get("PW");        
        dataMap.put("PW", bCryptPasswordEncoder.encode(pw));

        String sqlMapId = "Member.create";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object insertWithAuths(Map dataMap)
    {
        Object result = this.insert(dataMap);
        result = authsService.insert(dataMap);
        return result;
    }

    public Object selectByUID(Map dataMap)
    {
        String sqlMapId = "Member.selectByUID";

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object selectByUIDWithAuths(Map dataMap)
    {
        Map result = (Map) this.selectByUID(dataMap);
        result.putAll(authsService.selectWithMemberName(dataMap));
        return result;
    }

}