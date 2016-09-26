package com.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {

		String ticker = "Google";
		float quote = 100;
		PiechartObserver pie = new PiechartObserver();
		ThreeDObserver threeD  = new ThreeDObserver();
		TableObserver table = new TableObserver();
		Map<String, Float> map = new HashMap<>();
		
		StockQuoteObservable sqo = new StockQuoteObservable();
		sqo.addObserver(table);
		sqo.addObserver(threeD);
		sqo.addObserver(pie);
		map.put("Google", (float) 100.87);
		map.put("Yahoo", (float) 50.56);
		map.put("Amazon", (float)250.74);
		map.put("Apple", (float)150.32);
		
		Iterator<Map.Entry<String, Float>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<String, Float> entry = entries.next();
				ticker = entry.getKey();
				quote = entry.getValue();
				sqo.changeQuote(ticker,quote);
		}
	}
}
