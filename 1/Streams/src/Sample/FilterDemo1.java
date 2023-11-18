 package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	
	public static void main(String[] args) {
		/*List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(20);
		numberList.add(25);
		numberList.add(30);
		
		System.out.println(numberList);*/
		
		//we can directly add soo many elements in a single line by below code.
		List<Integer> numberList = Arrays.asList(10,15,20,25,30);
		System.out.println(numberList);
		
		//filter elements from list and store it into another list without streams.
		List<Integer> evenNumberList = new ArrayList<>();
		for (int i: numberList) {
			if (i%2==0) {
				evenNumberList.add(i);
			}
		}
		System.out.println("evenNumberList: " + evenNumberList);
		
		
		//filter with streams
		List<Integer> oddNumberList = numberList.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println(oddNumberList);
		
		//without saving into any collection directly we can print the filtered values
		numberList.stream().filter(n -> n%2!=0).forEach(n -> System.out.println(n));
		
		//we can ignore lambda expression by the below code. Directly values will pass to the println method.
		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
		
		
	}

}
