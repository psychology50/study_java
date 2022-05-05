package javaPractice01;

public class Practice33_Random1 {
	
	public static void main(String[] args) {
		int[] number = new int[10];
		
		for (int i=0; i < number.length ; i++) {
			number[i] = i; // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(number[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
			//System.out.println(Math.random());
			//System.out.println((int)(Math.random() * 3));
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;					// 배열을 섞어준다.
			
		}
		for (int i=0; i < number.length ; i++) {
			System.out.print(number[i]);		// 배열의 내용을 출력한다.
		}
		
	}

}
