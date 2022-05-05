package study05;

// 플레이어 인터페이스
interface Player {
	void play(); 		// 재생
	void stop();		// 정지
	
}

// ==== 비디오 플레이어 ==== //
class VideoPlayer implements Player {
	private int id;				// 제조번호
	private static int count = 0;		// 현재까지 할당된 제조번호
	
	public VideoPlayer() {			// 생성자
		id = ++count;;
	}
	public void play() {			// 재생
		System.out.println("∎ 비디오 재생시작!");
	}
	public void stop() {			// 정지
		System.out.println("∎ 비디오 재생종료!");
	}
	public void printInfo() {		// 제조번호 표시
		System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
	}
}

// ==== CD 플레이어 ==== //
class CDPlayer implements Player {
	
	public void play() {		// 재생
		System.out.println("⊡ CD 재생시작!");
	}
	
	public void stop() {		// 정지
		System.out.println("⊡ CD 재생종료!");
	}
	
	public void cleanin() {		// 헤드 청소
		System.out.println("헤드를 청소했습니다.");
	}
}

public class Practice032 {
	public static void main(String[] args) {
		Player[ ] a = new Player[2];
		a[0] = new VideoPlayer( );	// VideoPlayer 
		a[1] = new CDPlayer( );  // CDPlayer
		
		for (Player p : a) {	// for-each 문
			p.play(); 		// 재생
			p.stop();       // 정지
			System.out.println();
		}
	}

}
