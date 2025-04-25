package com.sarada.application;

import com.sarada.designpatterns.CreationalPattern.AbstractDesignPattern.*;
import com.sarada.designpatterns.CreationalPattern.FactoryDesignPattern.*;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.Circle;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.Shape;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.ShapeClient;
import com.sarada.designpatterns.CreationalPattern.SingletonPattern.SingleTon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "com.sarada.entity")
//@EnableJpaRepositories(basePackages = "com.sarada.repository")
//@ComponentScan("com.sarada")
public class DesignPatternApp {

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternApp.class, args);
		//Factory Design Pattern
		VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
		Customer twoWheelerClient = new Customer(twoWheelerFactory);
		Vehicle twoWheeler = twoWheelerClient.getVehicle();
		twoWheeler.printVehicle();

		VehicleFactory fourWheelerFactory = new FourWheelerFactory();
		Customer fourWheelerClient = new Customer(fourWheelerFactory);
		Vehicle fourWheeler = fourWheelerClient.getVehicle();
		fourWheeler.printVehicle();

		//Abstract Design Pattern
		// Creating cars for North America
		CarFactory northAmericaFactory = new NorthAmericaCarFactory();
		Car northAmericaCar = northAmericaFactory.createCar();
		CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

		northAmericaCar.assemble();
		northAmericaSpec.display();

		// Creating cars for Europe
		CarFactory europeFactory = new EuropeCarFactory();
		Car europeCar = europeFactory.createCar();
		CarSpecification europeSpec = europeFactory.createSpecification();

		europeCar.assemble();
		europeSpec.display();

		// SingleTon Design Pattern
        SingleTon.getInstance();
        SingleTon.doSomething();

		// Prototype Design Pattern
		// Create a concrete prototype (a red circle).
		Shape circlePrototype = new Circle("red");

		// Create a client and give it the prototype.
		ShapeClient client = new ShapeClient(circlePrototype);

		// Use the prototype to create a new shape (a red circle).
		Shape redCircle = client.createShape();

		// Draw the newly created red circle.
		redCircle.draw();
	}

}
