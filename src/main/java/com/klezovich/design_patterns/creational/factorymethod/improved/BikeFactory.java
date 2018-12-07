package com.klezovich.design_patterns.creational.factorymethod.improved;

public class BikeFactory extends TransportFactory{
	Transport create() {
		return new Bike();
	}
}
