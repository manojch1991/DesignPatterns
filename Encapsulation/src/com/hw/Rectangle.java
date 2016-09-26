package com.hw;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class Rectangle implements Polygon {

	private Point a,b,c,d;
	private ArrayList<Point> points=new ArrayList<Point>();

	public Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public ArrayList<Point> getPoints() {
		points.add(a);
		points.add(b);
		points.add(c);
		points.add(d);
		return points;
	}

	@Override
	public double getArea() {
		double area;
		double width, length;
		width = Math.sqrt((Math.pow(a.getX() + b.getX(), 2)) + Math.pow((a.getY() - b.getY()), 2));
		length = Math.sqrt((Math.pow(b.getX() + c.getX(), 2)) + Math.pow((b.getY() - c.getY()), 2));
		area = width * length;
		return area;
	}

}
