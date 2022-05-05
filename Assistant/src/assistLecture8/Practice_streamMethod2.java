package assistLecture8;

import java.util.*;
import java.util.stream.*;

/*
    3. 사용
       : 스트림은 declaration(선언), process(가공), return(반환) 세 부분으로 이루어진다.
       (1) 선언
           · 배열, 컬렉션(list, set, map) 등을 스트림의 형태로 바꾸는 것
           · stream은 재사용이 불가능하므로, 닫히면 다시 생성해주어야 한다.
           a. 컬렉션의 Stream
              - List<String> list = Arrays.asList("a", "b", "c");
                Stream<String> listStream = list.stream();
              # Collection Interface에는 stream()이 정의되어 있기 때문에, 모두 이 메서드로 생성 가능하다.
           b. 배열의 Stream
           	  - Stream<String> stream = Stream.of("a", "b", "c"); // 가변인자
           	  - Stream<String> stream = Stream.of(new String[] {"a", "b", "c"});
           	  - Stream<String> stream = Arrays.stream(new String[] {"a", "b", "c"});
           	  - Stream<String> stream = Arrays.stream(new String[] {"a", "b", "c", 0, 3); // 인덱스 0포함. 3제외
           	  - String[] arr = new String[]{"a", "b", "c"};
           	    Stream<String> stream = Arrays.stream(arr); // 위와 동일하다.
           c. 원시 Stream
              - intStream stream = IntStream.range(4, 10); // 4 이상 10 이하의 숫자를 갖는 IntStream..LongStream, DoubleStream도 사용 가능하다.
       (2) 가공 (중간 연산)
  		   · 원본 데이터를 별도의 데이터로 가공하기 위한 중간 연산
  		   · 연산 결과를 Stream으로 다시 반환하기 때문에 연속해서 중간 연산을 이어갈 수 있다.
  		   a. 필터링 (Filter)
  		   	  · 조건에 맞는 데이터만을 정제하여 더 작은 컬렉션을 만들어내는 연산
  		   	  · Java에서는 filter 함수의 인자로 함수형 인터페이스 Predicate를 받고 있다. (-> 자바가 제공하는 4개의 함수형 인터페이스 중 하나.)
  		   	    따라서, boolean을 반환하는 람다식 작성을 통해 filter함수 구현이 가능해진다.
  		   	  · ex) String의 stream에서 a가 들어간 문자열만을 포함하도록 필터링하는 코드
  		   	       Stream<String> stream = list.stream().filter(name -> name.contains("a"));
  		   b. 데이터 변환 (Map)
  		      · 기존의 stream 요소들을 변환하여 새로운 stream을 형성하는 연산. 저장된 데이터들을 특정한 형태로 변환하는데 주로 사용.
  		      · Java에서는 map 함수의 인자로 함수형 인터페이스 function을 받고 있다.
  		      · ex) String을 요소들로 갖는 stream을 모두 대문자 String의 요소들로 변환
  		           Stream<String> stream = names.stream().map(s->s.toUpperCase());
  		   c. 정렬 (Sort)
  		   	  · Stream의 요소들을 정렬하며, 파라미터로 Comparator을 넘길 수도 있다.
  		   	    Comparator 인자 없이 호출 시, 오름차순이 기본이며, 내림차순으로 정렬하기 위해서는 reverseOrder을 이용하면 된다.
  		   	  · ex) stream에서 String 요소들을 정렬하는 코드
  		   	       List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift")'
  		   	       
  		   	       Stream<String> stream = list.stream().sorted() // 알파벳 기준, 오름차 순 정렬
  		   	       Stream<String> stream = list.stream().sorted(Comparator.reverseOrder()); // 내림차 순 정렬
  		   d. 중복 제거 (Distinct)
  		   	  · 중복된 데이터를 검사하기 위해 Object의 equals() 메서드를 사용한다.
  		   	  · ex) 중복된 stream의 요소들을 제거하는 코드
  		   	       List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift")'
  		   	       
  		   	       Stream<String> stream = list.stream().distinct()
  		   e. 특정 연산 수행 (Peek)
  		   	  · stream 요소들을 대상으로 stream에 영향을 주지 않고 특정 연산을 수행한다.
  		   	  · peek은 "확인한다"라는 의미를 가지며, 말 그대로 특정 작업을 수행하기만 하고 데이터에 영향을 주지 않는다.
  		   	  · peek함수는 파라미터로 함수형 인터페이스 Consumer를 인자로 받는다.
  		   	  . ex) stream 요소들을 중간에 출력시켜보기
  		   	     int sum = IntStream.of(1, 3, 5, 7, 9).peek(System.out::println.sum());
  		   f. 원시 Stream <-> Stream
  		   	  · 일반적인 stream과 원시 stream을 서로 바꾸는 작업
  		   	  · 일반적인 stream이 지원하는 메서드 : mapToInt(), mapToLong(), mapToDouble()
  		   	        원시 stream이 지원하는 메서드 : mapToObject()
  		   	  · ex) intStream -> Stream<Integer>
  		   	  	   IntStream.range(1, 4).mapToObj(i -> "a" + i)
  		   	  · ex) Stream<Double> -> IntStream -> Stream<String>
  		   	       Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i)
  	   (3) 반환
  	   	   · 가공된 데이터로부터 원하는 결과를 만들기 위한 최종 연산
  	   	   · stream의 요소들을 소모하면서 연산이 수행되기 때문에 한 번만 처리 가능하다. 
  	   	   a. 최댓값/최솟값/총합/평균/갯수 (Max/Min/Sum/Average/Count)
  	   	      · max, min, average는 stream이 비어있는 경우 값을 특정할 수 없다.
  	   	      · sum, count는 값이 비어있는 경우 0으로 값을 특정 할 수 있다.
  	   	   b. 데이터 수집 (collect)
  			  · stream 요소들을 list, set, map 등의 다른 종류의 결과로 수집하는 경우에 사용하는 함수
  			  · 어떻게 요소들을 수집할 것인가를 정의한 Collector 타입을 인자로 받아서 처리함.
  			  
  			  · collect() : 스트림 최종연산, 매개변수로 Collector를 필요로 한다.
  			  · Collector : 인터페이스, collect의 파라미터는 이 인터페이스를 구현할 필요가 있다.
  			  · Collectors : 클래스, static 메서드로 미리 작성된 컬렉터를 제공한다.
  			  
  			  <<<< 가정 >>>>
  			  List<Product> productList = Arrays.asList(
  			  	new Product(23, "potatoes"),
  			  	new Product(14, "orange"),
  			  	new Product(13, "lemon"),
  			  	new Product(23, "bread"),
  			  	new Product(13, "sugar")
  			  );
  			  
  		      · Collectors.toList() // Collectors.toSet()
  		        >> List<String> nameList = productList.stream()
  		        									  .map(Product::getName)
  		        									  .collect(Collectors.toList()); // set으로 받고 싶으면, Collectors.toSet()으로 작성하면 된다.
  		      · Collectors.joining() 
  		        - delimiter : 각 요소 중간에 들어가 요소를 구분시켜주는 구분다
  		        - prefix : 결과 맨 앞에 붙는 문자
  		        - suffix : 결과 맨 뒤에 붙는 문자
  		        >> String listToString = productList.stream()
  		        									.map(Product::getName)
  		        									.collect(Collectors.joining()); // potatoesorangelemonbreadsugar
  		        >> String listToString = productList.stream()
  		        									.map(Product::getName)
  		        									.collect(Collectors.joining(" ")); // potatoes orange lemon bread sugar
  		        >> String listToString = productList.stream()
  		        									.map(Product::getName)
  		        									.collect(Collectors.joining(",","<", ">")); // <potatoes, orange, lemon, bread, sugar>
  		      · Collectors.averagingInt(), Collectors.summingInt(). Collectors.summarizingInt()
  		      · Collectors.groupingBy()
  		      · Collectors.partitioningBy()
  		   
  	   	   c. 조건 검사 (Match)
  	   	   
  	   	   d. 특정 연산 수행 (forEach)
  	   	   
  	   	      
 */

// Q. 위 내용을 전부 알면 끝인가요?
// A. 아닙니다. 위의 내용도 정말 대표적인 함수들을 제외하고 모두 빼버렸습니다.
//    생성 파트만 해도 배열이나 컬렉션을 통해서 만드는 게 아니라, 직접 값을 입력해서 바로 스트림 객체를 이용하는 등의
//    정말 여러가지 방법들이 즐비하지만...문제는 양도 너무 많고,
//    람다 함수를 기반으로 깔지 않으면 설명이 불가능해서 전부 버렸습니다.

class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}

public class Practice_streamMethod2 {
	public static void main(String[] args) {

	}

}
