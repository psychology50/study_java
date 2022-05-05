package study002;

public class Practice014 {
	
	public static void main(String[] args) {
		
		// 방법1
		//Class c1 = study001.Practice001.class;
		
		// 방법2
		//Class c1 = Class.forName("study001.Practice001");
		
		// 방법3
		//C07Simple sim = new C07Simple(10, 10.5, "홍길동");
		//Class c1 = sim.getClass();
		
		String str = new String("TEST");
		Class c1 = str.getClass();
		
		// 결과확인
		
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());	// 객체의 클래스 알아내기
		System.out.println(c1.getPackage().getName());	// 객체의 패키지 알아내기
	}

}
