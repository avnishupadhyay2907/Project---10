package com.rays.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 👇 sabhi endpoints ko allow kar diya hai
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/**").permitAll()   // allow everything
            .anyRequest().permitAll()
            .and()
            .headers().frameOptions().disable(); // For H2 console (if needed)
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 👇 dummy authentication (bypass for testing)
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 👇 password encode/verify off kar diya (testing ke liye)
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
