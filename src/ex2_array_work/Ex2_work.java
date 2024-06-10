package ex2_array_work;

public class Ex2_work {
	public static void main(String[] args) {

		int[] arr = { 15, 22, 17, 40, 51 };
		// 배열 arr에 담긴 모든 값의 함을 출력

		int a = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			a = arr[i];
			sum += a;
		} // for
		System.out.println(sum);

		System.out.println("-----개선된 for문-----");

		int total = 0;
		for (int i : arr) {
			total += i;
		} // for
		System.out.println(total);

	}// main

}
