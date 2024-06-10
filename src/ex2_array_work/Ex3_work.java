package ex2_array_work;

public class Ex3_work {
	public static void main(String[] args) {

		int[] arr = { 4, 13, 7, 19, 1, 15 };
		// 배열 arr에 담긴 값중 가장 큰 값을 출력하시오.
		// 가장 큰 값 : 19

		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - i; j++) {
				if (arr[i] >= arr[j]) {
					a = arr[i];
				} else {
					a = arr[j];
				}
			}
		}
		System.out.println(a);

		a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (a <= arr[i]) {
				a = arr[i];
			}
		} // for
		System.out.println(a);

		a = arr[0];
		for (int i : arr) {
			if (a <= i) {
				a = i;
			}
		} // for
		System.out.println(a);

	}// main

}
