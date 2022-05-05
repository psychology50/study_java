package javaPractice01;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		// 짝수, 홀수 구분
		System.out.println(a % 2);
		System.out.println(b % 2);
		System.out.println();
		
		int x = -1;
		int y = 2;
		
		System.out.println(x);
		System.out.println(-x);
		System.out.println(-y);
		System.out.println();
		
		int i = 1;
		System.out.println(i);
		i++; // i값을 1 증가
		
		System.out.println(i);
		System.out.println(++i); //증가시킨 후 출력
		System.out.println(i++); //출력시킨 후 증가
		System.out.println(i);
		System.out.println();
		
		int n = 10;
		int v = 20;
		int t = 30;
		System.out.println(n > v);
		System.out.println(n < v);
		System.out.println(n+v <= t);
		System.out.println(n+v >= t);

	}
}
