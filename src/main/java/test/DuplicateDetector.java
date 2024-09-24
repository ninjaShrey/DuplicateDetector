package test;
import java.util.*;
public class DuplicateDetector<T> {
	
	public List<T> getDuplicates(List<T> inputItems) {
		List<T> duplicates=new ArrayList<>();
		Map<T,Integer> count=new HashMap<>();
		for(T item: inputItems) {
			count.put(item, count.getOrDefault(item, 0) + 1);
		}
		for(T item:inputItems) {
			if(count.get(item) > 1 && !duplicates.contains(item)) {
				duplicates.add(item);
			}
		}
		return duplicates;
	}
	public static void main(String[] args) {
		DuplicateDetector<String> detector=new DuplicateDetector<>();
		List<String> input=Arrays.asList("b", "a", "c", "c", "e", "a", "c", "d", "c", "d");
		List<String> duplicates=detector.getDuplicates(input);
		System.out.println(duplicates);

	}	
}