package study04_Controller;

import study04_Service.memberService;

public class memberUpdateController implements Controller {

	memberService service = memberService.getInstance();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		// 서비스 사용
			service.memberUpdate();
				
		// View로 전달
			System.out.println("수정 완료!");
	}
	
}
