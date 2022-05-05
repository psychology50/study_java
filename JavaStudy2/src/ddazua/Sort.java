package ddazua;

// 1. 알고리즘 : 문제를 해결하기 위한 절차적 해결 과정
// 2. 정렬 알고리즘 : 데이터를 순서대로 나열하기 위한 절차적 과정
// 3. 정렬 알고리즘의 종류
//	  (1) 선택정렬(Selection Sort)  (2) 삽입정렬(Insertion Sort)  (3) 버블정렬(Bubble Sort)

public class Sort {
	public static void main(String[] args) {
		/*
	  	[1] Selection Sort
	  	    · 최솟값 혹은 최댓값을 선택해서 가장 앞에 위치시킨 후 차례로 정리시키는 방법 
			· 장점: 구현이 쉽다.
	  		· 단점: 다른 정렬에 비해 시간이 오래 걸린다.
	  		· Logic
	  		  - 정렬되지 않은 인덱스 맨 앞에서부터 이를 포함한 그 이후의 값 중 더 작은 값을 찾아간다.
	  		  - 더 작은 값을 찾으면 그 값을 현재 인덱스의 값과 바꾼다. 마지막 인덱스까지 훑어 더이상 바뀌지 않을 때까지 반복한다.
	  		  - 다음 인덱스로 이동하여 위 과정을 반복한다.	    		
	     */		
		int arr_select[] = { 8, 1, 2, 5, 4, 3, 6, 7 };  // 1. length는 배열의 길이를 알고자 할 때 사용된다. -> array(int[], double[], String[])
		int min, tmp_select;								    // 2. length()는 문자열의 길이를 알고자 할 때 사용된다. -> String related Object(String, StringBuilder etc)
		for(int i = 0; i< arr_select.length -1; i++ ) {	// 3. size()는 컬렉션프레임워크 타입의 길이를 알고자 할 때 사용된다. -> Collection Object(ArrayList, Set etc)
			min = i;
			for(int j = i+1; j<arr_select.length; j++) {
				if(arr_select[min] > arr_select[j]) {
					tmp_select = arr_select[min];
					arr_select[min] = arr_select[j];
					arr_select[j] = tmp_select;
					
					for(int k = 0; k<arr_select.length; k++) {
						System.out.print(arr_select[k] + " ");
					}
				System.out.println();
				}
			}
		}
		System.out.print("Selection Sort : ");
		for(int i = 0; i<arr_select.length; i++) {
			System.out.print(arr_select[i] + " "); 
		}
		System.out.println();
		System.out.println();
		
		/*
		[2] Insertion Sort
			· 지정한 값의 삽입할 위치를 찾아 정렬하는 방법
			· Logic
			  - 삽입 정렬은 두 번째 인덱스부터 시작한다. (i=1)
		      - 현재 idx는 별도의 변수에 저장한다.       (idx = i)
		  	  - 비교 idx = 현재 dix-1					 (j = j-1)
		  	  - idx값 = 비교 idx의 값					 (inx <-> j)	  
		 */
		int arr_insert[] = { 8, 1, 2, 5, 4, 3, 6, 7 };
		int tmp_insert;
		int idx;
		for(int i=0; i<arr_insert.length; i++) {
			idx = i;
			for(int j=i-1; j>=0; j--) {
				if(arr_insert[idx] < arr_insert[j]) {
					tmp_insert = arr_insert[idx];
					arr_insert[idx] = arr_insert[j];
					arr_insert[j] = tmp_insert;
					idx = j;
					
					for(int k = 0; k<arr_insert.length; k++) {
						System.out.print(arr_insert[k] + " ");
					}
				System.out.println();
				}
				else 
					break;
			}
		}
		System.out.print("Insertion Sort : ");
		for(int i=0; i<arr_insert.length; i++) {		
			System.out.print(arr_insert[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		/*
		[3] Bubble Sort 
		    · 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 알고리즘. 정렬 과정이 거품이 일어나는 것과 비슷하다 하여 버블
		    · 장점 : 구현이 쉽고 코드가 직관적이다.
		    · 단점 : 시간이 오래 걸리고 최선, 최악, 평균 모두 O(n²)이라는 시간복잡도를 가진다.
		    · Logic
		      - 첫 번째 과정을 통해 가장 큰 수가 제일 뒤의 인덱스로 보내지게 된다. (오름차순 기준)
		      - 이 과정을 반복적으로 수행하여 배열을 완성시킨다.
		 */
		int arr_bubble[] = { 6, 4, 7, 9, 1 };
		for(int i = 0; i < arr_bubble.length; i++) {
			for(int j = 0; j < arr_bubble.length -1 -i; j++) {
				if(arr_bubble[j] > arr_bubble[j+1]) {
					int tmp_bubble = arr_bubble[j];
					arr_bubble[j] = arr_bubble[j+1];
					arr_bubble[j+1] = tmp_bubble; 
				}
				
				for(int k = 0; k < arr_bubble.length; k++) {
					System.out.print(arr_bubble[k] + " ");
				}
			System.out.println();
			}
		}
		System.out.print("Bubble Sort : ");
		for(int i = 0; i < arr_bubble.length ; i++) {
			System.out.print(arr_bubble[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 버블 솔트의 최대 단점 : 배열이 끝났는데도 스스로 판단하지 못하고 계속 훑어 봄;
		// 차선책 
		
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
			
			for(int k=0; k< number.length; k++)											// var a = "test";		a: "test" (조건문 사용시 true)	
				System.out.print(number[k]); // 정렬된 결과를 출력한다.					// var b = !"test";		b: false
			System.out.println();		
		}
		
	}

}
