package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;

@Component("Audi")
public class Audi implements Car {
	
	@Autowired
	@Qualifier("V8")
	Engine engine;
	
	public String spec() {
		System.out.println("This car has " + engine.spec() + " engine");
		return engine.spec();
	}

}
