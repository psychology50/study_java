package javaPractice01;

public class Practice22 {
		
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
			
		for(num=0; sum <= 100 ; num++) {
			sum += num;
			System.out.println("num : "+ num + " / sum : " + sum);
		}
		
		/*
		 for(num=0;  ; num++) {
			sum += num;
			System.out.println("num : "+ num + " / sum : " + sum);
			if(sum >= 100)
				break;
		}
		 */
			
		System.out.println("num : " +num);
		System.out.println("sum : " +sum);
	}
}
	

