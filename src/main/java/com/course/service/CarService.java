package com.course.service;

import java.util.List;

import com.course.entity.Car;

public interface CarService {

	List <String> brands = List.of("Toyota","Honda","Ford"); 
	List <String> colors = List.of("Red","Black","White");
	List <String> types = List.of("Sedan","SUV","MPV");
	
	public Car generateCar();
}
