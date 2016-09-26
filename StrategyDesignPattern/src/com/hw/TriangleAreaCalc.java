package com.hw;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class TriangleAreaCalc implements AreaCalculator {

	private ArrayList<Point> points;
	
	public TriangleAreaCalc(ArrayList<Point> points) {
		this.points = points;
	}
	
	
	public float getArea(ArrayList<Point> points) {
		double area, s;
		points.get(0).getX();
		double ab = Math.sqrt(Math.pow((points.get(0).getX() - points.get(1).getX()), 2) + Math.pow((points.get(0).getY() - points.get(1).getY()), 2));
		double bc = Math.sqrt(Math.pow((points.get(1).getX() - points.get(2).getX()), 2) + Math.pow((points.get(1).getY() - points.get(2).getY()), 2));
		double ca = Math.sqrt(Math.pow((points.get(2).getX() - points.get(0).getX()), 2) + Math.pow((points.get(2).getY() - points.get(0).getY()), 2));
		s = (ab + bc + ca)/2;
		area = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
		return (float) area;
		
	}
	
}