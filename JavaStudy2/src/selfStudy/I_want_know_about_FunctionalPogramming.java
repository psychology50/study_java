package selfStudy;

import java.util.*;
import java.util.stream.Collectors;

/*
[1] 함수형 프로그래밍 (Functional Programming)
    1. 프로그래밍 패러다임
       (1) 명령형 프로그래밍 : 무엇(What)을 할 것인지 나타내기보다 어떻게(How) 할 건지를 설명하는 방식
           · 절자척 프로그래밍 : 수행되어야 할 순차적인 처리 과정을 포함하는 방식 (C, C++)
           · 객체 지향 프로그래밍 : 객체들의 집합으로 프로그램의 상호작용을 표현 (C++, C#, Java, Python)
       (2) 선언형 프로그램밍 : 어떻게(How) 할 것인지보다 무엇(What)을 할 것인지를 설명하는 방식
           · 함수형 프로그래밍 : 순수 함수를 조합하고 SW를 만드는 방식 (클로저, 하스켈, 리스프)
    2. 등장 배경
       · "대입문이 없는 프로그래밍"
       · 명령형 프로그래밍의 단점 -> SW의 크기가 커질 수록 '스파게티 코드' 유지 및 보수가 매우 힘들어짐
       · 함수형 프로그래밍의 장점 -> 거의 모든 것을 순수 함수로 나누어 문제를 해결함
                                     작은 문제를 해결하기 위한 함수 작성으로 가독성을 높이고 유지 및 보수를 용이하게 해줌
    3. 이해
       (1) 대입문이 없고, 작은 문제를 해결하기 위한 함수를 작성한다? 무슨 뜻일까
       (2) 예시
           · 명령형 프로그래밍
             for(int i=1; i<10; i++) { System.out.println(i); }
           · 함수형 프로그래밍
             process(10,print(num));
             >>> process 함수는 첫 번째 인자로 몇까지 iteration을 돌 것인가를 매개변수로 받으며,
                                두 번째 인자로 전달받은 값을 출력하라는 함수를 매개변수로 받는다.
                 무엇(What)에 포커스를 두기 때문에 함수형 프로그래밍에서는 '출력을'하는 함수를 파라미터로 넘길 수 있으며,
                 이는 함수형 프로그래밍의 기본 원리 중, 함수를 1급 객체(First-Class Object)로 관리하는 특징 탓이다.
     4. 특징
        (1) "부수 효과가 없는 순수 함수를 1급 객체로 간주하여 파라미터로 넘기거나 반환값으로 사용할 수 있으며, 참조 투명성을 지킬 수 있다."
        (2) 부수 효과 (Side Effect) : 변화가 발생하는 작업들
            · 변수 값을 변경
            · 자료 구조를 제자리에서 수정
            · 객체의 필드값 설정
            · 예외나 오류 발생하며 실행이 중단됨
            · 콘솔 또는 파일 I/O가 발생함
        (3) 순수 함수 (Pure Function)
            - 순수 함수의 종류
              · Memory or I/O 관점에서 Side Effect가 없는 함수
              · 함수의 실행이 외부에 영향을 끼치지 않는 함수
            - 효과
              · 함수 자체가 독립적이며 Side-Effect가 없기 때문에 Thread에 안정성 보장을 받을 수 있다.
              · Thread에 안정성을 보장받아 병렬 처리를 동기화 없이 진행할 수 있다.
        (4) 1급 객체 (First-Class Object)
            · 변수나 데이터 구조 안에 담을 수 있다.
            · 파라미터로 전달할 수 있다.
            · 반환값으로 사용 가능하다.
            · 할당에 사용된 이름과 무관하게 고유한 구별이 가능하다.
        (5) 참조 투명성 (Referential Transparency)
            · 동일한 인자에 대해 항상 동일한 결과를 반환해야 한다.
            · 참조 투명성을 통해 기존의 값은 변경되지 않고 유지된다. (Immutable Data)
        (6) 정리
            · 명령형/함수형 프로그래밍에서 사용하는 함수는 부수효과의 유/무 차이에서 비롯한다.
            · 참조에 투명하다 = 함수를 싱행해도 어떠한 상태의 변화 없이 항상 동일한(투명한) 결과를 반환하여, 실행 결과를 참조(예측) 가능하게 한다. 
            · 핵심 동기 : 부작용을 제거하여 프로그램 동작을 이해하고 예측을 용이하게 하는 것.
[2] Java를 이용한 함수형 프로그래밍
    
  
 */

public class I_want_know_about_FunctionalPogramming {
	
	private static List<String> words = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");
	
	// 1. 함수형을 적용하지 않은 코드
	private static Map<String, Integer> wordPrefixFreq() {
		Map<String, Integer> wordCountMap = new HashMap<>();
		String prefix;
		Integer count;
		for(String word:words) {
			prefix = word.substring(0, 1);
			count = wordCountMap.get(prefix);
			if(count == null) {
				wordCountMap.put(prefix, 1);
			} else {
				wordCountMap.put(prefix,  count+1);
			}
		}
		
		return wordCountMap;
	}
	
	// 2. 함수형을 적용한 코드
	private static Map<String, Integer> wordPrefixFreq2() {
		Map<String, Integer> wordCountMap = new HashMap<>();
		words.stream().map(w->w.substring(0,1)).forEach(prefix -> wordCountMap.merge(prefix,  1,  (oldValue, newValue) -> (newValue += oldValue)));
		
		return wordCountMap;
	}
	
	// 3. 몇 가지 제약이 걸렸을 경우
	      /*
	        · 단어의 크기가 2 이상인 경우에만 처리를 할 것
	        · 모든 단어를 대문자로 변환하여 처리를 할 것
	        · 스페이스로 구분한 하나의 문자열로 변환할 것
	       */
	public static String wordPrefixFreq3() {
		return words.stream().filter(w -> w.length() > 1).map(String::toUpperCase).map(w -> w.substring(0, 1)).collect(Collectors.joining(" "));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("=============== [1] 함수형을 적용하지 않은 코드 ===============\n");
		
		final Map<String, Integer> map = wordPrefixFreq();
		map.keySet().forEach(k -> System.out.println(k + ":" + map.get(k)));
		// List를 루프를 돌면서 접두사를 잘라내고, 그 개수를 Map에 저장하고 있다.
		
		System.out.println("=============== [2] 함수형을 적용한 코드 ===============\n");
		
		final Map<String, Integer> map2 = wordPrefixFreq2();
		map2.keySet().forEach(k -> System.out.println(k + ":" + map.get(k)));
		// 1. stream()을 통해 함수형 프로그래밍을 위한 Stream 객체를 생성한다
		// 2. map()을 통해 Stream 객체의 단어들을 prefix로 변형시키고 있다.
		// 3. forEach를 통해서 prefix를 보고 map에 값을 추가하고 있다.
		
		System.out.println("=============== [3] 함수형을 적용한 코드(제약) ===============\n");
		
		final String result = wordPrefixFreq3();
		System.out.println(result);
	}

}










