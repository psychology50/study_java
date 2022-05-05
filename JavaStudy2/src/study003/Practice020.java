package study003;

import java.util.*;
//컬렉션 전에 제너릭 파트를 먼저 공부할 것..!!!!! 사정상 컬렉션 먼저 설명
public class Practice020 {
	
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<String>();	
		// ArrayList의 단점 : 특정 위치에 데이터를 저장을 시도할 때, 그 뒤에 있는 모든 데이터가 한 칸씩 밀려난다. -> 처리시간이 오래 걸림(오버헤드)
		
		// 추가
		list.add("JAVA");
		list.add("JDBC");
		list.add("JSP/Servlet");
		list.add(2, "DataBase");
		
		// 확인
		System.out.println("저장 Data 개수 : "+ list.size() + "개");
		
		// 확인
		for (int i =0; i < list.size(); i++) {	
			// String tmp = list.get(i); 로 입력 후 tmp를 출력하는 것과 차이 없음.
			System.out.println(i +" : "+ list.get(i));
		}
		System.out.println();
		
		// 삭제
		
		list.remove(1);
		list.remove("DataBase");
		
		// 확인
		System.out.println("저장 Data 개수 : "+ list.size() + "개");
		for (int i =0; i < list.size(); i++) {	
			// String tmp = list.get(i); 로 입력 후 tmp를 출력하는 것과 차이 없음.
			System.out.println(i +" : "+ list.get(i));
		}
				
		
		
	}

}
