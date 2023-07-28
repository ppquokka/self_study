package com.example.baekgu_project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.baekgu_project.dao.SharedDao;
import com.example.baekgu_project.dao.UserDao;
import com.example.baekgu_project.utils.Commons;

@Service
@Transactional
public class CommunityWriteService {
    @Autowired
    SharedDao sharedDao;
    @Autowired
    Commons commons;
    @Autowired
    CommunityService communityService;
    
    // 상세
    public Object selectDetail(String COMWRITE_ID) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommunityWrite.selectByUID_CW";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMWRITE_ID", COMWRITE_ID);
        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }

    // 입력
    public Object insert(Map dataMap) {
        String sqlMapId = "CommunityWrite.insert_CW";
        dataMap.put("MEMBER_ID", "M-10");
        dataMap.put("WRITINGGROUP_NAME", "병원");
        dataMap.put("COMWRITE_ID", commons.getUniqueSequence());
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    // update
    public Object update(Map dataMap) {
        String sqlMapId = "CommunityWrite.update_CW";
        Object result = sharedDao.update(sqlMapId, dataMap);
        return result;
    }

     // (delete) MVC view
    public Object delete(Map dataMap) {
        String sqlMapId = "CommunityWrite.delete_CW";
        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }

    // (delete) rest api
    public Object delete(String COMWRITE_ID) {
        String sqlMapId = "CommunityWrite.delete_CW";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMWRITE_ID", COMWRITE_ID);

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }

    // 전체
    public Object selectAll(String COMWRITE_ID) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommunityWrite.selectAll_CW";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMWRITE_ID", COMWRITE_ID);
        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }

    // foreach HashMap.put("COMWRITE_ID_LIST", COMWRITE_ID_LIST)
    public Object selectInUID(Map dataMap) {
        String sqlMapId = "CommunityWrite.selectInUID_CW";
        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Map insertAndView(String uNIQUE_ID, Map dataMap) {
        String sqlMapId = "CommunityWrite.insertAndView_CW";
        HashMap result = new HashMap<>();
        this.insert(dataMap);
        result.putAll(communityService.selectSearchWithPagination(dataMap));
        return result;
    }  

    // // 'getUserID' 로그인 사용자(ID)얻기 : DB에서 사용자 ID 가져오기
    // public UserService(UserDao userDao) {
    //     this.userDao = userDao;
    // }

    // public String getUserID(String username) {
    //     // UserDao를 통해 데이터베이스에서 사용자 정보를 조회하여 사용자 ID를 얻어옴
    //     User user = userDao.getUserByUsername(username);
        
    //     if (user != null) {
    //         return user.getId(); // 사용자 ID 반환
    //     } else {
    //         return null; // 사용자가 존재하지 않을 경우 null 반환
    //     }
    // }
   
}
