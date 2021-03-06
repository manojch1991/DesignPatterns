package com.hw;

import java.util.Observable;
import java.util.Observer;

public class PiechartObserver implements Observer{

	
	
	@Override
	public void update(Observable o, Object args) {
		((StockEvent) args).getTicker();
		((StockEvent) args).getQuote();
		System.out.println("\nPie chart Representation: " + "Stock: " + ((StockEvent) args).getTicker() + " Quote: " + ((StockEvent) args).getQuote());

	}

}
