package com.ssafy.ssafit.config;

import javax.sql.DataSource;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages="com.ssafy.ssafit.model.dao")
public class DBConfig {
	
	@Bean
	public DataSource datasource() {
		return DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/ssafit_final?serverTimezone=UTC").username("root").password("ssafy")
				.build();
	}
	

	
}
