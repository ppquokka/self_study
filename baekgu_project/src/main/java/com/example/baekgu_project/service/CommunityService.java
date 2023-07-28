package com.example.baekgu_project.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.baekgu_project.dao.SharedDao;
import com.example.baekgu_project.utils.Paginations;

@Service
@Transactional
public class CommunityService
{
    @Autowired
    SharedDao sharedDao;

    public Map selectSearch(Map dataMap)
    {
        String sqlMapId = "Community.selectSearch";
        
        HashMap result = new HashMap<>();
        result.put("resultList", sharedDao.getList(sqlMapId, dataMap));
        return result;
    }
    

    public Map selectSearchWithPagination(Map dataMap)
    {
        int totalCount = (int) this.selectTotal(dataMap);
        
        int currentPage = 1;
        if(dataMap.get("currentPage") != null)
        {
            currentPage = Integer.parseInt((String)dataMap.get("currentPage"));
        }

        Paginations paginations = new Paginations(totalCount, currentPage);
        HashMap result = new HashMap<>();
        result.put("paginations", paginations);

        String sqlMapId = "Community.selectSearchWithPagination";
        dataMap.put("pageScale", paginations.getPageScale());
        dataMap.put("pageBegin", paginations.getPageBegin());
        
        result.put("resultList", sharedDao.getList(sqlMapId, dataMap));
        return result;
    }

    
    public Object selectTotal(Map dataMap)
    {
        String sqlMapId = "Community.selectTotal";

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }    
}
