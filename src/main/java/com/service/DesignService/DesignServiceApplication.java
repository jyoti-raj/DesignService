package com.service.DesignService;

import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignServiceApplication.class, args);
		
		//predicate
		Predicate<String> checkLength = num -> num.length() > 5;
		System.out.println("length of string is greater than 5: " + checkLength.test("Hello world"));
		
		//predicate joining
		Predicate<String> checkEven = num -> num.length() % 2 == 0;
		System.out.println("after merging with AND : " + checkLength.and(checkEven).test("Hello world"));
		System.out.println("after merging with OR : " + checkLength.or(checkEven).test("Hello world"));
		System.out.print("after merging with NEGATE : " + checkLength.negate().test("Hello world"));
		
		//Function
		Function<Integer, Integer> square = i -> i*i;
		System.out.println("Square of 2 is :" + square.apply(2));
		
		//Function Chaining
		Function<Integer, Integer> cube = i -> i*i*i;
		System.out.println("first Square using apply :" + square.andThen(cube).apply(2));
		
	}

}
