package com.spring_security.authenticate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http)
     {
             http.authorizeHttpRequests(

                     req->{
                         req.requestMatchers("/api/v1/welcome/hi","/api/v1/welcome/hello").permitAll().anyRequest().authenticated();
                     }

             );
             return http.build();
     }








}
