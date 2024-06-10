package ex2_array_work;

public class Ex4_work {
	public static void main(String[] args) {

		int[] arr = { 4, 13, 7, 19, 1, 15 };
		// 배열 arr이 가진 내용들을 오름차순으로 정렬하여 출력
		// 오름차순에 for2개+if1 출력하는데 for1개

//		int n=arr[0];
		int a = 0;

		int[] n = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			n[i] = arr[i];

			for (int j = i; j < arr.length; j++) {// 범위설정 잘못함ㅎ
				if (n[i] >= arr[j]) {
					a = n[i];
					n[i] = arr[j];
					arr[j] = a;
				} // if
			} // inner
		} // outer
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}// main

}
