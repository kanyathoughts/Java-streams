package Sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Kanya", "", "Jashu", "Buddi", "");
		List<String> withoutNull = l1.stream().filter(n -> ! n.equals("")).collect(Collectors.toList());
		System.out.println(withoutNull);
		
		List<Integer> l2 = Arrays.asList(10,28,35,42,50);
		l2.stream().filter(n -> n%2==0).filter(n -> n%7==0).forEach(n -> System.out.println(n)); //28, 42
		
		Integer maxValue = l2.stream().filter(n -> n%2==0).max((x, y) -> x.compareTo(y)).get();
		System.out.println(maxValue); //50
		
		
	}

}
