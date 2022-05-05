package study003;

import java.util.*;

public class Practice021 {
	
	public static void main(String[] args) {
		// 리스트 생성
		List<C02Board> list = new ArrayList<C02Board>();
		
		// 값 추가
		list.add(new C02Board("제목1", "내용1", "글쓴이1"));
		list.add(new C02Board("제목2", "내용2", "글쓴이2"));
		list.add(new C02Board("제목3", "내용3", "글쓴이3"));
		
		// 확인
		System.out.println("총 저장 객체수 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			C02Board tmp = list.get(i);
			System.out.println("제목 : " + tmp.subject);
			System.out.println("내용 : " + tmp.contents);
			System.out.println("글쓴이 : " + tmp.writer);
			System.out.println();
			
		}
		
		// 삭제
		list.remove(1);
		
		// 전체 삭제 (clear)
		// list.clear();
		
		
	}

}
