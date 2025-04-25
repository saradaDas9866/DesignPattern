package com.sarada.application;

import com.sarada.designpatterns.BehaviouralDesignPattern.observerpattern.Observer;
import com.sarada.designpatterns.BehaviouralDesignPattern.observerpattern.PhoneDisplay;
import com.sarada.designpatterns.BehaviouralDesignPattern.observerpattern.TVDisplay;
import com.sarada.designpatterns.BehaviouralDesignPattern.observerpattern.WeatherStation;
import com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern.BubbleSortStrategy;
import com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern.MergeSortStrategy;
import com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern.QuickSortStrategy;
import com.sarada.designpatterns.BehaviouralDesignPattern.strategydrivenpattern.SortingContext;
import com.sarada.designpatterns.CreationalPattern.AbstractDesignPattern.*;
import com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern.Computer;
import com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern.ComputerDirector;
import com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern.GamingComputerBuilder;
import com.sarada.designpatterns.CreationalPattern.FactoryDesignPattern.*;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.Circle;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.Shape;
import com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern.ShapeClient;
import com.sarada.designpatterns.CreationalPattern.SingletonPattern.SingleTon;
import com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern.*;
import com.sarada.designpatterns.StructuralDesignPattern.adapterdesignpattern.Client;
import com.sarada.designpatterns.StructuralDesignPattern.adapterdesignpattern.PrinterAdapter;
import com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Assemble;
import com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Auto;
import com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Bike;
import com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Produce;
import com.sarada.designpatterns.StructuralDesignPattern.compositedesignpattern.SimpleTask;
import com.sarada.designpatterns.StructuralDesignPattern.compositedesignpattern.TaskList;
import com.sarada.designpatterns.StructuralDesignPattern.decoratordesignpattern.Coffee;
import com.sarada.designpatterns.StructuralDesignPattern.decoratordesignpattern.MilkDecorator;
import com.sarada.designpatterns.StructuralDesignPattern.decoratordesignpattern.PlainCoffee;
import com.sarada.designpatterns.StructuralDesignPattern.decoratordesignpattern.SugarDecorator;
import com.sarada.designpatterns.StructuralDesignPattern.flyweightpattern.Icon;
import com.sarada.designpatterns.StructuralDesignPattern.flyweightpattern.IconFactory;
import com.sarada.designpatterns.StructuralDesignPattern.proxydesignpattern.Image;
import com.sarada.designpatterns.StructuralDesignPattern.proxydesignpattern.ProxyImage;
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

		//Builder Design Pattern
		GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
		ComputerDirector director = new ComputerDirector();

		director.construct(gamingBuilder);
		Computer gamingComputer = gamingBuilder.getResult();

		gamingComputer.displayInfo();

		//AdapterPattern
		// Using the Adapter
		PrinterAdapter adapter = new PrinterAdapter();
		Client c = new Client();
		c.clientCode(adapter);

		//Bridge Pattern
		com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Vehicle vehicle1 = new Auto(new Produce(), new Assemble());
		vehicle1.manufacture();
		com.sarada.designpatterns.StructuralDesignPattern.bridgepattern.Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();

		//Composite Pattern

		// Creating a task list
		TaskList projectTasks = new TaskList("Project Tasks");
		projectTasks.addTask(new SimpleTask("Complete Coding"));
		projectTasks.addTask(new SimpleTask("Write Documentation"));

		// Nested task list
		TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
		phase1Tasks.addTask(new SimpleTask("Design"));
		phase1Tasks.addTask(new SimpleTask("Implementation"));

		projectTasks.addTask(phase1Tasks);

		// Displaying tasks
		projectTasks.display();

		// Decorator Design Pattern
		// Plain Coffee
		Coffee coffee = new PlainCoffee();
		System.out.println("Description: " + coffee.getDescription());
		System.out.println("Cost: $" + coffee.getCost());

		// Coffee with Milk
		Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
		System.out.println("\nDescription: " + milkCoffee.getDescription());
		System.out.println("Cost: $" + milkCoffee.getCost());

		// Coffee with Sugar and Milk
		Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
		System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
		System.out.println("Cost: $" + sugarMilkCoffee.getCost());

		//facade design pattern
		HotelKeeper keeper = new HotelKeeperImplementation();
		VegMenu v = keeper.getVegMenu();
		v.getMenu();
		NonVegMenu nv = keeper.getNonVegMenu();
		nv.getMenu();
		Both b= keeper.getVegNonMenu();
		b.getMenu();

		//Flyweight design pattern
		IconFactory iconFactory = new IconFactory();
		// Draw file icons at different positions
		Icon fileIcon1 = iconFactory.getIcon("file");
		fileIcon1.draw(100, 100);
		Icon fileIcon2 = iconFactory.getIcon("file");
		fileIcon2.draw(150, 150);
		// Draw folder icons at different positions
		Icon folderIcon1 = iconFactory.getIcon("folder");
		folderIcon1.draw(200, 200);
		Icon folderIcon2 = iconFactory.getIcon("folder");
		folderIcon2.draw(250, 250);

		//Proxy Design Pattern
		Image image = new ProxyImage("example.jpg");
		// Image will be loaded from disk only when display() is called
		image.display();
		// Image will not be loaded again, as it has been cached in the Proxy
		image.display();

		// Observer Design Pattern
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay = new PhoneDisplay();
		Observer tvDisplay = new TVDisplay();

		weatherStation.addObserver(phoneDisplay);
		weatherStation.addObserver(tvDisplay);

		// Simulating weather change
		weatherStation.setWeather("Sunny");

		// Strategy Driven Pattern
		// Create SortingContext with BubbleSortStrategy
		SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
		int[] array1 = {5, 2, 9, 1, 5};
		sortingContext.performSort(array1); // Output: Sorting using Bubble Sort

		// Change strategy to MergeSortStrategy
		sortingContext.setSortingStrategy(new MergeSortStrategy());
		int[] array2 = {8, 3, 7, 4, 2};
		sortingContext.performSort(array2); // Output: Sorting using Merge Sort

		// Change strategy to QuickSortStrategy
		sortingContext.setSortingStrategy(new QuickSortStrategy());
		int[] array3 = {6, 1, 3, 9, 5};
		sortingContext.performSort(array3); // Output: Sorting using Quick Sort
	}
}
