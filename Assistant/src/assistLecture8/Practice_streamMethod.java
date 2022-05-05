package assistLecture8;

import java.util.*;
import java.util.stream.*;

// Stream의 개념이 어려운 이유
// (1) Stream API는 람다식, 함수형 인터페이스와 굉장히 밀접하게 연관되어 있습니다.
// (2) 문제는 Java는 명령형 프로그래밍입니다. 그런데 JDK8 이상부터 함수형 인터페이스를 통해 Java를 함수형으로 프로그래밍 가능하게 해놨습니다.
// (3) 벌써부터 무슨 말인지 모르겠네요. 어쩔 수 없습니다. 저희가 계속 배우는 언어는 모두 명령형 프로그래밍이었기에
//	   함수형 프로그래밍의 환경을 구현은 커녕, 이 개념부터 붙잡는데 처음에 굉장히 힘듭니다.
// (4) 그런데 이걸 공부해서 사용하실 수 있게 되면, 엄청난 효과를 맛볼 수 있긴 합니다. 근데...어려워...

/*
[1] Stream API
  	1. 자바 스트림(Stream) API : 컬렉션에 저장되어 있는 element들을 추상화시키고, 간단하게 처리할 수 있다.
  	   (1) Java 8 부터 지원한 기능이며, 이전에는 Iterator 클래스를 이용했다.
       (2) 처음 봤을 때, 엄청 어려운 기능처럼 느껴지실 수 있지만, stream 메서드의 존재를 모르는 상태로 리스트에 대해
           공부를 많이 해보신 분이라면 스트림이 굉장히 유용한 기능이라는 것을 알 수 있습니다.
           그리고 stream 자체는 어려운 개념이 아닙니다. (stream을 사용하기 위해 다른 것들을 공부해야 되는데 그것들이 ^___^...)
    2. 특징
       (1) 원본의 데이터를 변경하지 않는다.
           · 원본 데이터를 조회하여, 원본의 데이터가 아닌 별도의 요소들로 stream을 생성한다.
             즉, 정렬이나 필터링 등의 작업은 별도의 stream data들에서 처리가 된다.
           · List<String> sortedList = nameStream.sorted().collect(Collections.toList());
       (2) 스트림은 일회용이다.
           · Stream API는 한 번 사용이 끝나면 재사용이 불가능하다.
           · 또 필요한 경우 stream을 다시 생성해야 하며, 닫힌 stream을 사용하면 IllegalStateException이 발생하게 된다.
           · userStream.sorted().forEach(System.out::print);
             int count = userStream.count(); // 이미 닫힌 스트림을 사용해서 에러 발생
       (3) 내부 반복으로 작업을 처리한다.
           · Stream을 사용하면 코드가 간결해지는 이유 중 하나는 '내부 반복'에 의해서이다.
           · 쉽게 설명하면, 원래 for이나 while등을 써야하는데 stream은 그런 반복 문법을 메서드 내부에 숨기고 있어서 사용자는 훨씬 간단하게 쓸 수 있다.
           · nameStream.forEach(System.out::println); // 반복문이 forEach라는 함수 내부에 숨겨져 있다.
 */

// 클래스, 기본적인 프레임 워크, 제네릭에 대해 알고 있으시다는 가정하에 진행토록 하겠습니다.

public class Practice_streamMethod {
	public static void main(String[] args) {

		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c3", "c2", "c1");
		
		System.out.println(
		myList
			.stream()						// 선언 : stream 객체 생성
			.filter(s -> s.startsWith("c")) // 가공 : 데이터 필터링
			.map(String::toUpperCase)		// 가공 : 데이터 변형
			.sorted()						// 가공 : 정렬
			.count()						// 결과 반환 : 3
		);
		
		
		System.out.println("\n============= 예시 =============\n");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("java", "python", "C")); // ArrayList 생성자를 Arrays 클래스 기반으로 객체 생성
		
		Iterator<String> it = list.iterator(); // Iterator의 객체 it가 list의 요소를 읽어온다.
		
		// 1. Iterator과 반복문을 이용
		while(it.hasNext()) { // hasNext() 메서드로 list의 요소를 하나씩 불러온다. (불러올 값이 없으면 False)
			String value = it.next(); // next() 메서드로 iterator가 가져온 요소를 value에 할당시킨다.
				if(value.equals("python")) { // python이라는 내용이 나오면 출력
					System.out.println("value : " + value);
				}
		}
		
		// 2. for each문으로 살짝 개선 시킨 내용
		for (String value : list) {
			if(value.equals("python")) {
				System.out.println("value : " + value);
			}
		}
		
		// 3. Stream 사용
		list.stream()
		    .filter("python"::equals)
		    .forEach(System.out::println);
		
		System.out.println("\n============= 예시 하나 더 =============\n");
		
		// arr 배열을 li 객체에 넣는 방법
		int[] arr = { 5, 2, 80, 55, 71, 5};
		
		List<Integer> li = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		// 1. Iterator 사용
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]); // set에 arr배열 element 담기
		}
		
		Iterator<Integer> it2 = set.iterator(); // set을 iterator 객체에 담기
		
		while(it2.hasNext()) {
			li.add(it2.next()); // iterator를 li 객체에 담기
		}
		
		li.sort(Comparator.naturalOrder()); // 오름차순 정렬
		
		System.out.println("1번 방법을 이용 : " + li);
		
		// 2. stream 사용 -> 고작 한 줄로 1번과 똑같은 기능을 한다.
		System.out.println("2번 방법을 이용 : " + 
				Arrays.stream(arr).boxed() // stream 생성
				      .distinct() // 중복 제거
				      .sorted(Comparator.naturalOrder()) // 오름차순 정렬
				      .collect(Collectors.toList()) // list로 반환
		);
		
		
	}
}
