package com.ssafy.ssafit.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import com.ssafy.ws.interceptor.SessionInterceptor;

@Configuration
@EnableWebMvc	//@EnableWebMvc : 스프링이 제공하는 웹과 관련된 최신 전략 빈들을 등록.
//@EnableWebMvc를 통해 자동 설정되는 빈들의 설정자가  WebMvcConfigurer (기존의 설정을 대신하여 등록함)
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/swagger-ui/**").addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
	}
	
	
//인터셉터 사용시 참고하기
//	@Autowired
//	SessionInterceptor sessionInterceptor;
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(sessionInterceptor).addPathPatterns("/regist");
//	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH");
		}
	
	
}
