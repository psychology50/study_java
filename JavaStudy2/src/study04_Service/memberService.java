package study04_Service;

import study04_DAO.memberDAO;
import study04_DTO.memberDTO;

public class memberService {
	// 싱글톤 패턴 추가
	private static memberService instance = new memberService();
	private memberService() {};
	public static memberService getInstance() {
		return instance;
	}
	
	// DAO 객체 받아오기
	memberDAO dao = memberDAO.getInstance();
	
	// 서비스 처리
	// 가입함수
	public void memberJoin() {
		dao.Join();
	}
	// 조회함수
	public void memberList() {
		dao.List();
	}
	// 수정함수
	public void memberUpdate() {
		dao.Update();
	}
	// 삭제함수
	public void memberDelete() {
		memberDTO rmdto = dao.Delete();
		if(rmdto==null) 
			System.out.println("삭제에 실패했습니다.");
		else
			System.out.println(rmdto.getName() + "회원정보가 삭제되었습니다.");
	}

}
