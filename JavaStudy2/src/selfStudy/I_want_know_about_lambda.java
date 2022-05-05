package selfStudy;

import java.util.*;

/*
 [1] 람다식(Lambda Expression)
     * Stream 연산은 매개변수로 함수형 인터페이스(Functional Interface)를 받도록 설계되어 있다.
       그리고 람다식은 반환값으로 함수형 인터페이스를 반환하고 있다!!
     1. def
        : 함수를 하나의 식으로 표현한 것
          메소드의 이름이 필요 없기 때문에 익명함수(Anonymous Function)의 한 종류라고 볼 수 있다.
          그리고 익명함수들은 모두 일급 객체이다. (이걸 이해하려면 FunctionalProgramming 소스로 이동...)
    	  일급 객체인 함수는 변수처럼 사용 가능하며, 매개 변수로 전달이 가능하다.
     2. example
        (1) 명령형 언어
            public String hello() {
            	return "Hello World!";
            }
        (2) 람다 방식
            · 구조
              (파라미터, ...) -> (실행문)
            · () -> "Hello World!"
     3. purpose
        · 불필요한 코드를 줄이고, 가독성을 대폭 향상시킨다.
        · 함수형 인터페이스의 인스턴스를 생성하여 함수를 변수처럼 선언하는 람다식에서는 메서드의 이름이 불필요 하다고 여겨 사용하지 않는다.
          * 컴파일러가 문맥을 보고 타입을 추론한다...이게 더 대단한데...?
        · 람다식으로 선언된 함수는 1급 객체이기 때문에 Stream API의 매개변수로 전달이 가능해진다. -> 람다식과 Stream API가 계속 엮이는 이유
     4. 장/단점
        - 특징
          · 람다식 내에서 사용되는 지역변수는 final이 붙지 않아도 상수로 간주된다.
          · 람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.
        - 장점
          · 코드 간결함
          · 식에 개발자의 의도가 명확히 드러나 가독성 증가
          · 함수를 만드는 과정없이 한번에 처리 가능
          · 병렬 프로그래밍이 용이해짐
        - 단점
          · 람다를 사용하면서 만든 익명함수는 재사용이 불가능
          · 디버깅....엄청 어려워진다.
          · 람다를 남발하면 비슷한 함수가 중복 생성되어 코드가 지저분해질 수 있다.
          · 재귀를 만들 때는 부적합하다.
 [2] 함수형 인터페이스 (Functional Interface)
     1. def
        : Java는 기본적으로 객체지향 언어(명령형 프로그래밍)이기 때문에 순수 함수와 일반 함수를 다르게 취급한다.
          따라서, 이를 구분하기 위해 함수형 인터페이스(Functional Interface)가 등장하게 되었다.
          함수를 1급 객체처럼 다룰 수 있게 해주는 어노테이션(주석)으로, 인터페이스에 선언하여 단 하나의 추상 메소드만을 갖도록 제한하는 역할을 한다.
          함수형 인터페이스를 사용하는 이유는 Java 람다식이 함수형 인터페이스를 반환하기 때문이다.
     2. Java에서 제공하는 함수형 인터페이스
        (1) Supplier<T>    
            · 매개변수 없이 반환값만을 갖는 함수형 인터페이스. 
            · T get()을 추상 메서드로 갖는다.
        (2) Consumer<T>
            · 객체 T를 매개변수로 받아서 사용하며, 반환값은 없는 함수형 인터페이스
            · void accept(T t)를 추상 메서드로 갖는다.
            · andThen이라는 함수를 제공한다. -> 하나의 함수가 끝난 후, 다음 Consumer를 연쇄적으로 이용 가능하다.
            · 아래 예제에서는 먼저 accept로 받아들인 Consumer를 먼저 처리하고, andThen으로 받은 두 번째 Consumer를 처리한다.
              함수형에서는 함수는 값의 대입 또는 변경 등이 없기 때문에 첫 번째 Consumer가 split으로 데이터를 변경하였다 하더라도 원본은 유지된다.
        (3) Function<T, R> 
            · 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형 인터페이스
            · Function은 R apply(T t)를 추상 메서드로 갖는다.
            · Consumer와 마찬가지로 andThen을 제공하며, 추가적으로 compose를 제공한다.
              compose는 첫 번째 함수 실행 이전에 먼저 함수를 실행하여 연쇄적으로 연결시켜 준다.
            · indentity 함수가 존재하는데, 자기 자신을 반환하는 static 함수이다.
        (4) Predicate<T>   
            · 객체 T를 매개 변수로 받아 처리한 후, Boolean을 반환한다.
            · Boolean test(T t)을 추상 메서드로 갖고 있다.
     3. 메서드 참조 (Method Reference)
        (1) def.
            : 함수형 인터페이스를 람다식이 아닌 일반 메서드를 참조시켜 선언하는 방법. 3가지 조건을 만족해야한다.
              · 함수형 인터페이스의 매개변수 타입 = 메서드의 매개변수 타입
              · 함수형 인터페이스의 매개변수 개수 = 메서드의 매개변수 개수
              · 함수형 인터페이스의 반환형 = 메서드의 반환형
              참조 가능한 메서드는 '일반 메서드, static 메서드, 생성자'가 있으며 '클래스이름::메서드이름'으로 참조할 수 있다.
              이렇게 참조하면 함수형 인터페이스로 반환이 된다.
        (2) 종류
            - 일반 메서드 참조
              · 3가지 조건 : 매개변수 X, 매개변수 개수 = 0개, 반환형 int 타입
              · String의 length 함수는 매개변수가 없으며, 반환형이 int로 동일하기 때문에 String::length로 메서드 참조가 가능하다.
            - static 메서드 참조
              · ex
                Objects의 isNull은 반환값이 Boolean이며, 매개변수 값은 1개이고, 매개 변수가 Object이므로 Predicate로 참조 가능하다.
            - 생성자 참조
              · 생성자는 new로 생성해주므로 클래스명::new로 참조 가능하다
              · Supplier는 매개변수가 없이 반환값만을 갖는 인터페이스이기 때문에, 매개변수 없이 String 객체를 새롭게 생성하는 String 생성자를 참조하여 선언가능하다.  
 */

