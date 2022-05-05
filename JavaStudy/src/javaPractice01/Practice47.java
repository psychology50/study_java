package javaPractice01;

public class Practice47 {
	// 두 사람의 은행계좌 데이터를 취급하는 프로그램
	//Run|Debug
	public static void main(String[] args) {
		String chulsooAccountName	 = "철수";			// 철수의 계좌명의
		String chulsooAccountNo		 = "123456";		// 철수의 계좌번호
		long   chulsooAccountBalance = 1000;			// 철수의 예급잔고
		
		String youngheeAccountName	  = "영희";			// 영희의 계좌명의
		String youngheeAccountNo	  = "654321";		// 영희의 계좌번호
		long   youngheeAccountBalance = 200;			// 영희의 예급잔고
		
		chulsooAccountBalance -= 200;					// 철수가 200원을 인출
		youngheeAccountBalance += 100;					// 영희가 100원을 예금
		
		System.out.println("철수의 계좌");
		System.out.println("  계좌명의 : " + chulsooAccountName);	 // 계좌명의 : 철수
		System.out.println("  계좌번호 : " + chulsooAccountNo);	  	 // 계좌번호 : 123456
		System.out.println("  예금잔고 : " + chulsooAccountBalance); // 예금잔고 : 800
		
		System.out.println("영희의 계좌");
		System.out.println("  계좌명의 : " + youngheeAccountName);	  // 계좌명의 : 영희
		System.out.println("  계좌번호 : " + youngheeAccountNo);	  // 계좌번호 : 654321
		System.out.println("  예금잔고 : " + youngheeAccountBalance); // 예금잔고 : 300
	}
}
