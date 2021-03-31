package com.gqt.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap doesnt allow duplicates
//NO sorting done in Map
//A Map can't be traversed, so you need to convert it into Set Using keySet() or entrySet() method.

public class Prog1_Map {
	public static void main(String[] args) {
		Map<String, Integer> fprice = new HashMap<>();
		fprice.put("Apple", 125);
		fprice.put("Mango", 80);
		fprice.put("JackFruit", 40);
		fprice.put("Apple", 130);
		fprice.put("Orange", 48);
		System.out.println("Map: " + fprice); // Map Display-> {Apple=130, Mango=80, JackFruit=40, Orange=48}
		System.out.println("keySet(): " + fprice.keySet()); // Set display-> [Apple, Mango, JackFruit, Orange]
		System.out.println("values: " + fprice.values()); // [130, 80, 40, 48]
		System.out.println("entrySet:" + fprice.entrySet()); // [Apple =130, Mango=80, JackFruit=40, Orange=48]
		fprice.forEach((x, y) -> System.out.println(x + " " + y));
		
		System.out.println("--------------------------------------");
		
		//Converting Map to Set using keySet()
		Iterator<String> fruits = fprice.keySet().iterator(); // imp
		for (; fruits.hasNext();) {
			String fname = fruits.next();
			System.out.println("Name: " + fname);
			System.out.println("Value: " + fprice.get(fname));

		}

		System.out.println("--------------------------------------");

		// Converting Map(fprice object) to Set so that we can  traverse using entrySet
		Set<Map.Entry<String, Integer>> s = fprice.entrySet(); 
		Iterator<Map.Entry<String, Integer>> i1 = s.iterator();
		while (i1.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) i1.next();
			System.out.println("NAme: " + e.getKey());
			System.out.println("Value: " + e.getValue());
		}

		System.out.println("-----------------------");
		
		
		// Converting to Map.Entry so that we can get key and value separately -New method
		for(Map.Entry<String,Integer> m:fprice.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

		System.out.println(fprice.getOrDefault("JackFruit", 100)); // 40
		Integer p = fprice.getOrDefault("Gauva", 70);
		System.out.println("getOrDefault: " + p); // 70

	}
}
