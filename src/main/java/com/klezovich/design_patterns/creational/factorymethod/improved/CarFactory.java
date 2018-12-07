package com.klezovich.design_patterns.creational.factorymethod.improved;

public class CarFactory extends TransportFactory{
	Transport create() {
		return new Car();
	}
}
