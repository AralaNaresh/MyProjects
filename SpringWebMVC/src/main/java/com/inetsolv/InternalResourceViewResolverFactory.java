package com.inetsolv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class InternalResourceViewResolverFactory {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		
		 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		 
		 viewResolver.setPrefix("/WEB-INF/");
		 viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}

}
