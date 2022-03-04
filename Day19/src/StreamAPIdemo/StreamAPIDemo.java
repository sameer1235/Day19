package StreamAPIdemo;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> values =Arrays.asList(1,2,3,4,5);
		// using for loop traverse the array
		System.out.println(" using For loop array ");

		for(int i=0;i<5;i++) {
			System.out.println("Array Elements :"+values.get(i));
		}
		// using Iterator traverse the array
		System.out.println(" using Iterator array ");

		Iterator<Integer> ival = values.iterator();
		while(ival.hasNext()) {
			System.out.println(ival.next());
		}
		// using forEach loop traverse the array
		System.out.println(" using FoorEach array ");

		for(int i: values) {
			System.out.println(i);
		}
		// using lambda traverse the array
		System.out.println(" using Lambda array ");

		values.forEach(i-> System.out.println(i));
		
		// using anonymous function traverse the array
		System.out.println(" using Anonymous array ");

		
		values.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
	
	}

}
