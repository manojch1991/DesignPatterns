package com.hw;

import java.util.Comparator;

public class TimeStampComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		FSElement f1 = (FSElement) o1;
		FSElement f2 = (FSElement) o2;
		return f1.getCreatedDate().compareTo(f2.getCreatedDate());
	}

}
