package ex2_array_work;

import java.util.Random;
import java.util.Scanner;

public class Ex6_baseball_work {
	public static void main(String[] args) {
		// 이전에 만들었던 숫자 야구 코드를 배열을 이용하여 변경해보자.
		// ---------------
		// 컴퓨터 난수: 527
		// 값을 입력 예) 1,2,3>123
		// 1S, 1B
		// 값 예)456
		// 0S,1B
		// ...
		// 정답!
		// 정답까지 3회!

		// int com=new int[](배열)
		// (컴, 유저 배열로 만들기)

		// for문으로 만들어도 ㄱㅊ
		// 중복되지 않는 난수 만들었어.
		// 이제 우리는 정답이라고 생각하는 값을 입력받아야 하고 입력받은걸 출력해야되고 정답은 몇 회만에 맞췄는지도 출력해야함.
		// 9까지 경우에 수에 모든 라인을 포함해서 11줄 정도로 끝남.
		// 경우의 수 판단을 하나씩 작성 안해도 ㄱㅊ
		// 4자리수로 만들수도 있음.(응용)

		int[] user = new int[3];
		int[] com = new int[3];

		do {
			com[0] = new Random().nextInt(9) + 1;
			com[1] = new Random().nextInt(9) + 1;
			com[2] = new Random().nextInt(9) + 1;
		} while (com[1] == com[2] || com[2] == com[0] || com[0] == com[1]);

		for (int i : com) {
			System.out.print(i + " ");
		} // 난수 설정 후 입력

		System.out.println();
		int a = 0;
		while (1 > 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			user[0] = num / 100;
			user[1] = (num / 10) % 10;
			user[2] = num % 10;// 숫자 입력
			a++;
			int s = 0;
			int b = 0;
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (user[i] == com[i]) {
						s++;
						break;
					} else if (user[i] == com[j] && i != j) {
						b++;
						break;
					} // if
				} // inner
			} // outer

			if (s == 3) {
				System.out.println("정답입니다.");
				break;
			} else if (s != 0 || b != 0) {
				System.out.printf("%d S, %d B", s, b);
				System.out.println();
			} else {
				System.out.println("out");
			} // if

		} // while

		System.out.printf("정답까지 %d회!", a);

	}// main
}
