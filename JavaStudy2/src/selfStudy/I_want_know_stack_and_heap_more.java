package selfStudy;

import java.util.ArrayList;
import java.util.List;

public class I_want_know_stack_and_heap_more {
	
	public static void main(String[] args) {
		List<String> listArgument = new ArrayList<>();
		// new : 생성하려는 오브젝트를 저장할 수 있는 충분한 공간을 heap 영역에서 찾은 다음
		// 빈 List를 참조하려는 listArgument 라는 로컬변수를 스택에 할당한다.
		//  		STACK											 HEAP
		//		listArgument(참초용 로컬변수)  ------------->	  list | (공간)
		listArgument.add("yaboong");
		// = listArgument.add(new String("yaboong"));
		// new 키워드에 의해 heap 영역에 충분한 공간을 확인한 후 "yaboong"이라는 문자열을 할당한다.
		// 이때 새롭게 생성된 문자열인 "yaboong"을 위한 변수는 stack에 할당되지 않는다. List 내부의 인덱스에 의해 하나씩 add()된 데이터에 대한 레퍼런스 값을 갖게 된다.
		//  		STACK							(			HEAP   				)
		//		listArgument		------------->  list|0 ----------> String | yaboong
		listArgument.add("github");
		//  		STACK				 			(			HEAP   				)
		//		listArgument		------------->  list|0 ----------> String | yaboong
		//											    |1 ----------> String | github
		print(listArgument);
		// 결론: Object 타입의 데이터, 즉 heap 영역의 데이터는 함수 내부에서 파라미터로 copied value를 받아서 변경해도 변경내역이 반영된다.
		System.out.println(listArgument); // [yaboong, github, io]
		
		
		System.out.println("===============아래 코드는 어떤 결과가 나올까??===============");
		
		
		Integer a = 10; // Integer은 Object 타입이므로, 10이 heap 영역으로 할당될 텐데, 왜 값이 바뀌지 않을까??
		System.out.println("Before: " + a);
		changeInteger(a);
		System.out.println("After: " + a);
		
		
		System.out.println("=============== 불변객체(immutable)에 대한 고찰 ===============");
		
		String s = "hello";
		changeString(s);
		System.out.println(s);
		
		// *** Immutable Object ***
		// 값이 변하지 않는다. 변경하는 연산이 수행되면 변경하는 것처럼 보이더라도 실제 메모리에는 새로운 객체가 할당된다.
		// Wrapper class : Integer, Character, Byte, Boolean, Long, Double, Float, Short 클래스는 모두 불변한다.
		// 그래서 heap에 있는 같은 오브젝트를 레퍼런스하고 있어도, 새로운 연산이 적용되는 순간 새로운 오브젝트가 할당된다.
		
		// Integer 클래스 내부에 사용하는 실제 값인 value라는 변수는 private final int value;로 선언되어있다. (final : 상속 제한 제어자)
		// 즉, 생성자에 의해 생성되는 순간에만 초기화되고 변경 불가능한 값이 된다.
		
	}
	
	private static void print(List<String> listParam) { 
		// listParam이라는 참조변수로 인수를 받게 되어있다. 즉, 기존 인자인 listArgument가 가지고 있던 값(List에 대한 레퍼런스)을 listParam이 가지게 된다.
		// print()함수 내부에서 listArgument는 scope 밖에 있게 되므로 접근할 수 없는 영역이 된다.
		String value = listParam.get(0); // List에 있는 데이터에 접근하여 값을 value라는 변수에 저장한다. 이 value는 List 0번째 요소의 참조값을 가지게 된다.
		listParam.add("io");
		System.out.println(value);
	} // 함수가 끝남과 동시에 print()함수의 지역변수는 모두 stack에서 pop되어 사라진다.
	  // 이때, List는 Object 타입이므로 지역변수가 모두 stack에서 pop 되더라도 heap 영역에 그대로 존재할 수 있다.
	  // 즉, listParam과 value만 스택에서 사라지고 나머지는 모두 그대로인 상태로 함수호출이 종료된다. listArgument 변수 활동 재개
	
	
	
	public static void changeInteger(Integer param) {
		param += 10;
	}
	
	
	public static void changeString(String param_s) {
		param_s += " world";
		// chaneString()의 내부동작 과정
		// - main() 메소드의 s변수가 레퍼런스하는 "hello" 오브젝트를 param에 복사하면서 changeString()메소드 시작
		// - param_s += " world"; 는 heap에 "hello world"라는 스트링 오브젝트가 새롭게 할당되는 작업이다.
		// - 기존에 "hello" 오브젝트를 레퍼런스하고 있던 param_s로 새롭게 생성된 스트링 오브젝트인 "hello world"를 레퍼런스 하도록 만듦
		// - changeString() 함수가 종료되면, 새롭게 생성된 "hello world" 오브젝트를 레퍼런스 하는 param_s라는 변수는 스택에서 pop되므로 어느 것도 레퍼런스 하지 않는 상태가 된다.
		// - 이런 경우 "hello world" 오브젝트는 garbage로 분류된다. 그러므로 기존의 "hello"를 레퍼런스 하던 s 변수의 값은 그대로 이다.
	}
	
}
