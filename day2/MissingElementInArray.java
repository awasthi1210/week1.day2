package day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int Arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(Arr);
		int value = 1;
		int i = 0;
		while (Arr[i] == value) {
			i++;
			value++;
		}
		System.out.println(value);

	}

}


