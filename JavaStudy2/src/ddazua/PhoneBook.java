package ddazua;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
	static HashMap<String, String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		while(true) {
			System.out.println("****** 전화번호부 ******");
			System.out.println("1. 고객 정보 저장");
			System.out.println("2. 고객 정보 검색");
			System.out.println("3. 고객 정보 출력");
			System.out.println("4. 끝내기");
			System.out.print("번호 입력: ");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("============= 고객 정보 저장 =============");
				insert();
			}
			else if(choice == 2) {
				System.out.println("============= 고객 정보 검색 =============");
				search();
			}
			else if(choice == 3) {
				System.out.println("============= 고객 정보 출력 =============");
				show();
			}
			else if(choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("지원하지 않는 기능입니다.");
				break;
			}
		}
	}
    
	public static void insert() {
		String name, phone;
		System.out.print("저장할 고객의 이름: ");
		name = sc.next(); // name이 key이므로, 중복 허용 불가!
		if(hm.containsKey(name)) {
			System.out.println("이미 존재하는 이름입니다.");
			return;
		}
		else {
			System.out.print("저장할 고객의 번호: ");
			phone = sc.next();							// next()	  : 띄어쓰기를 기준으로 그 전까지만 입력받는다
			hm.put(name, phone);						// nextLine() : 띄어쓰기를 포함해 모든 문장을 입력받는다.
			System.out.println("저장 완료!");
		}
	}
	public static void search() {
		String searchName;
		System.out.print("검색할 이름: ");
		searchName = sc.next();
		if(hm.containsKey(searchName)) { // 존재해야 검색 가능!
			System.out.println("검색 완료!");
			System.out.println("검색된 전화번호: " + hm.get(searchName));
		}
		else {
			System.out.println("검색된 이름이 없습니다.");
		}
		
	}
	public static void show() {
		Set<String> keyset = hm.keySet();
		Iterator i = keyset.iterator(); // 순차적으로 읽어올 수 있음
		while(i.hasNext()) {
//			String curName = i.next(); => 에러발생! next()가 반환하는 타입이 오브젝트 타입이기 때문
			String curName = (String)i.next(); // 명시적 형 변환 필요
			System.out.println("name: " + curName + ", phone: " + hm.get(keyset));
		}
		
		
	}
}
