package com.hw;

import java.util.Comparator;

public class DominateCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cars car1 = (Cars) o1;
		Cars car2 = (Cars) o2;

		if (car1.getDominateCount() == car2.getDominateCount())
			return 0;
		else if (car1.getDominateCount() > car2.getDominateCount())
			return 1;
		else
			return -1;
	}
}