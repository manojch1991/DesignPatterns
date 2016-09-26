package com.hw;
import java.awt.Point;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Triangle implements Polygon{
	private Point a,b,c;
	private ArrayList<Point> points=new ArrayList<Point>();
	DecimalFormat df = new DecimalFormat("####0.00");
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public ArrayList<Point> getPoints() {
		// TODO Auto-generated method stub
		
		points.add(a);
		points.add(b);
		points.add(c);
		return points;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area, s;
		double ab = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
		double bc = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
		double ca = Math.sqrt(Math.pow((c.getX() - a.getX()), 2) + Math.pow((c.getY() - a.getY()), 2));
		s = (ab + bc + ca)/2;
		area = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
		
		return area;
	}
}
