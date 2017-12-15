package com.boraji.tutorial.springboot.configuration;

import com.boraji.tutorial.springboot.entity.postgresql.User;
import com.boraji.tutorial.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.List;

@Configuration
public class AuthConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private UsersService usersService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/user/**").hasAnyRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/loginpg")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        List<User> user = usersService.getAll();
        for (int i=0; i<user.size();i++)
        {
            auth.inMemoryAuthentication()
                    .withUser(user.get(i).getUsername()).password(user.get(i).getPassword()).roles("USER"); // ... etc.
        }
    }

}
