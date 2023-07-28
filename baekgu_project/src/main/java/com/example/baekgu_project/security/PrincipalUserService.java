package com.example.baekgu_project.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.baekgu_project.service.UsersService;

@Service
public class PrincipalUserService implements UserDetailsService
{

    @Autowired
    UsersService usersService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Map dataMap = new HashMap<>();
        dataMap.put("ID", username);
        Object usernameObj = username;
        Map resultMap = (Map) usersService.selectByUIDWithAuths(dataMap);

        PrincipalUser principalUser = new PrincipalUser(resultMap);

        return principalUser;
    }
    
}
