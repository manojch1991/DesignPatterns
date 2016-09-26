package com.hw;
import java.awt.Point;
import java.util.ArrayList;


public class RectangleAreaCalc implements AreaCalculator{

	private ArrayList<Point> points;
	
	public RectangleAreaCalc(ArrayList<Point> points) {
		// TODO Auto-generated constructor stub
		this.points = points;
	}



	@Override
	public float getArea(ArrayList<Point> points) {
		double area;
		double width, length;
		width = Math.sqrt((Math.pow(points.get(0).getX() + points.get(1).getX(), 2)) + Math.pow((points.get(0).getY() - points.get(1).getY()), 2));
		length = Math.sqrt((Math.pow(points.get(1).getX() + points.get(2).getX(), 2)) + Math.pow((points.get(1).getY() - points.get(2).getY()), 2));
		area = width * length;
		return (float) area;
	}
	
}
