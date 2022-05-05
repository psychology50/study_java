package javaPractice01;

public class Practice39 {
	
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}};
		
		int total = 0;
		float average = 0;
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				total += arr[i][j];					
			}			
			average = total / (float)arr.length / (float)arr[0].length; // arr.lengtg : 층 수 = 4, arr[0].length : 칸 수 = 5
		}
		
		System.out.println("total=" + total); // 325
		System.out.println("average=" + average); // 16.25
	}

}
