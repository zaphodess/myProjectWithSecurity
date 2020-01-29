package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	       .authorizeRequests()
	          // .anyRequest().authenticated()
	        //    .and()
	    
	    .antMatchers("/avengers/assemble").hasRole("HERO")
	    .antMatchers("/secret-bases").hasRole("DIRECTOR")
	    .and()
	    
	    
	        .formLogin()
	            .and()
	        .httpBasic();
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    
		auth.inMemoryAuthentication().withUser("user").password("password").roles("");
	

	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	auth.inMemoryAuthentication().withUser("user").password(encoder.encode("password")).roles("");
	
	auth.inMemoryAuthentication()
    .withUser("user")
        .password(encoder.encode("password"))
        .roles("")
        .and()
    .withUser("admin")
        .password(encoder.encode("12345678"))
        .roles("ADMIN")
	.and()
	
	.withUser("steve")
    .password(encoder.encode("guy"))
    .roles("HERO")
	.and()
	
	.withUser("tony")
    .password(encoder.encode("stark"))
    .roles("HERO")
	.and()
	
	.withUser("nick")
    .password(encoder.encode("fury"))
    .roles("DIRECTOR")
    .and()
    
    .withUser("moni")
    .password(encoder.encode("zaphodess"))
    .roles("DIRECTOR", "HERO")
    
    ;

}
}
