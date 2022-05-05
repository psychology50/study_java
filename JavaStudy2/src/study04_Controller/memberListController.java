package study04_Controller;

import study04_Service.memberService;

public class memberListController implements Controller {

	memberService service = memberService.getInstance();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		// 서비스 사용
		service.memberList();
		
		// View로 전달
		System.out.println("조회 완료!");
		
	}
	
}
