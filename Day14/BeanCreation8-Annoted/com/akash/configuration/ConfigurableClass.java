package com.akash.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.akash.models.Employee;

@Configuration
public class ConfigurableClass {

	
	 	@Bean
	 	@Scope(scopeName = "prototype")
	 	public Employee getEmployeeBean() {
		return new Employee(33,"kjvbd",89000);
	}
}
