package Sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods2 {

	public static void main(String[] args) {
		//sorted
		List<Integer> list1 = Arrays.asList(10,2,33,15,14,69);
		
		list1.stream().sorted().forEach(n -> System.out.println(n)); //ascending order using streams
		
		list1.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n)); //descending order using streams
		
		/*Collections.sort(list1, Comparator.reverseOrder()); //reverse order without using streams
		System.out.println(list1);
		
		Collections.sort(list1); //ascending order without using streams
		System.out.println(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);*/
		
		//anyMatch
		System.out.println("anymatch: " + list1.stream().anyMatch(n -> n > 60)); //at least one element matches the condition returns true
		
		//allMatch
		System.out.println("allMatch: " + list1.stream().allMatch(n -> n >60)); //all elements matches the condition then only returns true
		
		//none match
		
		System.out.println("none match: " + list1.stream().noneMatch(n -> n > 70)); //none of the elements matches the condition then only returns true.
	
		//find any
		
		System.out.println(list1.stream().findFirst().get()); //it will fetch first value from the list
		System.out.println(list1.stream().findAny().get()); //it will fetch the any element from the list
		
		//Stream concatenation
		
		List<String> l1 = Arrays.asList("Kanya", "jashu", "buddi");
		List<String> l2 = Arrays.asList("Daddy", "Mummy", "Papa");
		
		Stream<String> s1 = l1.stream();
		Stream<String> s2 = l2.stream();
		
		List<String> finalList = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(finalList);
		
	}
	

}
