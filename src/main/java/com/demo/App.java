package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.data.provider.SearchObjectProvider;

/**
 * Hello world!
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {
	
	@Bean
	public SearchObjectProvider searchObjectPro() {
		SearchObjectProvider sop = new SearchObjectProvider();
		return sop;
		
	}
	
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
