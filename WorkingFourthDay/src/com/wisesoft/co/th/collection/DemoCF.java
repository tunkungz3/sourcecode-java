package com.wisesoft.co.th.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Iterable คือ วนไปเรื่อยๆ
public class DemoCF {
	public static void main(String[] args) {
		// List :: dynamic array
		List<Integer> numberList = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			numberList.add(i);
		}
		String data = "";
		numberList.add(4, 20);
		for(int i : numberList) {
			data +=i+",";
		}
		data = data.substring(0,data.length()-1);
		System.out.println(data);
		System.out.println("Size : " + numberList.size());
		
		// Map
		Map<String,Integer> employee = new HashMap<>();
		employee.put("starjune", 30);
		for (Entry<String, Integer>  entry : employee.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		for (String  key : employee.keySet()) {
			System.out.println(key+" : "+employee.get(key));
		}
	}
}
