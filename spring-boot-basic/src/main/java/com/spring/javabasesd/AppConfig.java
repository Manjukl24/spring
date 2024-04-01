package com.spring.javabasesd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
	//bean 
	
	@Bean
	public chinese getChinese() {
		return new Chinese();
	}
	@Bean
	public Indian getIndian() {
		return new Indian();
	}
	@Bean
	public Italian getItalian() {
		return new Italian();
	}
	@Bean
	public Waiter getIndian() {
		Waiter waiter = new Waiter();
		waiter.setMenu getIndian();
		return waiter;
	}
}
