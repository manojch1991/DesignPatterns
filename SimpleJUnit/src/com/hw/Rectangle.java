package com.hw;
import java.awt.Point;
import java.util.ArrayList;


public class Rectangle implements Polygon {

	private Point a,b,c,d;
	private ArrayList<Point> points=new ArrayList<Point>();

	public Rectangle(Point a, Point b, Point c, Point d) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public ArrayList<Point> getPoints() {
		// TODO Auto-generated method stub
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		return points;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area;
		double width, length;
		width = Math.sqrt((Math.pow(a.getX() + b.getX(), 2)) + Math.pow((a.getY() - b.getY()), 2));
		length = Math.sqrt((Math.pow(b.getX() + c.getX(), 2)) + Math.pow((b.getY() - c.getY()), 2));
		area = width * length;
//		System.out.println("rectangle area: " + area);
		return area;
	}

}
