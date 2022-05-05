package study002;

class C06Simple{

	@Override
	public int hashCode() {

		return 1010;	// 재정의 한다고 해서 실제로 저장된 위치가 바뀌진 않는다. System.identityHashCode(sim1)
	}
	
	
}

public class Practice012 {
	public static void main(String[] args) {
		
		C06Simple sim1 = new C06Simple();
		System.out.println(sim1);
		System.out.println(sim1.toString());
		System.out.printf("%x\n", sim1.hashCode());
		System.out.printf("%x\n",System.identityHashCode(sim1));
	}

}
