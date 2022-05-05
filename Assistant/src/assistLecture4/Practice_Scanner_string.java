package assistLecture4;

import java.util.Scanner;

public class Practice_Scanner_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ========= 2. 문자열 ========= //

		// next()
		System.out.println("next()");
				
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
				
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
				
		sc.nextLine(); // Q. 얘를 왜 입력해줘야 하죠..? A. 아래 주석에서 설명하겠습니다.
				
		// nextLine()
		System.out.println("nextLine()");
				
		String str5 = sc.nextLine();
		String str6 = sc.nextLine();
		String str7 = sc.nextLine();
		String str8 = sc.nextLine();
				
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
				
		// next()와 nextLine() 혼용시 문제점.
		/*
		    next() 파트에서 "hello bye java python" 이라고 입력을 해보자.
		  분명히 값이 잘 들어갔다. 문제는 nextLine() 부분에서 발생한다. 내가 입력한 적도 없는 공백이 출력되는 경우다.
		  이건 다른 언어에서도 종종 나타나는 문자열을 입력할 때 나타나는 증상인데 (특히 C언어가 제일 스트레스..)
		    앞서 설명하였듯이 내가 값을 입력하면 버퍼라는 공간에서 기다리다가 '엔터'를 누르면 각각 자기가 들어가야 할 변수로 값이 할당된다.
		  문제는 "hello bye java python"을 누르고 엔터를 칠 때, "\n(엔터)"가 같이 넘어간다.
		    "hello", "bye", "java", "python"을 입력했을 때, str1 = "hello", str2 = "bye", str3 = "java", str4 = "python"이 제각각 주인을 잘 찾아갔는데
		  버퍼 공간에 "\n(엔터)"라는 놈이 제 역할하고 알아서 저승을 가지 못 하고 구천을 떠돌다가 엄한 str5한테 빙의해서 개발자를 골치 아프게 한다.	
		    
		    이를 해결하기 위해 중간에 sc.nextLine();을 끼워넣어준다. 
		  이렇게 되면 '\n'은 변수가 할당되어져 있지 않은 또 다른 버퍼를 타고 그대로 빠져나가 버린다.
		    
		    다행히 자바에서는 이런 현상이 next()와 nextLine()을 혼용하는 경우, 그 중에서도 next()가 nextLine()이 선행되는 경우에만 발생합니다.
		  next()는 개행문자를 받지 못 하지만, nextLine()은 개행문자를 받을 수 있다는 특징 때문입니다.
		 */
		
		
		// nextLine()이 next()보다 선행하면 위와 같은 오류가 발생하지 않는다. next()는 개행문자를 받지 못 해서 빙의가 안 된다.
		
		String str9 = sc.nextLine();
		String str10 = sc.next();
		System.out.println(str9);
		System.out.println(str10);
	}
}
