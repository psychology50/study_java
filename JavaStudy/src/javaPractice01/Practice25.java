package javaPractice01;

public class Practice25 {
	
	public static void main(String[] args) {
		
		int sum=0;
		int num=1;
		/*
		for (num=1, sum =0; num <=10; num++) {
			sum += num;
		*/
		
		while (num <= 10) {
			sum += num;
			num ++;
			
		
		}
		System.out.println("1부터 10까지의 합은" +sum +"입니다.");
	}

}
