package com.example.spsec.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                //.authorizeHttpRequests(auth->auth.anyRequest().permitAll())// allow all req without auth
                //.authorizeHttpRequests(auth->auth.anyRequest().authenticated())//protect all reqs


                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/hello","/signup").permitAll()
                        .anyRequest().authenticated())  //allow hello endpoint without authencation and any other req should be protected

                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .csrf(csrf-> csrf.disable());//helps to modify data without requiring the csrf token

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user1=User
                .withUsername("Mamatha")
                .password("{noop}5678")
                .roles("USER")
                .build();

        UserDetails user2=User
                .withUsername("Rishitha")
                .password("{noop}12345")
                .roles("USER")
                .build();

    /*UserDetails user3=User
            .withUsername("Rishitha")
            .password("{noop}12345")
            .roles("USER")
            .build();*/
        return new InMemoryUserDetailsManager(user1,user2);
    }
}