package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String ename;
	int id, experience;
	
	public Employee(String ename, int id, int experience) {
		this.ename = ename;
		this.id = id;
		this.experience = experience;
	}
}

public class MapDemo1 {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("kanya", "buddi", "jashu", "nithya");
		//map function will perform the given operation on each element in the list
		l1.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		
		
		//Storing into another list
		List<String> l2 = l1.stream().map(n -> n.replaceAll("a", "e")).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = l1.stream().map(n -> n.length()).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer> l4 = Arrays.asList(2,3,4,5);
		List<Integer> l5 = l4.stream().map(n -> n*3).collect(Collectors.toList());
		System.out.println(l5);
		
		List<Employee> l6 = new ArrayList<Employee>();
		l6.add(new Employee("Kanya", 10, 2));
		l6.add(new Employee("Jashu", 3, 3));
		
		List<Integer> l7 = l6.stream().map(n -> n.experience*5).filter(n -> n>10).collect(Collectors.toList());
		System.out.println(l7);
		
		
		
		
	}

}
