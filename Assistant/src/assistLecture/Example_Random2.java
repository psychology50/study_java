package assistLecture;

// 버블 정렬(Bubble Sort)라는 가장 기본적인 정렬 알고리즘입니다. 단, 이해 못하시겠으면 굳이 다 보려고 하지 마시고 
// 11~15번 줄의 랜덤값을 배열에 삽입하는 코드와 
// 20번 줄과 27번, 31번 줄이 서로 어떤 원리로 작동하여 break가 실행되는지 정도만 확인하셔도 무방합니다.
// random과 for반복문, break문을 한 번에 생각해볼 수 있는 예제라 보여드리고 싶었던 것이기에 23~26번, 33번 아래는 안 배우셨으면 넘기시면 됩니다.

public class Example_Random2 {
	public static void main(String[] args) {
		
		int[] number = new int[10]; // int형 배열의 공간을 힙 영역에 할당한 후 참조 변수(객체) number 생성
		
		for(int i = 0; i <number.length; i++) {
			System.out.print(number[i] = (int)(Math.random()*10)); // random메서드는 doubleType 자료형을 반환하므로 명시적 형 변환			
		}												           // 10을 곱하는 이유는 0.0~1.0미만의 수를 반환하기 때문..
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<number.length; i++) {
			boolean changed = false; // boolean 자료형의 changed 변수에 false 값 삽입
			
			for(int j=0; j<number.length-1-i; j++) {
				if(number[j] > number[j+1]) {
					int temp_cgd = number[j];
					number[j] = number[j+1];
					number[j+1] = temp_cgd;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로 바꾼다.
				}
			}
			
			if (!changed) break; // if(!boolean) = if(boolean == false) // 즉, changed 값이 false(자리바꿈이 없다)일 때, 반복문을 종료시킨다.
			
			for(int k=0; k< number.length; k++)											
				System.out.print(number[k]); // 정렬된 결과를 출력한다.					
			System.out.println();		
		}
	}
	
	

}
