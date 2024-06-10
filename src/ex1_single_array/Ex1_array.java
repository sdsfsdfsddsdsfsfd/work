package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		// 꼭 이해를 하고 넘어가야 한다.
		// 배열 : 같은 자료형끼리 모아둔 하나의 묶음
		// 효율적인 자료관리를 위해 반드시 필요함.

		int s1 = 100;
		int s2 = 200;
		int s3 = 300;
		int s4 = 400;

		System.out.println("-------------");

		// 위의 코드를 배열을 이용하여 생성해 보자.
		// 1) 배열 선언 []->1차원 배열
		int[] su;

		// 2) 배열 생성
		su = new int[5];

		// 3) 배열의 초기화
		su[0] = 100; // int su1=100;
		su[1] = 200;
		su[2] = 300;
		su[3] = 400;
		// su[4]=500;
		// 자바에서는 배열의 존재하지 않는 인덱스로 접근하는 것은 불가능.

		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);

		System.out.println("----------");

		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		} // for
			// 1차원 배열의 모든값 출력은 단일for문, 2차원>2중for문, 3차원>3중 for문

		System.out.println("-----------");

		int[] num = new int[3];
		// num[0]=10;...num[2]=30;
		// 배열내부 규칙성 있는 값

		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
			System.out.println(num[i]);
		}

	}// main

}
