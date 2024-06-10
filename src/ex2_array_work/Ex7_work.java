package ex2_array_work;

import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {
		// 키보드에서 입력받은 값 만큼의 배열을 생성하고
		// 학생들의 성적을 입력 받는다.
		// 입력된 모든 학생들을 기반으로 평균성적과 그 이상인 학생들의 목록과
		// 평균 이상인 학생들의 수를 출력하시오.
		// ---------------------------
		// 학생수: 3
		// 학생1의 성적: 90(키보드에서)
		// 학생2의 성적: 75
		// 학생3의 성적:84
		// ----------------
		// 평균 성적 : 83.0
		// ------------------
		// 평균 성적 이상인 학생들
		// => 학생1
		// =>학생3
		// 평균 이상의 학생수 2명

		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수: ");
		int num = sc.nextInt();

		int i = 0;
		int[] grade = new int[num];
		while (i < num) {
			System.out.printf("학생 %d의 성적: ", i + 1);
			System.out.println();
			int score = sc.nextInt();
			grade[i] = score;
			i++;
		} // while

		int total = 0;
		for (int j : grade) {
			total += j;
		}
		System.out.println("평균성적 : " + total / num);

		System.out.println("평균성적 이상의 사람들 : ");

		int cnt = 0;
		for (int j = 0; j < grade.length; j++) {
			if (grade[j] > (total / num)) {
				System.out.printf("학생%d", j + 1);
				System.out.println();
				cnt++;// for문과 향상된 for문을 혼동하지 말기.
			}
		} // for
		System.out.println("평균이상의 학생수 : " + cnt);

	}// main

}
