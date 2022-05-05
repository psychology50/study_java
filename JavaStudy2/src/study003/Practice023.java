package study003;
import java.util.*;

public class Practice023 {
	
	public static void main(String[] args) {
		// set 컬렉션
		// 1. 저장 순서가 정해지지 않는다.
		// 2. 중복이 허용되지 않는다.		
		Set<String> set = new HashSet<String>();
		
		// 값 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("DataBase");
		set.add("Java"); // 기존값을 제거, 새로운 값으로 대체
		
		// 확인
		System.out.println("저장 개수 : " + set.size());
		
		//반복자 생성
		Iterator<String> iter2 = set.iterator();
		while(iter2.hasNext())//데이터 존재유무확인 
		{
			String tmp = iter2.next();	//이동
			System.out.println(tmp);
		}
				
		//전체 삭제
		//set.clear();
				
		
	}

}
