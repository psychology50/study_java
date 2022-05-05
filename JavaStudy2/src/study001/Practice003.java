package study001;

public class Practice003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String data1 = "100";
		int value1 = Integer.parseInt(data1); // 형변환
		System.out.println("value1 : " + value1);
		
		String data2 = "abc100"; // 문자가 섞여있는 경우
		int value2 = Integer.parseInt(data2); // 형변환
		System.out.println("value2 : " + value2);
		} 
		catch(NumberFormatException e) {
			System.out.println("예외처리됨!!");
		}
		finally {
			System.out.println("무조건 실행되어야 하는 코드");
		}
		
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");

	}

}
