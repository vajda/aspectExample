package com.vajda.aspectExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.vajda.aspectExample.aspect.CustomAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public CustomAspect customAspect() {
        return new CustomAspect();
    }
}
