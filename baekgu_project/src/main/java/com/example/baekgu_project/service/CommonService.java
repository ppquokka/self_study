package com.example.baekgu_project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.baekgu_project.dao.SharedDao;

@Service
@Transactional
public class CommonService {
    @Autowired
    SharedDao sharedDao;
    
    // foreach HashMap.put("COMMON_CODE_ID_LIST", COMMON_CODE_ID_LIST)
    public Object selectInUID(Map dataMap) {
        String sqlMapId = "PetDiary.selectInUID";

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Map selectSearch(Map dataMap) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommonsCode.selectSearch";
        
        HashMap result = new HashMap<>();
        result.put("resultList", sharedDao.getList(sqlMapId, dataMap));
        return result;
    }

    // 검색(조건-search : NAME, COMMON_CODE_ID)
    public Object selectSearch(String search, String words) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommonsCode.selectSearch";
        HashMap dataMap = new HashMap<>();
        dataMap.put("search", search);
        dataMap.put("words", words);

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }


    // 전체
    public Object selectAll(String COMMON_CODE_ID) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommonsCode.selectAll";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMMON_CODE_ID", COMMON_CODE_ID);

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }

    // 상세
    public Object selectDetail(String COMMON_CODE_ID) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommonsCode.selectByUID";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMMON_CODE_ID", COMMON_CODE_ID);

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object selectDetail(String COMMON_CODE_ID, Map dataMap) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CommonsCode.selectByUID";
        dataMap.put("COMMON_CODE_ID", COMMON_CODE_ID);

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }

    // 입력
    public Object insert(Map dataMap) {
        String sqlMapId = "CommonsCode.insert";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    // update
    public Object update(Map dataMap) {
        String sqlMapId = "CommonsCode.update";
        Object result = sharedDao.update(sqlMapId, dataMap);
        return result;
    }


    // (delete) MVC view
    public Object delete(Map dataMap) {
        String sqlMapId = "CommonsCode.delete";

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }

    // (delete) MVC view
    public Object deleteAndSelectSearch(String UNIQUE_ID, Map dataMap) {
        dataMap.put("COMMON_CODE_ID", UNIQUE_ID);

        HashMap result = new HashMap<>();
        result.put("deleteCount", this.delete(dataMap));

        result.putAll(this.selectSearch(dataMap));
        return result;
    }

    // rest api
    public Object delete(String COMMON_CODE_ID) {
        String sqlMapId = "CommonsCode.delete";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMMON_CODE_ID", COMMON_CODE_ID);

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }

    // 2PC(2 pace commit) : 같은 값 인서트 2번
    public Object insertDouble(Map dataMap) {
        String sqlMapId = "CommonsCode.insert";
        // sucess
        Object result = sharedDao.insert(sqlMapId, dataMap);
        // error
        result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }
}
