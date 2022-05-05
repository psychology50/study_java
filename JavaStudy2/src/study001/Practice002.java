package study001;

public class Practice002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int [] arr = { 10,20,30 };
			for (int i=0; i<4 ; i++) {	// 인덱스의 범위를 벗어남 : ArrayIndexOutOfBoundsException
				System.out.printf("arr[%d] = %d\n", i, arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");

	}

}
