package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");
		List<String> list3 = Arrays.asList("G", "H", "I");
		
		List<List<String>> newList = new ArrayList<List<String>>();
		newList.add(list1);
		newList.add(list2);
		newList.add(list3);
		
		List<String> playersWithOutFaltMap = new ArrayList<>();
		
		//without flat map
		for (List<String> team : newList) {
			for (String player:team) {
				playersWithOutFaltMap.add(player);
			}
		}
		System.out.println(playersWithOutFaltMap);
		
		List<String> playersWithFaltMap = new ArrayList<>();
		
		playersWithFaltMap = newList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println(playersWithFaltMap);
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
	
		List<List<Integer>> l3 = Arrays.asList(l1,l2);
		
		//l3.stream().flatMapToDouble(n -> n.stream()).forEach(n -> System.out.println(n));
		

	}

}
