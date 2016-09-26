package com.hw;
import java.util.ArrayList;
import java.util.List;

public class Scoop {

	private static final int MAX_SCOOP_NUM = 3;
	private static int INITIAL_COUNT = 0;
	private Flavor flavor;
	private Topping[] toppings;
	private float price;
	private List<Scoop> scoop = new ArrayList<Scoop>();
	Scoop(Flavor f){
		this.flavor = f;
	}
	
	public Scoop() {
	}

	public String getFlavor(){
		return flavor.toString();
	}
	
	public void setToppings(Topping[] t){
		this.toppings = t;
	}
	
	public String getToppings(){
		return toppings.toString();
	}
	
}
