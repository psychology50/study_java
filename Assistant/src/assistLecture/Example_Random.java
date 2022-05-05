package assistLecture;
import java.util.*;

// 랜덤으로 만들어진 숫자를 맞춰야 멈추는 프로그램

public class Example_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Random random = new Random();			// random 객체 생성
		
		int user = -1; // 내가 입력할 값. => -1로 지정한 이유 : 시작부터 rnum과 답이 일치할 수 있기 때문, 1이상 100이하만 아니면 어떤 수를 넣어도 상관없다.
		int rnum = random.nextInt(100) + 1; // range 1 ~ 100
		while(rnum != user) {	// 랜덤값과 내가 입력한 값이 일치하면 false값을 반환시켜 작동이 멈춘다..
			System.out.println("숫자 입력: ");
			user = sc.nextInt();
			if(rnum < user) {
				System.out.println("Down!");
			}
			else if(rnum > user) {
				System.out.println("Up!");
			}
			else {
				System.out.println("정답!");
			}
		}
	}

}
