package javaPractice01;

public class Practice17 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // 1부터 10까지의 합
			System.out.printf("i = %d sum = %d \n", i, sum += i);
		}
		
		System.out.printf("\n");
		
		int sum2 = 0;
		for (int j = 10; j <= 20; j++) {
			System.out.printf("j = %d sum2 = %d \n", j, sum2 += j);
		}
		
		System.out.printf("\n");
		
		int sum3 = 0;
		for (int k = 0; k < 10 ; k++) {
			System.out.printf("k = %d sum3 = %d \n", k, sum3 += k+1);
		}
		
	}
	
}
