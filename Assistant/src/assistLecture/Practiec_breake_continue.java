package assistLecture;
import java.util.Scanner;

// breake와 continue

public class Practiec_breake_continue {
	public static void main(String[] args) {
		
		// [1] break 예제
		System.out.println("======== [1] break ========");
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		while(true) {
			System.out.println("더할 숫자 입력(0입력 시 종료): ");
			i = sc.nextInt();
			if(i==0) {
				System.out.println("반복을 멈춥니다.");
				break;
			}
			sum += i;
		}
		System.out.println("현재까지의 총 합 = " + sum);
		
		// [2] continue : "아래 명령 무시하고, 다음 반복 실행시켜라!"
		System.out.println("======== [2] continue ========");
		int j;
		int sum2 = 0;
		while(true) {
			System.out.println("더할 숫자 입력(0입력 시 종료): ");
			j = sc.nextInt();
			if(j==0) {
				System.out.println("종료");
				break;
			}
			if(j<0) {
				System.out.println("아래 명령을 무시하고 반복!");
				continue; // sum += j를 건너뛰고 바로 while문의 처음으로 돌아간다.
			}
			sum2 += j;
		}
		System.out.println("현재까지의 총 합 = " + sum2);
		
	}

}
