package com.springSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
 @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
         .csrf().disable()
         .authorizeRequests().anyRequest().authenticated()
         .and()
         .httpBasic();
    } 
	
// disable below method to enable property file features vice-versa can also be done
 @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
    {
    	
   // can be authenticated from database using jdbc or backend ldap
   // here we are using in memory database authentication  	
    	
    	//auth.jdbcAuthentication();
    	//auth.ldapAuthentication();
    	
        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
    } 
}