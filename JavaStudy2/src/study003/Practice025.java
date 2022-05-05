package study003;

import java.util.*;

public class Practice025 {
	
	public static void main(String[] args) {
		// 생성
		Map<String, C06Students> map = new HashMap();
		
		// 삽입
		map.put("aaa", new C06Students("aaa", "에이", "컴퓨터 공학", "010-2222-3333"));
		map.put("bbb", new C06Students("bbb", "비이", "국어국문과", "010-3333-4444"));
		map.put("ccc", new C06Students("ccc", "씨이", "화학공학과", "010-4444-5555"));
		map.put("ddd", new C06Students("ddd", "디이", "현대무용학", "010-5555-6666"));
		
		// 확인
		System.out.println("저장개수 : " + map.size());
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			C06Students val = map.get(key);
			System.out.println("ID : " + val.userid);
			System.out.println("이름 : " + val.name);
			System.out.println("전공 : " + val.major);
			System.out.println("PH : " + val.phone);
		}
		
	}
	
	
}