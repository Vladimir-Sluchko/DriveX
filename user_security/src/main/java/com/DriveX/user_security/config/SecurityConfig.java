package com.DriveX.user_security.config;

import com.DriveX.user_security.controller.filter.JwtFilter;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String PUBLIC_REGISTRATION = "/api/v1/users/registration";
    private static final String PUBLIC_LOGIN = "/api/v1/users/login";
    private static final String AUTHENTICATED = "/api/v1/users/me";
    private static final String AUTH_ADMIN = "/api/v1/users/**";
    private static final String ADMIN = "ADMIN";

    private final JwtFilter filter;
    private final DaoAuthenticationProvider provider;

    public SecurityConfig(JwtFilter filter, DaoAuthenticationProvider provider) {
        this.filter = filter;
        this.provider = provider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(provider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Enable CORS and disable CSRF
        http = http.cors().and().csrf().disable();

        // Set session management to stateless
        http = http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and();

        // Set unauthorized requests exception handler
        http = http
                .exceptionHandling()
                .authenticationEntryPoint(
                        (request, response, ex) -> {
                            response.sendError(
                                    HttpServletResponse.SC_UNAUTHORIZED,
                                    ex.getMessage()
                            );
                        }
                )
                .and();

        // Set permissions on endpoints
        http.authorizeRequests()
                // Our public endpoints
                .antMatchers(PUBLIC_REGISTRATION).permitAll()
                .antMatchers(PUBLIC_LOGIN).permitAll()
                .antMatchers(AUTHENTICATED).authenticated()
                .antMatchers(AUTH_ADMIN).hasAuthority(ADMIN)
                .anyRequest().authenticated();

        // Add JWT token filter
        http.addFilterBefore(
                filter,
                UsernamePasswordAuthenticationFilter.class
        );
    }
}