package com.hw;

import java.util.Comparator;

public class NameCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Cars car1 = (Cars) o1;
		Cars car2 = (Cars) o2;
		
		return car1.getCarName().compareTo(car2.getCarName());
	}

}
