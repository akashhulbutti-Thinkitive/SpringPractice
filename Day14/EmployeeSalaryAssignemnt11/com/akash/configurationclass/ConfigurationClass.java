package com.akash.configurationclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.akash.models.Employee;

@Configuration
@ComponentScan("com.akash.models")
public class ConfigurationClass {

	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployeeBean() {
		return new Employee(123,"Neo James",13300);
	}
}
