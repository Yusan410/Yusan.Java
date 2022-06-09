package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class cellocyion {

	public static void main(String[] args) {

		Integer num[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 16, 17 };

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));

		ArrayList<Integer> DuplicateElement = new ArrayList<>();

		ArrayList<Integer> nonDuplicate = new ArrayList<>();
		
		ArrayList<Integer> unique = new ArrayList<>();
		
		

		for (Integer a : list) {

			if (Collections.frequency(list, a) > 1) {

				DuplicateElement.add(a);
				

			}

			if (Collections.frequency(list, a) == 1) {

				nonDuplicate.add(a);

			}
			
			for(Integer number: num) {
				
				
				if(!unique.contains(number)) {
					
					unique.add(number);
					
					
				}
				
				
			}
		}

		System.out.println(nonDuplicate);

		System.out.println(DuplicateElement);
		
		System.out.println(unique);

	}

}
