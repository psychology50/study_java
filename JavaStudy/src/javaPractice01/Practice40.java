package javaPractice01;

import java.util.Scanner;

public class Practice40 {
	
	public static void main(String[] args) {
		
		//3명의 신장, 체중, 나이의 최대값을 구해서 표시
		Scanner stdIn = new Scanner(System.in);
		
		int[ ] height = new int[3];	// 신장
		int[ ] weight = new int[3]; // 체중
		int[ ] age    = new int[3]; // 나이
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("[" + (i + 1) + "] ");
			System.out.printf("신장: ");		height[i] = stdIn.nextInt( );
			System.out.printf("    체중: ");    weight[i] = stdIn.nextInt( );
			System.out.printf("    나이: ");	age[i]    = stdIn.nextInt( );
		}
		
		// 신장의 최대값을 구한다.
		int maxHeight = height[0];
		if (height[1] > maxHeight)	maxHeight = height[1];
		if (height[2] > maxHeight)	maxHeight = height[2];
		
		// 체중의 최대값을 구한다.
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];
		
		// 나이의 최대값을 구한다
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];
		
		System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
		System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
		System.out.println("나이의 최대값은 " + maxAge + "입니다.");
		
	}
	

}
