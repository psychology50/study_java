package selfStudy;

// toString()과 String.valueOf()의 차이점

// 공통점 : 두 Method 모두 Object의 값을 String 타입으로 변환한다.

// 차이점
// · toString() : Null Pointer Exception(NPE) 발생
// · String.valueOf()  : "null"이라는 문자열로 처리한다. -> 항상 String 형태로 출력
// · String <casting>  : 변수가 null이면 "null"반환. 변수가 문자열이 아니면 ClassCastException 발생


public class I_want_know_about_String {
	public static void main(String[] args) {
		String str1 = null;
		int int1 = 1;
		String str2 = null;
		String str3 = null;
		
		// 문자열 "null"을 반환 - casting
		System.out.println((String) str1);
//		try {
//			System.out.println((String) int1);  // 예외처리로 커버할 수 있는 영역이 아님.
//		} catch(ClassCastException e) {
//			System.out.println(e.toString());
//		}
		
		// 문자열 "null"을 반환 - valueOf()
		System.out.println(String.valueOf(str2));
		
		// NPE 발생 - toString()
		try {
			System.out.println(str3.toString());
		} catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		
		// ============ 더 알아보자 ============ //
		
		// String.valueOf()의 null Check
		String lowerCoatingVal1 = String.valueOf(str1);
		if("null".equals(lowerCoatingVal1)) {
			System.out.println("lowerCoatingVal1는 null 문자열을 가지고 있다.");
		}
		// null로 인해 발생된 에러는 시간이 흐르고, 혹은 타인의 소스인 경우 디버깅이 어렵고
		// 어떤 의미를 내포하고 있는지 판단이 어렵기 때문에 valueOf를 사용하는 것이 낫다.
		
		// ============ .equals에 대한 팁 ============ // 
		// equals함수를 사용할때 왼쪽에 있는 것을 기준으로 비교하기 때문에 변수보다는 문자열을 왼쪽에 두는 것을 추천한다.
		
		String strTestVal1 = null;
		String ret = "";
		
//		if( !(strTestVal1.equals("")) ) ret = "1";	// NPE발생
		
		if( !("".equals(strTestVal1)) ) ret = "2";
			
		
		// 즉 strTestVal이 null인 경우 ret = "1"인 if문은 NPE를 발생시킨다.
		
	}

}
