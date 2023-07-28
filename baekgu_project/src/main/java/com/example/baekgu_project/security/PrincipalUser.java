package com.example.baekgu_project.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class PrincipalUser implements UserDetails
{

    Map userInfo;

    public PrincipalUser(Map userInfo)
    {
        this.userInfo = userInfo;
    }

    public String getMemberName()
    {
        return (String) userInfo.get("NAME");
    }

    public String getmemberEmail()
    {
        return (String) userInfo.get("EMAIL");
    }

    public String getmemberBirth()
    {
        return (String) userInfo.get("BIRTHDATE");
    }

    public String getmemberPhone()
    {
        return (String) userInfo.get("PHONENUM");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        Collection<GrantedAuthority> collections = new ArrayList<>();
        List<Map<String, Object>> resultList = (List) userInfo.get("resultList");
        for(Map item: resultList)
        {
            collections.add(new SimpleGrantedAuthority((String) item.get("ID")));
        }
        return collections;
    }

    @Override
    public String getPassword()
    {
        return (String) userInfo.get("PW");
    }

    @Override
    public String getUsername()
    {
        return (String) userInfo.get("ID");
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return true;
    }
}
