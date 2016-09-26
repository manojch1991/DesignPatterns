package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.hw.Cars;
import com.hw.DominateCompare;
import com.hw.MileageCompare;
import com.hw.NameCompare;
import com.hw.PriceCompare;

public class TestUnit {

	ArrayList<Cars> carList = new ArrayList<Cars>();
	Iterator<Cars> iterator1 = carList.iterator();
	Iterator<Cars> iterator2 = carList.iterator();
	
	@Test
	public void testMileage() {
		carList.add(new Cars("Maruti", 30, 500000, 2010, "Red"));
		carList.add(new Cars("Hyundai", 27, 350000, 2013, "Blue"));
		carList.add(new Cars("Fiat", 22, 450000, 2005, "While"));
		carList.add(new Cars("Toyota", 24, 750000, 2011, "Grey"));
		carList.add(new Cars("Honda", 32, 370000, 2007, "Green"));
		carList.add(new Cars("Chevrolet", 25, 550000, 2003, "Black"));
		carList.add(new Cars("Skoda", 25, 650000, 2012, "GreenYellow"));
		carList.add(new Cars("Mercedes", 20, 1000000, 2008, "Yellow"));
		
		Collections.sort(carList, new MileageCompare());

		iterator1 = carList.iterator();
		iterator2 = carList.iterator();

		while (iterator1.hasNext() && iterator2.hasNext()) {
			Cars car1 = iterator1.next();
			Cars car2 = iterator2.next();
			Assert.assertThat(car2, CoreMatchers.is(car2));
		}
	}
	
	@Test
	public void testName() {
		carList.add(new Cars("Maruti", 30, 500000, 2010, "Red"));
		carList.add(new Cars("Hyundai", 27, 350000, 2013, "Blue"));
		carList.add(new Cars("Fiat", 22, 450000, 2005, "While"));
		carList.add(new Cars("Toyota", 24, 750000, 2011, "Grey"));
		carList.add(new Cars("Honda", 32, 370000, 2007, "Green"));
		carList.add(new Cars("Chevrolet", 25, 550000, 2003, "Black"));
		carList.add(new Cars("Skoda", 25, 650000, 2012, "GreenYellow"));
		carList.add(new Cars("Mercedes", 20, 1000000, 2008, "Yellow"));
		
		Collections.sort(carList, new NameCompare());

		iterator1 = carList.iterator();
		iterator2 = carList.iterator();

		while (iterator1.hasNext() && iterator2.hasNext()) {
			Cars car1 = iterator1.next();
			Cars car2 = iterator2.next();
			Assert.assertThat(car1, CoreMatchers.is(car2));
		}
	}
	
	@Test
	public void testPrice() {
		carList.add(new Cars("Maruti", 30, 500000, 2010, "Red"));
		carList.add(new Cars("Hyundai", 27, 350000, 2013, "Blue"));
		carList.add(new Cars("Fiat", 22, 450000, 2005, "While"));
		carList.add(new Cars("Toyota", 24, 750000, 2011, "Grey"));
		carList.add(new Cars("Honda", 32, 370000, 2007, "Green"));
		carList.add(new Cars("Chevrolet", 25, 550000, 2003, "Black"));
		carList.add(new Cars("Skoda", 25, 650000, 2012, "GreenYellow"));
		carList.add(new Cars("Mercedes", 20, 1000000, 2008, "Yellow"));
		
		Collections.sort(carList, new PriceCompare());

		iterator1 = carList.iterator();
		iterator2 = carList.iterator();

		while (iterator1.hasNext() && iterator2.hasNext()) {
			Cars car1 = iterator1.next();
			Cars car2 = iterator2.next();
			Assert.assertThat(car1, CoreMatchers.is(car2));
		}
	}
	
	@Test
	public void testDominate() {
		carList.add(new Cars("Maruti", 30, 500000, 2010, "Red"));
		carList.add(new Cars("Hyundai", 27, 350000, 2013, "Blue"));
		carList.add(new Cars("Fiat", 22, 450000, 2005, "While"));
		carList.add(new Cars("Toyota", 24, 750000, 2011, "Grey"));
		carList.add(new Cars("Honda", 32, 370000, 2007, "Green"));
		carList.add(new Cars("Chevrolet", 25, 550000, 2003, "Black"));
		carList.add(new Cars("Skoda", 25, 650000, 2012, "GreenYellow"));
		carList.add(new Cars("Mercedes", 20, 1000000, 2008, "Yellow"));
		
		Collections.sort(carList, new DominateCompare());

		iterator1 = carList.iterator();
		iterator2 = carList.iterator();

		while (iterator1.hasNext() && iterator2.hasNext()) {
			Cars car1 = iterator1.next();
			Cars car2 = iterator2.next();
			Assert.assertThat(car1, CoreMatchers.is(car2));
		}
	}
}
