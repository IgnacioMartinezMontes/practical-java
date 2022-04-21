package com.course.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.course.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Override
	public Car generateCar() {
		
		String brand  = brands.get(ThreadLocalRandom.current().nextInt(0,brands.size()));
		String color  = colors.get(ThreadLocalRandom.current().nextInt(0,colors.size()));
		String type  = types.get(ThreadLocalRandom.current().nextInt(0,types.size()));
		
		return new Car(brand,color,type);
	}

}
