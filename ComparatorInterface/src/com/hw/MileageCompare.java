package com.hw;

import java.util.Comparator;

public class MileageCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cars car1 = (Cars) o1;
		Cars car2 = (Cars) o2;

		if (car1.getMileage() == car2.getMileage())
			return 0;
		else if (car1.getMileage() > car2.getMileage())
			return 1;
		else
			return -1;
	}
}
