package com.example.crudApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity https) throws Exception {
        return https.authorizeHttpRequests(auth -> auth
            .requestMatchers("/").permitAll()
            .requestMatchers("/Employees/**").permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .defaultSuccessUrl("/",true)
        )
        .logout(config -> config.logoutSuccessUrl("/"))
        .build();
    }
}
