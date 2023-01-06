package com.example;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.beanExample.Book;
import com.example.beanExample.Person;

@Configuration
public class AppConfiguration {
	
	@Bean
	@Scope("prototype")
	public String greeting() {
		return "Hello, world";
	}
	
	@Bean
	@Scope("prototype")
	public LocalTime time() {
		return LocalTime.now();
	}
	
	@Bean
	@Scope("prototype")
	public Person person() {
		return new Person("Iqra", 21);
	}
	
	@Bean
	@Scope("prototype")
	public Book book() {
		return new Book(101, "Coder", 121, "Laurie Lee", 5);
	}
}
