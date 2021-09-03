package com.hello.spring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JAVA8 {
	
	public static void doubleDotOperator () {
		// old way
//		Employee e1 = new Employee();
//		System.out.println(e1);
		// how to create instance using ::
		IEmployee e = Employee::new;
		Employee emp = e.create();
//		System.out.println(emp);
		
		// how to call  Method
		Function<Employee, String> fEmp = Employee :: getName;
		String name = fEmp.apply(emp);
		System.out.println(name);
	}

	public static void streamOperator() {
		
		Integer [] arr = {0,5,10,20,30,44,11,34,23,43,234,54,64,34}; 
		String [] str = {"Harsh singhal","har" , "Nilesh jain" , "parish kumar"};
		List<Integer> list = Stream.of(arr).collect(Collectors.toList()); 
		List<String> sList = Stream.of(str).collect(Collectors.toList());
		// forEach
		Consumer<Object> c = x->{
			System.out.print(x+" , ");
		};
//		list.stream().forEach(c);
		
		// filter odd number
		list.stream()
		.filter(i->i%2==0)
		.map(x->x+10)
		.forEach(c);
		
		// count
		long size = list.stream().filter(i->i%2!=0).count();
		System.out.println("size "+size);
		
		
		// sorted default sorted order
		list.stream().sorted().forEach(c);
		System.out.println(" ");
		sList.stream().sorted().forEach(c);
		System.out.println(" ");
		// des order 
		Comparator<Integer> com = (s1,s2)-> (s1<s1)?1:(s1>s2)?-1:0;
		Comparator<String> strCom = (s1,s2)-> -s1.compareTo(s2);
		sList.stream().sorted(strCom).forEach(c);
		list.stream().sorted(com).forEach(c);
		System.out.println(" ");
		// sort user object according to name
		
		User user1 = new User("a","hEmail",4354);
		User user2 = new User("b","yEmail",4644);
		User user3 = new User("d","2Email",2222);
		User user4 = new User("c","nEmail",48944454);
		User user5 = new User("v","sEmail",111);
		User user6 = new User("harsh","hEmail",44);
		List<User> uList = new ArrayList<>();
		uList.add(user1);uList.add(user2);uList.add(user3);uList.add(user4);
		uList.add(user5);uList.add(user6);
		
		Comparator<User> userComparator = Comparator.comparing(User::getName);
		Comparator<User> descComp = (obj1,obj2)-> obj2.getName().compareTo(obj1.getName());
		
		uList.stream().sorted(userComparator).forEach(c);
		System.out.println(" ");
		uList.stream().sorted(descComp).forEach(c);
		System.out.println(" ");
		// min and max
		User user7 = uList.stream().min(descComp).get();
		User user8 = uList.stream().max(descComp).get();
		System.out.println("user7 "+user7);
		System.out.println("user8 "+user8);
		
		// joining....
		String l = uList.stream()
				.map(User::getEmail)
				.collect(Collectors.joining("----"));
		System.out.println(l);
		

		
	}
	public static void main(String[] args) {
//		doubleDotOperator();
		streamOperator();
	}
}


