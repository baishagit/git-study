package com.baisha.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/myNoteBook").hasRole("user");
        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/userlogin")
                .successForwardUrl("/mybookpage");
        http.logout().logoutSuccessUrl("/");
        http.rememberMe().key("remeber");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .mvcMatchers("/css/**","**.js");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //在内存中存一个用户信息
        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("user","admin");
    }
}
