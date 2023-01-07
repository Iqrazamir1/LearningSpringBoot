package com.example.cars;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.interfaces.Car;

@Component("BMW")
public class BMW implements Car {
	
	@Autowired
	@Qualifier("V6")
	Engine engine;
	
	public String spec() {
		System.out.println("This car has " + engine.spec() + " engine");
		return engine.spec();
	}
	
}
