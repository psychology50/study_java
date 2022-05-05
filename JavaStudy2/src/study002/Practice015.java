package study002;

// 리플렉션 (reflection)
// : 사용하려는 클래스의 자료형을 모르는 상태에서 class 클래스를 활용하여, 해당 클래스의 정보를 가져오고, 이것들을 활용하여 인스턴스 생성이나 매서드를 호출하는 방식이다.

// 관련 클래스
// java.lang.reflect.Constructor;
// java.lang.reflect.Field; 
// java.lang.reflect.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field; 
import java.lang.reflect.Method;

public class Practice015 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c1 = Class.forName("java.lang.String");		
		
		// 1. 생성자 확인
//		Constructor[] cons = c1.getConstructors();
//		for (Constructor c : cons) {
//			System.out.println("생성자 : " + c);
//		}
		
		// 2. 필드 확인
//		Field[] fields = c1.getFields();
//		for(Field f : fields) {
//			System.out.println("멤버변수 : " + f);
//		}
		
		// 3. 멤버 메서드 확인
		Method[] ms = c1.getMethods();
		for(Method m : ms) {
			System.out.println("멤버함수 : " + m);
		}
		
		
	}

}

/*
  1. Object 클래스란?
  2. Object toString()?
  3. Object equals()?
  4. Object hashCode()?
  5. 객체복제
  6. Class Class + reflect
 
 */
