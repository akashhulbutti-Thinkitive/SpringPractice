package com.akash.configurationclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.akash.models.Address;
import com.akash.models.Employee;

@Configuration
@ComponentScan("com.akash.models")
public class ConfigurableClass {

	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployeeBean() {
		return new Employee(23,"Tempo",100000);
	}

	@Bean
	public Address getAddressBean() {
		return new Address(411038, "Pune");
	}
}
