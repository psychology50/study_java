package ddazua;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Queue(큐) : 한 쪽 끝에서는 삽입이 다른 쪽 끝에서는 삭제가 일어나는 구조
//     		   (1) 선입선출(FIFO)   (2) front: 삭제, rear: 삽입 
/*
 	<큐와 관련된 메서드>
 	 (1) boolean add(E e)	: 요소 e 추가
 	 (2) E element()		: 제일 상단 요소 반환
 	 (3) E remove()			: 최상단 요소 반환 후 제거
 	 (4) boolean offer(E e) : 요소 e를 추가
 	 (5) E peek()			: 제일 상단 요소 반환
 	 (6) E poll()			: 최상단 요소를 반환 후 제거
    => 큐는 인터페이스이므로, 사용하려면 UpCasting이 필요하다.
    => 큐가 꽉 찬 경우 add는 예외를 발생시키나, offer은 추가 실패를 의미하는 false를 리턴한다.
    
    <큐 사용법> -> UpCasting
     (1) Queue<Element> q = new LinkedList<Element>(); -> 주로 사용하는 방법
     (2) Queue<Element> q = new Array<Element>();
 */

// Stack(스택) : 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
//			     (1) 후입선출(LIFO)   (2) top: 삽입, 삭제   (3) Vector의 자식 클래스
// *** Stack은 Class이다!!!! ***
/*
 	<스택과 관련된 메서드> -> 클래스이므로 바로 사용이 가능하다.
 	 (1) E peek()			  : top 요소를 반환
 	 (2) E pop()			  : top 요소 제거 후 반환
 	 (3) E push(E item)		  : top에 요소 추가
 	 (4) int search(Object O) : 요소 O가 있는지 검색해서 위치 반환
 */


public class WhatCollectionFramework_Queue_Stack {
	public static void main(String[] args) {
		// ============== [1] Queue Interface ============== //
		Queue<String> q = new LinkedList<String>();
		// 1. add(e) : rear 위치에 e 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		
		System.out.println(q);
		// 2. element: front에 위치한 (제일 먼저 저장된) 데이터 반환
		System.out.println("element: " + q.element());
		// 3. peek() : front에 위치한 데이터 값 반환. 큐가 비었으면 null 반환 
		System.out.println("peek: " + q.peek());
		// 4. remove() : front에 위치한 데이터를 삭제
		System.out.println("remove: " + q.remove());
		// 5. offer(e) : rear 위치에 e 추가
		q.offer("tomato");
		System.out.println(q);
		// 6. poll() : front 위치한 데이터를 반환 후 삭제
		System.out.println("poll: " + q.poll());
		System.out.println(q);
		System.out.println();
		
		
		// ============== [2] Stack Class ============== //
		Stack<String> s = new Stack<String>();
		
		s.push("apple"); // 만약 s. 에서 add 메서드를 보면 Vector 클래스의 메서드임을 확인할 수 있다.
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		System.out.println("peek: " + s.peek());
		System.out.println("pop: " + s.pop());   // top의 데이터 삭제
		System.out.println(s);
		s.push("tomato");
		System.out.println(s);	
		System.out.println("search(apple): "+ s.search("apple")); // 주의 apple이 선입이지만 bottom에 있기 때문에 위치는 3이다.
		System.out.println("search(banana): "+s.search("banana"));
		System.out.println("search(tomato): "+s.search("tomato"));
		
	}

}
