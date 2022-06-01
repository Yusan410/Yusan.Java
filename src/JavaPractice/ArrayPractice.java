package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		int targetnum = 5;

		int nums[] = new int[arr.length + 1];

		int position = 0;

		for (int i = 0; i < arr.length; i++) {

			nums[position] = arr[i];
			position++;

			nums[nums.length - 1] = targetnum;

		}

		System.out.println(Arrays.toString(nums));

		int num[] = { 1, 2, 3, 4, 5 };
		int num1[] = { 6, 7, 8, 9 ,10};

		int index = 0;

		int arrr[] = new int[num.length + num1.length];

		for (int i = 0; i < num.length; i++) {

			arrr[index] = num[i];
			index++;

		}
		for (int j = 0; j < num1.length; j++) {

			arrr[index] = num1[j];
			index++;

		}

		System.out.println(Arrays.toString(arrr));
		
		int numss[] = {1,1,2,2,3,3,4,4,5,5,6,6};
		
		ArrayList<Integer> uniqq= new ArrayList<>();
		
		Set<Integer> unique = new HashSet<>();
		
		for(Integer a: numss) {
			
			unique.add(a);
			if(!uniqq.contains(a)) {
				
				uniqq.add(a);
			}
			
		}
		
		System.out.println(unique);
		
		System.out.println(uniqq);
	}

}
