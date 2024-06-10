package ex2_array_work;

public class Practice {
	public void wlq(int[] arr) {
		int odd=0;
		int even=0;
		
		for(int i:arr) {
			if(i%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("홀수의 갯수 : "+odd);
		System.out.println("짝수의 갯수 : "+even);
		
	}//public
}
