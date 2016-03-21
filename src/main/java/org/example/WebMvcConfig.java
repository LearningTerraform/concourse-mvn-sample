package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.microsoft.applicationinsights.web.spring.RequestNameHandlerInterceptorAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new RequestNameHandlerInterceptorAdapter());
  }
}