public class I_want_know_about_lambda {
	
	// 람다 메서드 사용
	interface methodlf {
		public String call(String val);
	}
	
	// 일반 메서드 사용
	public String call(String val) {
		return val;
	}
	
	// 함수형 인터페이스
	@FunctionalInterface
	interface MyLambdaFunction {
		int max(int a, int b);
	}
	
	// Supplier
	@FunctionalInterface
	public interface Supplier<T> {
		T get();
	}
	
	// Consumer
	@FunctionalInterface
	public interface Consumer<T> {
		void accept(T t);
		
		default Consumer<T> andThen(Consumer<? super T> after) {
			Objects.requireNonNull(after);
			return (T t) -> { accept(t); after.accept(t); };
		}
		
	}
	
	// Function
	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T t);
		
		default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
			Objects.requireNonNull(before);
			return (V v) -> apply(before.apply(v));
		}
		
		default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
			Objects.requireNonNull(after);
			return (T t) -> after.apply(apply(t));
		}
		
		static <T> Function<T, T> identity() {
			return t -> t;
		}
	}
	
	// Predicate
	@FunctionalInterface
	public interface Predicate<T> {
		boolean test(T t);
		
		default Predicate<T> and(Predicate<? super T> other) {
			Objects.requireNonNull(other);
			return (t) -> test(t) && other.test(t);
		}
		
		default Predicate<T> negate() {
			return (t) -> !test(t);
		}
		
		default Predicate<T> or(Predicate<? super T>other) {
			Objects.requireNonNull(other);
			return (t) -> test(t) || other.test(t);
		}
		
		static <T> Predicate<T> isEqual(Object targetRef) {
			return (null == targetRef) ? Objects::isNull : object -> targetRef.equals(object);
		}
	}
	

	
	public static void main(String[] args) {
		// 람다
		// (파라미터명) -> {수행할 코드}
		methodlf Lambda = (val) -> { return val; }; // 매서드 내용 정의
		System.out.println(Lambda.call("람다를 이용한 메서드 호출")); // 람다 메서드 호출
		
		I_want_know_about_lambda t = new I_want_know_about_lambda();
		System.out.println(t.call("일반 메서드 호출")); // 일반 메서드 호출
		
		//
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		list.forEach(val -> System.out.println(val)); // 람다를 이용한 list 출력
		
		//
		
		Map<String, Integer> map = new HashMap<>();
		map.put("zebra", 30);
		map.put("dog", 10);
		map.put("zebra", 30);
		
		// 람다를 이용한 map 출력
		map.forEach((name, number) ->
		{
				if(number > 20) {
					System.out.println(name + " is 20 over!");
				} else {
					System.out.println(name + " number : " + number);
				}
		});
		
		// ============================================================================================== //
		
		System.out.println("\n============ [1] 기존의 익명함수 ============\n");
		
		// 두 값 중 큰 값을 구하는 익명함수
		/*
		System.out.println(new MyLambdaFunction() {
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		}.max(3, 5));
		*/
		
		System.out.println("\n============ [2] 람다식을 이용한 익명함수 ============\n");
		
		MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
		System.out.println(lambdaFunction.max(3, 5));
		
		// 함수를 변수처럼 선언할 수 있게 되었다.
		// 코드가 간결해졌다.
		// 람다식으로 생성된 순수 함수는 함수형 인터페이스로만 선언이 가능하며,
		// @FunctionalInterface는 해당 인터페이스가 1개의 함수만을 갖도록 제한하기 때문에, 여러 개의 함수를 선언하면 컴파일 에러가 발생한다.
		
		// ============================================================================================== //
		
		System.out.println("\n====== (1) Supplier <T> ======\n");
		
		Supplier<String> supplier = () -> "Hello World!";
		System.out.println(supplier.get());
		
		System.out.println("\n====== (2) Consumer <T> ======\n");
		
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
		consumer.andThen(System.out::print).accept("Hello World");
		
		System.out.println("\n====== (3) Function <T> ======\n");
		
		Function<String, Integer> function = str -> str.length();
		function.apply("Hello World");
		
		System.out.println("\n====== (4) Predicate <T> ======\n");
		
		Predicate<String> predicate = (str) -> str.equals("Hello World");
		predicate.test("Hello World");
		
		// ============================================================================================== //
		
		System.out.println("\n======= <1> 일반 메서드 참조 =======\n");
		
		// 기존의 람다식
		Function<String, Integer> function2 = (str) -> str.length();
		function.apply("Hello World");
		
		// 메서드 참조
		Function<String, Integer> function3 = String::length;
		function.apply("Hello World");
		
		// ------ 추가 예시
		
		// System.out.println() 메서드는 반환형이 void이며, 파라미터로 String을 받는 메서드이다.
		//그렇기 때문에 Consumer에 System.out.prinln() 메서드를 참조시킬 수 있다.
		
		// 일반 메서드를 참조하여 Consumer를 선언한다.
		Consumer<String> consumer2 = System.out::println;
		consumer2.accept("Hello World!");
		
		// 메서드 참조를 통해 Consumer를 매개변수로 받는 forEach를 쉽게 사용할 수 있다.
		List<String> list2 = Arrays.asList("red", "orange", "yellow", "green", "blue");
		list2.forEach(System.out::println);
		
		/*
		// interface Iterable<T>
		public interface Iterable<T> {
		
			default void forEach(Consumer<? super T> action) {
				Objects.requireNonNull(action);
				for(T t : this) {
					action.accept(t);
				}
			}
		} 	  
		 */
		
		System.out.println("\n======= <2> static 메서드 참조 =======\n");
		
		Predicate<Boolean> predicate2 = Objects::isNull;
		
		/*
		// isNull함수
		public static boolean isNull(Object obj) {
			return obj == null;
		}
		*/
		System.out.println("\n======= <3> 생성자 참조 =======\n");
		
		Supplier<String> supplier2 = String::new;
		
	}

}
