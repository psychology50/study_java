package study04_Controller;

public class FrontController {
	
	// 멤버 컨트롤러 참조변수 추가
	memberJoinController memberJoin;
	memberDeleteController memberDelete;
	memberListController memberList;
	memberUpdateController memberUpdate;
	
	// 싱글톤 패턴 처리
	private static FrontController instance = new FrontController();
	private FrontController() { // 객체를 하위 컨트롤러에 바인딩(연결)해주는 작업
		memberJoin	 = new memberJoinController();
		memberDelete = new memberDeleteController();
		memberList   = new memberListController();
		memberUpdate = new memberUpdateController();
	};
	public static FrontController getInstance() {
		return instance;
	}
	
	// 사용자 요청값을 받아서 처리하는 함수
	public void Forwarder(String No) {
		// 1, 2, 3, 4 확인 후 해당 처리 컨트롤러로 전달
		if(No.equals("1"))		// 가입
		{
			memberJoin.execute();
		}
		else if(No.equals("2")) // 조회	
		{
			memberList.execute();
		}
		else if(No.equals("3")) // 수정
		{
			memberUpdate.execute();
		}
		else if(No.equals("4")) // 삭제
		{
			memberDelete.execute();
		}
		else if(No.equals("5"))
		{
			System.out.println("종료되었습니다.");
			System.exit(0);
		}
	}

}
// Q: 이 과정이 필요한 이유..??
// index						Fcontroller 객체									 Model
// fcontroller	------------	memberjoin		---------- join	  ------------------ servide <-> DAO <-> DTO
//								memberlist		---------- list
//								memberupdate	---------- update
//								memberdelete	---------- delete
//
