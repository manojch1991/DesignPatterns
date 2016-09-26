package com.test;

import java.awt.Point;
import java.text.DecimalFormat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.hw.Rectangle;
import com.hw.Triangle;

public class PolygonTest1 {

	Point x = new Point(1,2);
	Point y = new Point(5,7);
	Point z = new Point(10,11);
	
	Point a = new Point(5,1);
	Point b = new Point(0,1);
	Point c = new Point(0,5);
	Point d = new Point(5,5);
	DecimalFormat df = new DecimalFormat("###.##");
	
	@Test
	public void triangleGetArea(){
		Triangle triangle = new Triangle(x,y,z);
		double expected = 4.499999999999998;

		double actual = triangle.getArea();
		Assert.assertThat(actual, CoreMatchers.is(expected)); 
	}
	
	@Test
	public void rectangleGetArea(){
		Rectangle rectangle = new Rectangle(a, b, c, d);
		double expected = 20;
		double actual = rectangle.getArea();
		Assert.assertThat(actual, CoreMatchers.is(expected)); 
	}
	
}
