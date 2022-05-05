package assistLecture7;

public class Practice_gugudan {
	public static void main(String[] args) {
		
		// 2중 while문 gugudan
		// 2 ~ 9단
		
		// 2 x 1 = 2
		// 2 x 2 = 
		// 2 x 3 = 
		// 2 x 4 = 
		// ....
		
		// 3 x 1 
		// 3 x 2 
		// 3 x 3 
		// ....  
		
		int i = 2;
		
		while(i <= 9) {
			
			System.out.println("======="+ i + "단 =======");
			
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
			
			
		}
				
	}
}
