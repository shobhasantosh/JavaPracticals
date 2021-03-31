package com.gqt.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCount2 {
	public static void main(String[] args) {
		Map<Character, Map<List<Integer>, Integer>> maptable = new HashMap<>();
		for(int i=0;i<args[0].length();i++) {
			char c1=args[0].charAt(i);
			
			if(!args[0].substring(0,i).contains(c1+"")) {
				Map<List<Integer>, Integer> ml = new HashMap<>();
				List<Integer> pos = new ArrayList<>();
				
				for(int j=i;j<args[0].length();j++) {
					if(c1==args[0].charAt(j)) {
						pos.add(j);
						
						ml.put(pos, pos.size());  
						maptable.put(c1, ml);
					}
				}
			}
			System.out.println(maptable);
		
		}
	
	}
	
	

}
