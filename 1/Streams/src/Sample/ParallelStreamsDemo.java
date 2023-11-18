package Sample;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		
		List<Student> list1 = Arrays.asList(
				new Student("bob", 1),
				new Student("eric", 3),
				new Student("steve", 9),
				new Student("smith", 12)
				);
		
		//normal stream
		list1.stream().filter(n -> n.getId() >5).limit(1).forEach(n -> System.out.println(n.getId()));
		
		//parallel stream means it will parallelly create multiple streams to fasten the process
		list1.parallelStream().filter(n -> n.getId() > 5).limit(1).forEach(n -> System.out.println(n.getId()));
		
		//We can convert normal Stream to parallel stream also
		list1.stream().parallel().filter(n -> n.getId() > 5).limit(1).forEach(n -> System.out.println(n.getId()));
		

	}

}
