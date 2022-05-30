package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpp {

	public static void main(String[] args) {

		Integer num[] = { 1, 2, 3, 4 };
		Integer nums[] = { 11, 22, 33 };
		Integer num1[] = { 111, 222, 333, 444 };

		ArrayList<Integer[]> list = new ArrayList<>(Arrays.asList(num, nums, num1));

		System.out.println(Arrays.toString(list.get(0)));

		for (Integer[] a : list) {
			for (Integer b : a) {
				System.out.println(b);

			}
			
		}

	}

}
