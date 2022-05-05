package ddazua;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

// Set(집합)
// def. 요소들을 집합적으로 모아놓은 자료구조
// (1) 중복을 허용하지 않는다.		(2) 저장 순서를 유지하지 않음.
// 배열과는 다르다. 그저 데이터들을 모아놓은 하나의 주머니라고 생각하면 된다.

// Set을 구현한 클래스 : HashSet, TreeSet

/*
 	[1] HashSet : Set과 동일하게 중복이 없고, 순서가 없다.
 	
 				  <생성자>
 		(1) HashSet()			  : HashSet Class의 default Constructor
 		(2) HashSet(Collection C) : 컬렉션의 요소로 HashSet 객체 생성
 		(3) HashSet(int capacity) : capacity 용량을 갖는 객체 생성
 	  * 중복된 요소 add()시, 집합에 추가 안 되고 false 값 반환!
 		
 	[2] TreeSet : Set과 동일하게 중복이 없으나, 정렬 기능이 추가된 형태 (어째 힙영역 데이터 구조랑 비슷하게 생겼누..)
 		=> 데이터 추가 시, 기준 데이터보다 작다면 기준의 왼쪽에 / 기준 데이터보다 크다면 기준의 오른쪽에 위치
 		=> 이진 탐색 트리의 구조
 	
 */

// List(리스트)
// def. 데이터를 일렬로 늘어놓은 자료구조
// (1) 중복을 허용한다.			(2) 저장 순서가 존재한다.
//  * 배열의 단점 : 크기를 변경할 수 없고, 비순차적인 데이터의 추가 또는 삭제에 시간이 오래 걸린다.

// List 인터페이스를 구현한 클래스 : ArrayList(물리적으로 연결), LinkedList(논리적으로 연결)

/*
   <List 인터페이스의 주요 메서드>
   	(1) add(int index, E elem) : index 위치에 elem 추가
   	(2) get(int index)		   : index 위치에 있는 요소 반환
  	(3) indexOf(Object o)      : 요소 o가 있는 위치 반한
  	(4) listiterator()         : Listiterator() 반환
  	(5) remove(int index)      : index 위치 요소 삭제 후 삭제값 반환
  	(6) set(int index, E elem) : index 위치 요소를 elem으로 변경
  
 */

public class WhatCollectionFramework_Set_List {
	
	public static void main(String[] args) {
		
		// ============== [1] Hash&TreeSet Interface ============== //
		HashSet hs = new HashSet();
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		// Iterator : 바구니 안의 요소들을 하나씩 반복적으로 접근하겠다.
		Iterator it = hs.iterator(); // hs 각각의 객체 값들을 하나씩 가져올 수 있는 객체 it을 만들겠다는 선언
		System.out.println("<HashSet 출력>");
		while(it.hasNext()) { // hasNext() : 해당 객체(hashSet)에서 더이상 가져올 요소가 없을 때까지 반복
			System.out.print(" "+it.next()); // 순서에 규칙이 없다. 정렬의 기준이 없다.
		}
		System.out.println();
		Iterator it2 = ts.iterator();
		System.out.println("<TreeSet 출력>");
		while(it2.hasNext()) {
			System.out.print(" "+it2.next()); // 알파벳 순서로 출력된다. 정렬의 기준은 아스키 코드값이다.
		}
		System.out.println();
		System.out.println("현재 TreeSet의 크기:" + ts.size()); 
		System.out.println();
		
		// ============== [2] ArrayList Interface ============== // 값들이 실제 메모리 상으로 근접하다.
		ArrayList list1 = new ArrayList(10);
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		System.out.println("초기상태: " + list1);
		System.out.print("인덱스 1 위치에 B를 추가: ");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.print("인덱스 2 위치의 값을 삭제: ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2번 위치의 값 반환: " + list1.get(2));
		System.out.println();
		
		// ============== [2] LinkedList Interface ============== // 메모리 상으로 가깝진 않으나 주소값으로 지정한다.
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		long start = System.currentTimeMillis(); // currentTimeMillis : 현재 millis 초 단위를 정수로 반환하겠다.
		for(int i=0; i<100000; i++) {
			al.add(0, String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시간: " + (end-start));
		
		start = System.currentTimeMillis();
		for(int i =0; i< 100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 작업시간: " + (end-start));
		
		/*
		 	<toString()과 String.valueOf()>
		 	공통점 : 두 메소드 모두 Object 값을 String으로 변환한다.
		 	차이점 : - String.valueOf() : 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
		 			 - String() : 대상 값이 null이면 'NullPointerException(NPE)'를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
			
			=> 순차적으로 추가/삭제하는 경우에는 ArrayList가 빠르다. (요소의 재배치가 필요하지 않기 때문), 비효율적인 메모리 사용
			=> 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 빠르다. (요소의 연결만 바꿔주면 되므로), 데이터가 방대할 수록 접근성 하락
	     */
				
	}

}
