package com.santosh.springqualifier.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "fulltime")
    public Project fulltimeProject(){
        return new FulltimeProject();
    }

    @Bean(name = "hourly")
    public Project hourlyProject(){
        return new HourlyProject();
    }

    @Bean(name = "research")
    public Project researchProject(){
        return new ResearchProject();
    }
}
