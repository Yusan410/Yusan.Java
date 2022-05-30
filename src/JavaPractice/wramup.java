package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class wramup {

	public static void main(String[] args) {

		Integer nums[] = { 1, 2, 3, 4, 5, 15, 1, 2, 3, 4, 5,16,17,18,18 };

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));

		ArrayList<Integer> unique = new ArrayList<>();// store unique element

		ArrayList<Integer> nonDuplicate = new ArrayList<>();//15,16,17
		
		ArrayList<Integer> duplicateelement = new ArrayList<>();//store duplicate elemet
		

	

		System.out.println(Collections.frequency(list, 2)); // 2

		for (Integer a : list) {

			if (!unique.contains(a)) {

				unique.add(a);
			}

			if (Collections.frequency(list, a) == 1) {

				nonDuplicate.add(a);

			}

			if (Collections.frequency(list, a) > 1) {

				duplicateelement.add(a);
			}
			
		}
		System.out.println(unique);

		System.out.println(nonDuplicate);
		
		System.out.println(duplicateelement);
		
		
		
		

	}

}
