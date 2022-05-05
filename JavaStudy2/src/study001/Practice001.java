package study001;

public class Practice001 {
	
	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString()); // 예외발생!!
		} 
		catch(NullPointerException e) {
			System.out.println("예외가 발생되었음!");
			System.out.println(e.getCause()); // 예외 원인 출력 -> null 출력
			System.out.println(e.toString()); // 객체의 정보 확인
			System.out.println(e.getStackTrace()); // 예외 객체 식별 주소
		}
		
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		
	}

}
