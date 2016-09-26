package com.hw;
import java.awt.Point;
import java.util.ArrayList;


public class TestClass {

	public static void main(String[] args) {

		ArrayList<Point> al = new ArrayList<Point>();
		al.add( new Point(5,1) ); 
		al.add( new Point(0,1) ); 
		al.add( new Point(0,5) );
		Polygon p = new Polygon( al, new TriangleAreaCalc(al) );
		float triArea = p.getArea(); // triangle’s area
		System.out.println("Triangle are: " + triArea);
		p.addPoint( new Point(5,5) );
		p.setAreaCalc( new RectangleAreaCalc(al) );
		float rectArea = p.getArea(); // rectangle’s area
		System.out.println("rectangle area: " + rectArea);
		
	}

}
