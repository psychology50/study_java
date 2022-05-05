package study04_DAO;

import java.util.*;
import java.util.Scanner;

import study04_DTO.memberDTO;

public class memberDAO {
	// 싱글톤 패턴
	private static memberDAO instance = new memberDAO();
	private memberDAO() {}
	public static memberDAO getInstance() {
		return instance;
	}
	
	// 저장 매체 연결 (Database or File I/O or 컬렉션 저장)
	public static Map<String, memberDTO> map = new HashMap();
	
	// 기능 추가
	
	// 회원가입
	public void Join() {
		Scanner sc = new Scanner(System.in);
		memberDTO dto = new memberDTO();
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		String age = sc.nextLine();
		System.out.print("연락처 : ");
		String phone = sc.nextLine();
		
		dto.setUserId(userId);
		dto.setName(name);
		dto.setAge(age);
		dto.setPhone(phone);
		
		map.put(userId, dto); // 정보를 map에 넣어준다.
		
	}
	// 회원조회
	public void List() { // 정보를 map에서 꺼내온다.
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		System.out.println("----------[시작] 회원조회---------");
		while(iter.hasNext())
		{
			String key = iter.next();
			memberDTO value = map.get(key);
			System.out.print(value.getUserId()+"\t");
			System.out.print(value.getName()+"\t");
			System.out.print(value.getAge()+"\t");
			System.out.print(value.getPhone()+"\n");
		}
		System.out.println("----------[끝] 회원조회---------");
	}
	
	// 회원수정
	public void Update() { 
		// Thinking about
		// 1. 회원 리스트를 map에서 불러오기 -> 2. 수정을 원하는 계정 선택(질문 출력 및 아이디 입력) -> 3. 재입력 하기 -> 4. 수정된 내용을 map에 넣기
		// 1. 선택 조회
		Scanner sc = new Scanner(System.in);
		System.out.println("조회 ID 입력 : ");
		String userId = sc.nextLine();
		
		memberDTO dto = map.get(userId); // get은 returns을 할 때, 값이 없으면 null값으로 전달한다.
		if(dto != null) {
			// 2. 내용 변경
			System.out.print("이름 : ");
			String name  = sc.nextLine();
			System.out.print("나이 : ");
			String age   = sc.nextLine();
			System.out.print("연락처 : ");
			String phone = sc.nextLine();
			// 3. 저장
			dto.setName(name);
			dto.setAge(age);
			dto.setPhone(phone);
		}
		else {
			System.out.println("해당 ID는 조회되지 않습니다.");
		}
		
		
	}
	
	// 회원삭제
	public memberDTO Delete() {
		// 1. 선택 조회
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 ID 입력 : ");
		String userId = sc.nextLine();
		
		memberDTO rmdto = map.remove(userId); // remove는 returns을 할 때, 값이 없으면 null값으로 전달한다.
		return rmdto;
		
	}

}
