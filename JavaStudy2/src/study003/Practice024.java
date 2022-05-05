package study003;

import java.util.*;
public class Practice024 {
	
	public static void main(String[] args) {
		//MAP 생성
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//값 저장
		map.put("홍길동", 30);
		map.put("서길동", 40);
		map.put("남길동", 50);
		map.put("동길동", 30);
		map.put("홍길동", 20);
		
		// 확인
		System.out.println("저장 개수 : " + map.size());
		Set<String> keyset = map.keySet();				
		Iterator <String> iter = keyset.iterator(); 
		while(iter.hasNext()) {						// 값의 존재 유무 확인
			String key = iter.next();
			int value = map.get(key);
			System.out.println("KEY : " + key + " VAL : "+value);
		}
		
		// 삭제
		map.remove("홍길동");
		System.out.println("저장 개수 : " + map.size());
		Set<String> keyset2 = map.keySet();
		Iterator <String> iter2 = keyset2.iterator();
		while(iter2.hasNext()) {
			String key = iter2.next();
			int value = map.get(key);
			System.out.println("KEY : " + key + " VAL : "+value);
		}		
	}

}
