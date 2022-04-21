package com.course.api.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Car;
import com.course.service.CarService;

@RestController
@RequestMapping("/api/car")
public class CarApi {

	@Autowired
	private CarService carService;
	
	@GetMapping("/random")
	public Car random() {
		return carService.generateCar();
	}
	
	
}
