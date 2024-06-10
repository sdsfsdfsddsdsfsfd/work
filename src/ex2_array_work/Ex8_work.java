package ex2_array_work;

import java.util.Random;

public class Ex8_work {
	public static void main(String[] args) {
		int[] coin = { 1000, 500, 100, 50, 10 };//배열을 수정해도 결과가 나와야 함.
		// 변수 money를 만들고 10~5000사이의 난수를 넣는다.
		// 단, 발생된 난수는 3450, 2100과 같이 1의 자리가 반드시 0이어야 한다.
		// 발생한 난수 money를 동전으로 바꾸면
		// 500, 100, 50, 10원짜리 동전이 각각 몇개씩 필요한지 출력
		// 가능한 적은 수의 동전을 사용하도록 한다.
		// --------결과--------
		// 금액 : 2590
		// 500원: 5
		// 50원: 1
		// 10원: 4
		
		
		
		
		
		
		
		
		

		int money = 0;

		do {
			money = new Random().nextInt(5000 - 10 + 1) + 10;
		} while (money % 10 != 0);//난수는 간단하게 만들수도 있음.

		System.out.println(money);

		int[] num = new int[coin.length];

		for (int i = 0; i < coin.length; i++) {
			num[i] = money / coin[i];
			money %= coin[i];
			if (num[i] != 0) {
				System.out.printf("%d원 : %d", coin[i], num[i]);
				System.out.println();
			}
		} // for
		// 향상된 for문으로는 안됨...
		//money와 coin[i] 크기를 비교해서(m>c일때) 계산 후 출력
		
		
	}// main

}
