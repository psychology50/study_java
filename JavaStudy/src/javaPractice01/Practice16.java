// �Է��� ���� ������ ǥ��
package javaPractice01;
import java.util.Scanner;
public class Practice16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ǥ���մϴ� \n�� ���Դϱ�? ");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("���̾���.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("�����̾���.");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("�����̾���.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("�ܿ��̾���.");
		}
		else
			System.out.println("�߸� �Էµ� ���Դϴ�.");
	}
	
}