package selfStudy;

public class I_want_know_about_garbage_collection {
	
	public static void main(String[] args) {
		String url = "https://";
		//  		STACK									 HEAP
		//			 url    	 	 ------------->		String | https://
		url += "yaboong.github.io";
		//  		STACK									 HEAP
		//			         	 	 ------------->		String | https://
		//			 url    	 	 ------------->		String | https://yaboong.github.io
		// 덧붙이는 것이 아니라, 문자열에 대한 더하기 연산이 수행된 결과가 새롭게 heap 영역에 할당된다.
		// 그리고 기존에 "https://"를 레퍼런스하던 url 변수는 새롭게 생성된 문자열을 레퍼런스하게 된다.
		// ※ 기존의 "https://" 문자열을 레퍼런스 하고 있는 변수는 없으므로 Unreachable 오브젝트가 된다.
		// Unreachable Object : stack에서 도달할 수 없는 heap 영역의 객체 (우선적으로 메모리에서 제거됨) 
		System.out.println(url);
	}

}
