package com.codenation.centralerros.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/users").authenticated()
                .antMatchers(HttpMethod.GET, "/users").authenticated()
                .antMatchers(HttpMethod.POST, "/log").authenticated()
                .antMatchers(HttpMethod.GET, "/log").authenticated()
                .antMatchers("/oauth/token").permitAll()
        ;
    }
}
