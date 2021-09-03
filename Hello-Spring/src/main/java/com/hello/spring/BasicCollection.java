package com.hello.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicCollection {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<>();
		list.add(1);
		list.add("D");
		list.add(true);
		list.add(null);
		list.add(1.2);
		System.out.println(list); // [1, D, true, null, 1.2]
		
		list.set(2, "d");
		System.out.println(list); //[1, D, d, null, 1.2]
		System.out.println(list.indexOf(null)); //3
		System.out.println(list.lastIndexOf("d")); //2
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr)); //[1, D, d, null, 1.2]
		list.add("testing");
		list.forEach(System.out::println);

	}

}
