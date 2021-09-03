package com.hello.spring;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MapTest {
	
	private static void testHashMap () {
		Map<Integer , User> map = new HashMap<>();
		map.put(1, new User("A","a@gmail.com",1234));
		map.put(22, new User("B","R@gmail.com",322));
		map.put(3, new User("D","REa@gmail.com",323232));
		map.put(4, new User("FG","WRER@gmail.com",12434));
		map.put(5, new User("GA","AD@gmail.com",444));
		
		Consumer<Object> c = h->{System.out.println(h);};
		
		map.keySet().forEach(System.out::println);
		map.values().forEach(c);
		map.entrySet().forEach(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testHashMap();
	}

}
