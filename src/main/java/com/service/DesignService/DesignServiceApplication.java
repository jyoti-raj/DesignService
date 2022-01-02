package com.service.DesignService;

import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignServiceApplication.class, args);
		
		//Function
		Function<Integer, Integer> square = i -> i*i;
		System.out.println("Square of 2 is :" + square.apply(2));
		
		//Function Chaning
		Function<Integer, Integer> cube = i -> i*i*i;
		System.out.println("first Square using apply :" + square.andThen(cube).apply(2));
		
	}

}
