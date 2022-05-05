package study003;

import java.util.*;
import java.util.Scanner;

public class Practice022 {
	
	public static void main(String[] args) {
		// 리스트 생성
		List<ProFile> list = new ArrayList<ProFile>();
		
		Scanner pf = new Scanner(System.in);
		String name; String age; String addr;
		
		// 값 추가
		for (int i = 0; i < 3 ; i++) {
			System.out.printf("%d번째 이름을 입력해주세요 : ", i+1);
			name = pf.nextLine();
			System.out.printf("%d번째 나이를 입력해주세요 : ", i+1);
			age = pf.nextLine();
			System.out.printf("%d번째 주소를 입력해주세요 : ", i+1);
			addr = pf.nextLine();
			list.add(new ProFile(name, age, addr));
		}
		
		// 확인
		System.out.println("총 저장 객체수 : " + list.size());
				
		for (int i = 0; i < list.size(); i++) {
			ProFile tmp = list.get(i);
			System.out.println("이름 : " + tmp.name);
			System.out.println("나이 : " + tmp.age);
			System.out.println("주소 : " + tmp.addr);
			System.out.println();			
		}
		
		
	}

}
