package study04_Controller;

import study04_Service.memberService;

public class memberJoinController implements Controller {
	// 인터페이스 : 미완성된 멤버변수나 메서드가 포함되어 있는 것.
	//				public void execute()를 복붙하지 않고 한 번에 상속시키는 방법.
	memberService service = memberService.getInstance();
	@Override
	public void execute() {
		
		// 서비스 사용
		service.memberJoin();
		
		// 뷰로 전달 ( 뷰는 그냥 콘솔창에 출력하는 걸로~)
		System.out.println("완료!");
		
		
				
		
	}
	
	

}
