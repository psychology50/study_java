// 입력한 달의 계절을 표시
package javaPractice01;
import java.util.Scanner;
public class Practice16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("계절을 표시합니다 \n몇 월입니까? ");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄이었다.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("여름이었다.");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("가을이었다.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울이었다.");
		}
		else
			System.out.println("잘못 입력된 값입니다.");
	}
	
}