package com.inetsolv;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebSatter implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
		container.register(MocUtil.class);
		
		DispatcherServlet ds = new DispatcherServlet(container);
		    
		Dynamic dynamic = servletContext.addServlet("ds", ds);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/");
	}

}
