package com.hw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Cup extends Container{

	List<Scoop> scoop = new ArrayList<Scoop>();
	Topping[] toppings;

	public Cup(Size s) {
		super(s);
	}
	
	public void addToppings(Topping[] t){
		this.toppings = t;
	}

	public void addScoop(List<Scoop> scoop){
		this.scoop = scoop;
	}
	
	public List<String> getScoops(){
		List<String> scoops = new ArrayList<String>();
		Iterator<Scoop> itr = scoop.iterator();
		while(itr.hasNext()){
			Scoop s = itr.next();
			scoops.add(s.getFlavor());
		}
		return scoops;
	}
	
	public Topping[] getToppings(){
		return toppings;
	}
	
	/*public int getLayerNumber(){
		int layerNumber = flavor.size();
		return layerNumber;
	}*/
	
}
