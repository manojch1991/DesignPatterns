package com.hw;
import java.util.ArrayList;
import java.util.List;


public class TestClass {

	public static void main(String[] args) {
		Scoop scoop1 = new Scoop(Flavor.CHOCOLATE);
		Scoop scoop2 = new Scoop(Flavor.LIME);
		List<Scoop> coneScoop= new ArrayList<Scoop>();
		Cone cone = new Cone(Size.LARGE);
		Topping[] t = {Topping.EXTRACHOCOLATE, Topping.STRAWBERRYJEERRY};
		
		coneScoop.add(scoop1);
		coneScoop.add(scoop2);
		cone.addScoop(coneScoop);
		cone.getScoops();
		System.out.println("=============================");
		System.out.println("Cone");
		System.out.println("=============================");
		System.out.println("Cone size is: ");
		System.out.println(cone.getSize());
		System.out.println("Your flavors are: ");
		System.out.println(cone.getScoops());
		cone.addToppings(t);
		System.out.println("Toppings are: ");
		for(Topping topping: cone.getToppings()){
			System.out.println(topping);
		}
		cone.setPrice(5);
		System.out.println("Price is: " + cone.getPrice());
		Scoop scoop3 = new Scoop(Flavor.STRAWBERY);
		Scoop scoop4 = new Scoop(Flavor.VANILLA);
		List<Scoop> cupScoop= new ArrayList<Scoop>();
		Cup cup = new Cup(Size.LARGE);
		Topping[] t1 = {Topping.NUTS, Topping.STRAWBERRYJEERRY};
		
		cupScoop.add(scoop3);
		cupScoop.add(scoop4);
		cup.addScoop(cupScoop);
		cup.getScoops();
		System.out.println("=============================");
		System.out.println("Cup");
		System.out.println("=============================");
		System.out.println("cup size is: ");
		System.out.println(cup.getSize());
		System.out.println("Your flavors are: ");
		System.out.println(cup.getScoops());
		cup.addToppings(t1);
		System.out.println("Toppings are: ");
		for(Topping topping: cup.getToppings()){
			System.out.println(topping);
		}
		cup.setPrice(4);
		System.out.println("Price is: " + cup.getPrice());
	}
}
