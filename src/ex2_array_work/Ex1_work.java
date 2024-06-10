package ex2_array_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 배열의 길이 : 5(키보드 입력)
		// 순차적으로 값을 채워넣고 배열의 모든 내용 출력.
		// 출력값은 0번부터 순차적으로 출력.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] ch = new char[n];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i);// 'A'+i(숫자)>문자로 바꿈.
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("String 배열의 초기값");

		// String 배열의 초기값
		// 변수 만들때 표기법
		String[] sArr = new String[2];
		// 기본값은 null, 상자에 아무 값도 없이 텅 비어있는 상태
		sArr[0] = null;
		sArr[1] = "";// 빈값, 상자에 빈 값이 들어와있는 상태
		// 초기화할떄는 Str=""으로 초기화하는걸 권장함.
		// 기본값이 null이므로
		// 그래서 for문 돌려서 빈값으로 넣고 시작하기도 함.

		System.out.println("null로 초기화 : " + sArr[0]);// 출력>null,
		System.out.println("빈값(\"\") 으로 초기화 : " + sArr[1]);

		String a = null;
		a += "안녕";
		System.out.println(a);// 이어붙이려고 데이터를 만들어서 출력됨.

		String b = "";
		b += "안녕";
		System.out.println(b);

	}// main

}
