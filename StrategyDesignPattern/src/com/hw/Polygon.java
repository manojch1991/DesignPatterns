package com.hw;
import java.awt.Point;
import java.util.ArrayList;


public class Polygon {

	private ArrayList<Point> points;
	AreaCalculator areaCalc;
	
	public Polygon(ArrayList<Point> points, AreaCalculator areaCalc) {
		this.points = points;
		this.areaCalc = areaCalc;
	}
	
	public void setAreaCalc(AreaCalculator calc) {
		areaCalc = calc;
	}
	
	public void addPoint (Point point) {
		points.add(point);
	}

	public float getArea() {
		return areaCalc.getArea(points);
		
	}
}
