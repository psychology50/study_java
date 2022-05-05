public class MyStudy001 {
	
	// 랜덤 생성 후 숫자 정렬
	public static void main(String[] args) {
		int[] number = new int[10];
		
		// ① 랜덤으로 수를 정렬하여 1회 출력
		for (int i=0; i < number.length ; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10)); // 배열의 칸 수만큼 랜덤으로 숫자를 나열해 number에 저장한다.
		}															 // Math.random() 함수 : double형으로 0.0~1.0 미만 사이의 값을 반환하는 함수
		System.out.println();										 // (int)(Math.random() * 10) -> 10을 곱하여 범위를 0.0 이상 10.0 미만으로 정하고 정수형태로 변환
		System.out.println();
		
		// ② 위의 배열을 섞어서 출력. 출력되는 개수가 랜덤, 최대 10번까지 반복 가능 ... number.length만큼 반복하므로
		for (int i=0; i<number.length;i++) {
			boolean changed = false;		// 자리바꿈이 발생했는지 체크한다
		
			for(int j=0; j<number.length-1-i; j++) {									// 이해가 안 가는 부분	
				if(number[j] > number[j+1]) { // 옆의 값이 크면 서로 바꾼다.			// 1. 18번 라인 j<number.length-1-i
					int temp = number[j];												// -1은 범위가 넘어가지 않도록 하기 위함일 것. 그렇다면 -i는??
					number[j] = number[j+1];											// -i는 처리된 과정은 넘기기 위한 것. bubble sort 버블 정렬 참조
					number[j+1] = temp;												
					changed = true; // 자리바꿈이 발생했으니 changed를 true로					
				} // end if
			} // end for j
			
			if (!changed) break; // 자리바꿈이 없으면 반복문을 벗어난다. 만약, 자리바꿈이 일어나 for문에서 changed가 true가 됐다면 (!changed) = false. break 안 걸림
			
			for(int k=0; k< number.length; k++)											// var a = "test";		a: "test" (조건문 사용시 true)	
				System.out.print(number[k]); // 정렬된 결과를 출력한다.					// var b = !"test";		b: false
			System.out.println();														// var c = !!"test";    c: true -> !!는 명시적 형변환에 사용
		} // end for i
	}

}
