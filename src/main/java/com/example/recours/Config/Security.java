package com.example.recours.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.recours.Service.CustomUserDetailsService;



@Configuration
public class Security  {

    @Bean
    public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                // .authorizeRequests(authorize -> authorize
                //         .anyRequest().authenticated()
                // )
                .httpBasic(withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(
                        auth ->
                                auth
                                    //    .requestMatchers("/h2-console","/h2-console/*","/api/auth/login").permitAll()
                                    //    .anyRequest().authenticated()
                                        .anyRequest().permitAll()
                )
                .headers((headers) -> {
                        headers.frameOptions(frame -> frame.disable());
                })
                // .cors(
                //     cors -> cors.disable()
                // )
                ;
        return http.build();
    }

    // @Bean
    // public WebMvcConfigurer corsConfigurer() {
    //     return new WebMvcConfigurer() {
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             registry.addMapping("/**").allowedOriginPatterns("http://127.0.0.1*","http://localhost*");
    //             // registry.addMapping("/verify").allowedOrigins("*").allowedMethods("*");
    //             // registry.addMapping("/**")
    //             // .allowedOrigins("*")
    //             // .allowedMethods("*")
    //             // .allowedHeaders("*")
    //             // .exposedHeaders("*");
    //         }
    //     };
    // }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
}