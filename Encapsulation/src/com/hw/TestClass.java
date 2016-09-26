package com.hw;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point x = new Point(1,2);
		Point y = new Point(5,7);
		Point z = new Point(10,11);
		Triangle triangle1 = new Triangle(x,y,z);
		Point a = new Point(5,1);
		Point b = new Point(0,1);
		Point c = new Point(0,5);
		Point d = new Point(5,5);
		Rectangle rectangle1 = new Rectangle(a, b, c, d);
		Point p = new Point(5,1);
		Point q = new Point(10,10);
		Point r = new Point(7,8);
		Triangle triangle2 = new Triangle(p,q,r);
		Point p1 = new Point(10,10);
		Point p2 = new Point(0,10);
		Point p3 = new Point(0,20);
		Point p4 = new Point(10,20);
		Rectangle rectangle2 = new Rectangle(p1, p2, p3, p4);
		
		List<Polygon> polygon=new ArrayList<Polygon>();
		polygon.add(triangle1);
		polygon.add(rectangle1);
		polygon.add(triangle2);
		polygon.add(rectangle2);
		
		Iterator<Polygon> itr = polygon.iterator();
	      while(itr.hasNext()) {
	         Polygon element = itr.next();
	         if(element instanceof Triangle){
	        	 System.out.println("Traingle points are: " + element.getPoints());
	        	 System.out.println("Area of triangle is: " + element.getArea());
	         }
	         if(element instanceof Rectangle){
	        	 System.out.println("Rectangle points are: " + element.getPoints());
	        	 System.out.println("Area of rectangle is: " + element.getArea());
	         }
	      }
	}

}
