package study04_Controller;

import study04_Service.memberService;

public class memberDeleteController implements Controller {

	memberService service = memberService.getInstance();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 서비스 사용
			service.memberDelete();
				
		// 뷰로 전달 ( 뷰는 그냥 콘솔창에 출력하는 걸로~)
		//	System.out.println("삭제 완료!"); // 이 과정을 service에서 포함시켜 버렸음.
	}
	
}
