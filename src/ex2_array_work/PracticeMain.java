package ex2_array_work;

import java.util.Scanner;

public class PracticeMain {
	public static void main(String[] args) {
		// 배열의 크기를 결정할 값을 입력받고, 배열의 크기만큼 모든 index에
		// 키보드에서 입력받은 정보를 채워넣는다.
		// 최종적으로 완료된 배열 안에서 홀수와 짝수의 갯수를 찾아 출력
		// -------------------------------
		// 배열의 크기 : 5
		// 정수입력 : 7
		// 정수 입력 : 3
		// 정수 입력 : 2
		// 정수 입력 : 11
		// 정수 입력 : 20(숫자 5개 받기)
		// -----------
		// 홀수의 갯수 : 3
		// 짝수의 갯수 : 2(결과!)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("배열의 크기 : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		for(int i=0;i<size;i++) {
		System.out.println("정수입력 : ");
		int num=sc.nextInt();
		arr[i]=num;
		}
		
		Practice dkarjsk = new Practice();
		dkarjsk.wlq(arr);
		
		

	}// main

}
