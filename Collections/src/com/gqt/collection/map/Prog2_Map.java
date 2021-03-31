package com.gqt.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Prog2_Map {
	public static void main(String[] args) {
	HashMap<String, Integer> fp = new LinkedHashMap<>();
	fp.put("Apple", 125);
	fp.put("Mango", 80);
	fp.put("JackFruit", 40);
	fp.put("Apple", 130);
	fp.put("Orange", 48);
	System.out.println("fruit map: "+fp); 
	
	HashMap<String, Integer> vprice = new HashMap<>();
	vprice.put("CArrot", 80);
	vprice.put("Lemon", 20);
	vprice.put("Peas", 250);
	fp.putAll(vprice);	
	System.out.println("Map After putAll(): " + fp);
//{Apple=130, Mango=80, JackFruit=40, Orange=48, Peas=250, CArrot=80, Lemon=20}

	System.out.println("containsKey: " + fp.containsKey("JackFruit"));
	System.out.println("containsKey: " + fp.containsKey("Strawberry"));
	System.out.println("Contains Value: " + fp.containsValue(130));
	System.out.println("Contains Value: " + fp.containsValue(200));
	fp.remove("Orange");
	fp.remove("Apple", 125);
	System.out.println("Map After removing: " + fp);
//Map After removing: {Apple=130, Mango=80, JackFruit=40, Peas=250, CArrot=80, Lemon=20}
	
	System.out.println("---------------------");
	System.out.println(vprice.putIfAbsent("DrumStick", 50)); //"DrumStick" added into Map
	vprice.put("Onion", null);
	System.out.println(vprice.putIfAbsent("Peas", 350)); //"Peas is not updated bcoz its already present
	System.out.println(vprice.putIfAbsent("Onion", 80)); //"Onion is added
	System.out.println("Vegi Map after putIfAbsent: " +vprice); 
	System.out.println("Fruits Map after putIfAbsent: "+fp); // "DrumStick" Not added here
	
	vprice.put("Garlic", null);
	System.out.println(vprice.computeIfAbsent("Peas", (x)->100)); // we can give explicit condition in lambda
	System.out.println(vprice.computeIfAbsent("Garlic", (x)->100));
	System.out.println("Vegi Map after computeIfAbsent: "+vprice);

	
	fp.merge("Apple", 5, (y1,y2)->(y1+y2)); // apple= 130+5
	System.out.println(fp); 
	//{Apple=135, Peas=250, Mango=80, Raddish=85, JackFruit=40, CArrot=80, Lemon=20, Cucumber=10}
	}

}
