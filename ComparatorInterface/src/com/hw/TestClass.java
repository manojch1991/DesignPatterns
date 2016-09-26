package com.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.test.TestUnit;

public class TestClass {
	public static void main(String[] args) {
		ArrayList<Cars> carList = new ArrayList<Cars>();
		TestUnit t = new TestUnit();
		t.testMileage();
		t.testName();
		t.testPrice();
		t.testDominate();

		carList.add(new Cars("Maruti", 30, 500000, 2010, "Red"));
		carList.add(new Cars("Hyundai", 27, 350000, 2013, "Blue"));
		carList.add(new Cars("Fiat", 22, 450000, 2005, "While"));
		carList.add(new Cars("Toyota", 24, 750000, 2011, "Grey"));
		carList.add(new Cars("Honda", 32, 370000, 2007, "Green"));
		carList.add(new Cars("Chevrolet", 25, 550000, 2003, "Black"));
		carList.add(new Cars("Skoda", 25, 650000, 2012, "GreenYellow"));
		carList.add(new Cars("Mercedes", 20, 1000000, 2008, "Yellow"));

		System.out.println("=============================================");
		System.out.println("Without sorting...");
		System.out.println("=============================================");

		Iterator<Cars> iterator = carList.iterator();
		while (iterator.hasNext()) {
			Cars car = iterator.next();
			System.out.println(car.getCarName() + "-" + car.getYearModel()
					+ "-" + car.getColor() + "-" + car.getMileage() + "-"
					+ car.getPrice());
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("Sorting By Name...");
		System.out.println("=============================================");

		Collections.sort(carList, new NameCompare());
		iterator = carList.iterator();
		while (iterator.hasNext()) {
			Cars car = iterator.next();
			System.out.println(car.getCarName() + "-" + car.getYearModel()
					+ "-" + car.getColor() + "-" + car.getMileage() + "-"
					+ car.getPrice());
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("Sorting By Mileage...");
		System.out.println("=============================================");

		Collections.sort(carList, new MileageCompare());
		iterator = carList.iterator();
		while (iterator.hasNext()) {
			Cars car = iterator.next();
			System.out.println(car.getMileage() + "-" + car.getCarName() + "-"
					+ car.getYearModel() + "-" + car.getColor() + "-"
					+ car.getPrice());
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("Sorting By Price...");
		System.out.println("=============================================");

		Collections.sort(carList, new PriceCompare());
		iterator = carList.iterator();
		while (iterator.hasNext()) {
			Cars car = iterator.next();
			System.out.println(car.getPrice() + "-" + car.getCarName() + "-"
					+ car.getYearModel() + "-" + car.getColor() + "-"
					+ car.getMileage());
		}

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("Sorting By Dominate...");
		System.out.println("=============================================");

		Collections.sort(carList, new DominateCompare());
		iterator = carList.iterator();
		while (iterator.hasNext()) {
			Cars car = iterator.next();
			System.out.println( car.getDominateCount() + "-" + car.getCarName()
					+ "-" + car.getColor() + "-" + car.getMileage() + "-"
					+ car.getYearModel() + "-" + car.getPrice());
		}
	}
}
