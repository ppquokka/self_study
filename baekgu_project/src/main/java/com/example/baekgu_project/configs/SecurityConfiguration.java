package com.example.baekgu_project.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration
{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.csrf().disable();
        httpSecurity.authorizeHttpRequests()
                .requestMatchers("/admin*").hasRole("ADMIN")
                .requestMatchers("/manager*").hasAnyRole("ADMIN", "MANAGER")
                .requestMatchers("/community/community_write").authenticated()
                .anyRequest().permitAll();
        httpSecurity.formLogin(login -> login.loginPage("/loginPage")
                .failureUrl("/loginPage?fail=true")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/"));
        httpSecurity.logout(logout -> logout
                .logoutSuccessUrl("/main")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID"));
        httpSecurity.exceptionHandling()
                .accessDeniedPage("/home");

        return httpSecurity.build();
    }

    @Bean
    public BCryptPasswordEncoder encoderPasswordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

}
