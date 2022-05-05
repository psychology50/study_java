package javaPractice01;

class Account {
	String name;		// 예금주명
	String no;			// 계좌번호
	long balance;		// 예금잔액
	
}

public class Practice48 {
	
	public static void main(String[] args) {
		Account chulsoo = new Account( );	// 철수의 계좌
		Account younghee = new Account( );  // 영희의 계좌
		// in a = 1;  과 다를 바 없다.
		
		chulsoo.name    = "철수";
		chulsoo.no		= "123456";
		chulsoo.balance = 1000000;
		
		younghee.name    = "영희";
		younghee.no		 = "654321";
		younghee.balance = 200000;
		
		chulsoo.balance -= 200000;
		younghee.balance +=  100000;
		
		System.out.println("철수의 계좌");
		System.out.println("  계좌명의 : " + chulsoo.name);	 // 계좌명의 : 철수
		System.out.println("  계좌번호 : " + chulsoo.no);	  	 // 계좌번호 : 123456
		System.out.println("  예금잔고 : " + chulsoo.balance); // 예금잔고 : 800
		
		System.out.println("영희의 계좌");
		System.out.println("  계좌명의 : " + younghee.name);	  // 계좌명의 : 영희
		System.out.println("  계좌번호 : " + younghee.no);	  // 계좌번호 : 654321
		System.out.println("  예금잔고 : " + younghee.balance); // 예금잔고 : 300
				
	}

}
