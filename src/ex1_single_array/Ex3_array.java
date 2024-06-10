package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {
		char[] ch = new char[4];

		// 문자배열은 비어있는 값이 기본값, 정수는 0이 기본

		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		// ch[4]='!';<방이 없어

		char[] chArr = { 'J', 'A', 'V', 'A' };

		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		System.out.println("-------------");

		// 개선된 for문 (향상된 루프)
		for (char c : chArr) {
			System.out.println(c);
		}

		// 배열의 모든 내용을 사용할때 쓰임.
		// char의 c값이 순차적으로 변동됨.
		// 일반적인 for문과의 차이는 무조건 모든 값을 출력함. 제어 거의 안됨.

	}// main

}
