package selfStudy;


public class I_want_know_about_stack_and_heap {
	
	// 1. Stack
		//	- Heap 영역에 생성된 Object 타입의 데이터의 참조값이 할당된다.
		//	- 원시 타입의 데이터가 값과 함께 할당된다.
		//	- 지역변수들은 scope에 따른 visibility를 가진다.
		// 	- 각 Thread는 자신만의 stack을 가진다.
	
	public static void main(String[] args) {
		int argument = 4;
		argument = someOperation(argument); // 인자만 넘겨주고 scope가 someOperation 함수로 이동한다.
	}
	private static int someOperation(int param) {
		int tmp = param * 3;
		int result = tmp / 2;
		return result;
	}
	// 2. Heap
	//	- 주로 긴 생명주기를 가지는 데이터들이 저장된다. (대부분 오브젝트는 크기가 크고, 서로 다른 코드블럭에서 공유되는 경우가 많다.)	
	//	- 애플리케이션의 모든 메모리 중 Stack에 있는 데이터를 제외한 부분과 비슷하다.
	//	- 모든 Object 타입 (Integer, String, ArrayList, ,,,)은 heap 영역에 생성된다.
	//	- 몇 개의 스레드가 존재하든 상관없이 단 하나의 Heap 영역만 존재한다.
	//	- Heap 영역에 있는 오브젝트들을 가리키는 레퍼런스 변수가 Stack에 올라간다.

	int port = 4000;
	String host = "localhost"; // String은 Object를 상속받아 구현됨.
	// Object 타입은 최상위 부모클래스이므로 heap 영역에 할당되고, stack에 host라는 이름으로 생성된 변수에는
	// heap에 있는 "localhost"라는 스트링을 레퍼런스(참조) 하게 된다.
	//				STACK									HEAP
	//			 port = 4000
	//  		     host  		------------------------> String | localhost
	

	// 더 심도있게 내용을 다뤄보자.
	
	
}


