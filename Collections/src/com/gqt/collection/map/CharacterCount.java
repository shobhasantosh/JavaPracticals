package com.gqt.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Requirement: Get the character count and the positions of each character in string MISSISSIPPI

public class CharacterCount {
	public static void main(String[] args) {
		Map<Character, Map<List<Integer>, Integer>> map1 = new HashMap<>();
		Map<List<Integer>, Integer> map2 = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		String s = "MISSISSIPPI";
		String st = s;
		while (!st.isEmpty()) {
			char c = st.charAt(0);
			st = st.replace(c + "", ""); // converting character to string
			map2.put(list, 0);
			map1.put(c, map2);
		}
		char[] c = s.toCharArray();
		int count = 0;
		char ch = 0;
		while (!s.isEmpty()) {
			Map<List<Integer>, Integer> map3 = new HashMap<>();
			List<Integer> list2 = new ArrayList<>();
			ch = s.charAt(0);
			for (int i = 0; i < c.length; i++) {
				if (c[i] == s.charAt(0)) {
					count++;
					list2.add(i);
				}
			}
			map3.put(list2, count);
			map1.replace(ch, map3);
			s = s.replaceAll(ch + "", "");
			count = 0;

		}
		System.out.println(map1);
	}
}
