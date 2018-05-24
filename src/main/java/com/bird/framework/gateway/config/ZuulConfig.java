package com.bird.framework.gateway.config;

import com.bird.framework.gateway.filter.AuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

    @Bean
    public AuthenticationFilter authenticationFilter() {
        return new AuthenticationFilter();
    }
}
